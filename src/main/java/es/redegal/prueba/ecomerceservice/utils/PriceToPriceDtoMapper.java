package es.redegal.prueba.ecomerceservice.utils;

import es.redegal.prueba.ecomerceservice.model.Price;
import es.redegal.prueba.ecomerceservice.service.dto.PriceDto;

public interface PriceToPriceDtoMapper {
    PriceDto mapToPriceDto(Price price);
}
