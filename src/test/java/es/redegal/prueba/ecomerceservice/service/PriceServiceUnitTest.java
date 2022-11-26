package es.redegal.prueba.ecomerceservice.service;

import es.redegal.prueba.ecomerceservice.model.Price;
import es.redegal.prueba.ecomerceservice.model.dao.PriceDao;
import es.redegal.prueba.ecomerceservice.service.dto.PriceDto;
import es.redegal.prueba.ecomerceservice.service.exception.ProductPriceNotFoundException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.jdbc.core.simple.SimpleJdbcCallOperations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class PriceServiceUnitTest {

    @Mock
    PriceDao priceDao;
    @InjectMocks
    PriceServiceImpl priceService;

    @Before
    public void setUp() throws Exception {
        List<Price> priceList = new ArrayList<>();
        priceList.add(createPrice(1,1,0,1.0));
        priceList.add(createPrice(1,1,1,20.0));
        priceList.add(createPrice(1,1,3,5.0));

        Mockito.when(priceDao.findByParams(Mockito.eq(1),Mockito.eq(1),Mockito.any(Date.class))).thenReturn(priceList);
    }

    private static Price createPrice(Integer brandId, Integer productId, Integer priority,Double price) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Price priceEntity = new Price();
        priceEntity.setBrandId(brandId);
        priceEntity.setStartDate(format.parse("2022-01-01 00:00:00"));
        priceEntity.setEndDate(format.parse("2022-12-31 23:00:59"));
        priceEntity.setProductId(productId);
        priceEntity.setPrice(price);
        priceEntity.setPriority(priority);
        return priceEntity;
    }


    @Test
    public void testFindPriceByParams() {
        Integer brandId=1;
        Integer productId=1;
        Date data = new Date();
        PriceDto result = priceService.findPriceByParams(brandId,productId,data);
        Assert.assertNotNull(result);
        Integer priorityExpected = new Integer(3);
        Assert.assertEquals(priorityExpected,result.getPriority());
        Double priceExpected = new Double(5.0);
        Assert.assertEquals(priceExpected,result.getPrice());
    }

    @Test(expected = ProductPriceNotFoundException.class)
    public void testFindPriceByParamsError() {
        Integer brandId=2;
        Integer productId=2;
        Date data = new Date();
        PriceDto result = priceService.findPriceByParams(brandId,productId,data);
    }

}