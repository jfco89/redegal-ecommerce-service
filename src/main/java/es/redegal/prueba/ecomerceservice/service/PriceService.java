package es.redegal.prueba.ecomerceservice.service;

import es.redegal.prueba.ecomerceservice.service.dto.PriceDto;

import java.util.Date;

public interface PriceService {

    public PriceDto findPriceByParams(Integer brandId, Integer product_id, Date date);
}
