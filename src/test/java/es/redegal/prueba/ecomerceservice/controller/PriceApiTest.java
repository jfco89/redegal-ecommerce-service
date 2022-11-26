package es.redegal.prueba.ecomerceservice.controller;

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

    @Test
    public void testGetRequest1(){
        try {
            String request = queryRequest.replace(BRAND_ID_PARAM,"1");
            request = request.replace(PRODUCT_ID_PARAM,"35455");
            request = request.replace(DATE_PARAM, "2020-06-14 10:00:00" );
            MvcResult result = this.mockMvc.perform(MockMvcRequestBuilders.get(request)
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                    .andDo(print())
                    .andReturn();
        } catch (Exception e) {
            //TODO
        }
    }

    @Test
    public void testGetRequest2(){
        try {
            String request = queryRequest.replace(BRAND_ID_PARAM,"1");
            request = request.replace(PRODUCT_ID_PARAM,"35455");
            request = request.replace(DATE_PARAM, "2020-06-14 16:00:00" );
            MvcResult result = this.mockMvc.perform(MockMvcRequestBuilders.get(request)
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                    .andDo(print())
                    .andReturn();
        } catch (Exception e) {
            //TODO
        }
    }

    @Test
    public void testGetRequest3(){
        try {
            String request = queryRequest.replace(BRAND_ID_PARAM,"1");
            request = request.replace(PRODUCT_ID_PARAM,"35455");
            request = request.replace(DATE_PARAM, "2020-06-14 21:00:00" );
            MvcResult result = this.mockMvc.perform(MockMvcRequestBuilders.get(request)
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                    .andDo(print())
                    .andReturn();
        } catch (Exception e) {
            //TODO
        }
    }

    @Test
    public void testGetRequest4(){
        try {
            String request = queryRequest.replace(BRAND_ID_PARAM,"1");
            request = request.replace(PRODUCT_ID_PARAM,"35455");
            request = request.replace(DATE_PARAM, "2020-06-15 10:00:00" );
            MvcResult result = this.mockMvc.perform(MockMvcRequestBuilders.get(request)
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                    .andDo(print())
                    .andReturn();
        } catch (Exception e) {
            //TODO
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
        } catch (Exception e) {
            //TODO
        }
    }
}
