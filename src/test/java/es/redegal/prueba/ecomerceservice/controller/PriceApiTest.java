package es.redegal.prueba.ecomerceservice.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import es.redegal.prueba.ecomerceservice.service.dto.PriceDto;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest()
@AutoConfigureMockMvc
public class PriceApiTest {

    private static final String queryRequest = "/api/price?brandId=brandIdParam&productId=productIdParam&date=dateParam";
    public static final String BRAND_ID_PARAM = "brandIdParam";
    public static final String PRODUCT_ID_PARAM = "productIdParam";
    public static final String DATE_PARAM = "dateParam";
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper mapper;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");

    @BeforeClass
    public static void setUp(){
//        mapper.setDateFormat(dateFormat);
    }
    @Test
    public void testGetRequest1(){
        try {
            String request = queryRequest.replace(BRAND_ID_PARAM,"1");
            request = request.replace(PRODUCT_ID_PARAM,"35455");
            request = request.replace(DATE_PARAM, "2020-06-14 10:00" );
            MvcResult result = this.mockMvc.perform(MockMvcRequestBuilders.get(request)
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                    .andDo(print())
                    .andReturn();
            PriceDto expected = createPriceDto("2020-06-14 00:00:00","2020-12-31 23:59:59", 0,1,35.50);
            PriceDto responseContent = mapper.readValue(result.getResponse().getContentAsString(), PriceDto.class);
            Assert.assertEquals(expected, responseContent);
        } catch (Exception e) {
            Assert.fail("Exception: " +e.toString() + " catched");
        }
    }
    

    @Test
    public void testGetRequest2(){
        try {
            String request = queryRequest.replace(BRAND_ID_PARAM,"1");
            request = request.replace(PRODUCT_ID_PARAM,"35455");
            request = request.replace(DATE_PARAM, "2020-06-14 16:00" );
            MvcResult result = this.mockMvc.perform(MockMvcRequestBuilders.get(request)
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                    .andDo(print())
                    .andReturn();
            PriceDto expected = createPriceDto("2020-06-14 15:00:00","2020-06-14 18:30:00",1,2,25.45);
            PriceDto responseContent = mapper.readValue(result.getResponse().getContentAsString(), PriceDto.class);
            Assert.assertEquals(expected, responseContent);
        } catch (Exception e) {
            Assert.fail("Exception " +e.getMessage() + " catched");
        }
    }

    @Test
    public void testGetRequest3(){
        try {
            String request = queryRequest.replace(BRAND_ID_PARAM,"1");
            request = request.replace(PRODUCT_ID_PARAM,"35455");
            request = request.replace(DATE_PARAM, "2020-06-14 21:00" );
            MvcResult result = this.mockMvc.perform(MockMvcRequestBuilders.get(request)
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                    .andDo(print())
                    .andReturn();
            PriceDto expected = createPriceDto("2020-06-14 00:00:00","2020-12-31 23:59:59",0,1,35.50);
            PriceDto responseContent = mapper.readValue(result.getResponse().getContentAsString(), PriceDto.class);
            Assert.assertEquals(expected, responseContent);
        } catch (Exception e) {
            Assert.fail("Exception " +e.getMessage() + " catched");
        }
    }

    @Test
    public void testGetRequest4(){
        try {
            String request = queryRequest.replace(BRAND_ID_PARAM,"1");
            request = request.replace(PRODUCT_ID_PARAM,"35455");
            request = request.replace(DATE_PARAM, "2020-06-15 10:00" );
            MvcResult result = this.mockMvc.perform(MockMvcRequestBuilders.get(request)
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                    .andDo(print())
                    .andReturn();
            PriceDto expected = createPriceDto("2020-06-15 00:00:00","2020-06-15 11:00:00",1,3,30.50);
            PriceDto responseContent = mapper.readValue(result.getResponse().getContentAsString(), PriceDto.class);
            Assert.assertEquals(expected, responseContent);
        } catch (Exception e) {
            Assert.fail("Exception " +e.getMessage() + " catched");
        }
    }

    @Test
    public void testGetRequest5(){
        try {
            String request = queryRequest.replace(BRAND_ID_PARAM,"1");
            request = request.replace(PRODUCT_ID_PARAM,"35455");
            request = request.replace(DATE_PARAM, "2020-06-16 21:00:00" );
            MvcResult result = this.mockMvc.perform(MockMvcRequestBuilders.get(request)
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                    .andDo(print())
                    .andReturn();
            PriceDto expected = createPriceDto("2020-06-15 16:00:00","2020-12-31 23:59:59",1,4,38.95);
            PriceDto responseContent = mapper.readValue(result.getResponse().getContentAsString(), PriceDto.class);
            Assert.assertEquals(expected, responseContent);
        } catch (Exception e) {
            Assert.fail("Exception " +e.getMessage() + " catched");
        }
    }

    private static PriceDto createPriceDto(String startDate, String endDate, Integer priority, Integer priceList, Double price) throws ParseException {
        PriceDto expected = new PriceDto();
        expected.setBrandId(1);
        expected.setProductId(35455);
        expected.setStartDate(dateFormat.parse(startDate));
        expected.setEndDate(dateFormat.parse(endDate));
        expected.setPriceList(priceList);
        expected.setPriority(priority);
        expected.setPrice(price);
        expected.setCurr("EUR");
        return expected;
    }
}
