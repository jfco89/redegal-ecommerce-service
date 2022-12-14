package es.redegal.prueba.ecomerceservice.controller;


import es.redegal.prueba.ecomerceservice.service.PriceService;
import es.redegal.prueba.ecomerceservice.service.dto.PriceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController()
@RequestMapping("/api/v1")
public class PriceApi {

    @Autowired
    private PriceService priceService;

    @GetMapping("/")
    public String index(){
        return "Hello World";
    }

    @GetMapping("/price")
    public ResponseEntity<PriceDto> findPrices(@RequestParam("brandId")Integer brandId,
                                              @RequestParam("productId")Integer productId,
                                              @RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") Date date){

        PriceDto priceDto = priceService.findPriceByParams(brandId,productId,date);
        return new ResponseEntity<>(priceDto, HttpStatus.OK);

    }
}
