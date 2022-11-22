package es.redegal.prueba.ecomerceservice.service;

import es.redegal.prueba.ecomerceservice.model.Price;
import es.redegal.prueba.ecomerceservice.model.dao.PriceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    PriceDao priceDao;

    @Override
    public List<Price> findAllPrices() {
        return priceDao.findAll();
    }

    @Override
    public List<Price> findPricesByParams() {
        return null;
    }
}
