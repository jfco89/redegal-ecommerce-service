package es.redegal.prueba.ecomerceservice.controller;


import es.redegal.prueba.ecomerceservice.service.PriceService;
import es.redegal.prueba.ecomerceservice.service.dto.PriceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
public class PriceApi {

    @Autowired
    private PriceService priceService;

    @GetMapping("/")
    public String index(){
        return "Hello World";
    }

    @GetMapping("/price")
    public PriceDto findPrices(){
        Calendar c = Calendar.getInstance();
        c.set(2020,6,15);
        Date d = c.getTime();
        return priceService.findPriceByParams(1,35455,d);

    }
}
