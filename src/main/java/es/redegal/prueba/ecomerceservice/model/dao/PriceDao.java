package es.redegal.prueba.ecomerceservice.model.dao;

import es.redegal.prueba.ecomerceservice.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PriceDao extends JpaRepository<Price,Integer> {
//    public List<Price> findAllPrices();
}
