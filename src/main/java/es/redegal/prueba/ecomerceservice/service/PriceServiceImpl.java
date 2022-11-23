package es.redegal.prueba.ecomerceservice.service;

import es.redegal.prueba.ecomerceservice.model.Price;
import es.redegal.prueba.ecomerceservice.model.dao.PriceDao;
import es.redegal.prueba.ecomerceservice.service.dto.PriceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    PriceDao priceDao;

    @Override
    public List<PriceDto> findAllPrices() {
        List<Price> listPrices = priceDao.findAll();
        List<PriceDto> listPricesDto = new ArrayList<>();
        for(Price price: listPrices){
            listPricesDto.add(mapToPriceDto(price));
        }
        return listPricesDto;
    }

    private PriceDto mapToPriceDto(Price price) {
        PriceDto priceDto = new PriceDto();
        priceDto.setBrandId(price.getBrandId());
        priceDto.setStartDate(price.getStartDate());
        priceDto.setEndDate(price.getEndDate());
        priceDto.setPriceList(price.getPriceList());
        priceDto.setProductId(price.getProductId());
        priceDto.setPrice(price.getPrice());
        priceDto.setCurr(price.getCurr());
        return priceDto;
    }

    @Override
    public PriceDto findPriceByParams(Integer brandId, Integer product_id, Date date) {

        List<Price> listPrices = priceDao.findByParams(brandId,product_id,date);

        return mapToPriceDto(listPrices.stream().findFirst().get());
    }
}
