package es.redegal.prueba.ecomerceservice.service;

import es.redegal.prueba.ecomerceservice.model.Price;
import es.redegal.prueba.ecomerceservice.model.dao.PriceDao;
import es.redegal.prueba.ecomerceservice.service.dto.PriceDto;
import es.redegal.prueba.ecomerceservice.service.exception.ProductPriceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    PriceDao priceDao;

    @Override
    public PriceDto findPriceByParams(Integer brandId, Integer product_id, Date date) {

        List<Price> listPrices = priceDao.findByParams(brandId,product_id,date);

        Price price = listPrices.stream().max(Comparator.comparing(p -> p.getPriority())).orElse(null);
        if(price == null){
            throw new ProductPriceNotFoundException();
        }
        return mapToPriceDto(price);
    }

    private PriceDto mapToPriceDto(Price price) {
        //TODO cambiar por mapstrut
        PriceDto priceDto = new PriceDto();
        priceDto.setBrandId(price.getBrandId());
        priceDto.setStartDate(price.getStartDate());
        priceDto.setEndDate(price.getEndDate());
        priceDto.setPriceList(price.getPriceList());
        priceDto.setProductId(price.getProductId());
        priceDto.setPriority(price.getPriority());
        priceDto.setPrice(price.getPrice());
        priceDto.setCurr(price.getCurr());
        return priceDto;
    }
}
