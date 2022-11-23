package es.redegal.prueba.ecomerceservice.model.dao;

import es.redegal.prueba.ecomerceservice.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface PriceDao extends JpaRepository<Price,Integer> {
    @Query("SELECT p FROM Price p " +
            "WHERE p.brandId = :brandId " +
            "AND p.productId = :productId " +
            "AND p.startDate <= :date AND p.endDate>= :date " +
            "ORDER BY p.priority DESC")
    public List<Price> findByParams(@Param("brandId") Integer brandId, @Param("productId") Integer productId, @Param("date") Date date);
}
