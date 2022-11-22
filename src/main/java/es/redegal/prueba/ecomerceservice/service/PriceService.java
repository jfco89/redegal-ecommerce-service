package es.redegal.prueba.ecomerceservice.service;

import es.redegal.prueba.ecomerceservice.model.Price;

import java.util.List;

public interface PriceService {

    public List<Price> findAllPrices();
    public List<Price> findPricesByParams();
}
