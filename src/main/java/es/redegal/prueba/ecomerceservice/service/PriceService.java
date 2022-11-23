package es.redegal.prueba.ecomerceservice.service;

import es.redegal.prueba.ecomerceservice.model.Price;
import es.redegal.prueba.ecomerceservice.service.dto.PriceDto;

import java.util.Date;
import java.util.List;

public interface PriceService {

    public List<PriceDto> findAllPrices();
    public PriceDto findPriceByParams(Integer brandId, Integer product_id, Date date);
}
