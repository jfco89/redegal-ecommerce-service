package es.redegal.prueba.ecomerceservice.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringRunner.class)
@SpringBootTest()
@AutoConfigureMockMvc
public class PriceApiTest {

    private static final String queryRequest1 = "brandId=1&productId=35455&date=2020-06-14 10:00:00";
    private static final String queryRequest2 = "brandId=1&productId=35455&date=2020-06-14 16:00:00";
    private static final String queryRequest3 = "brandId=1&productId=35455&date=2020-06-14 21:00:00";
    private static final String queryRequest4 = "brandId=1&productId=35455&date=2020-06-15 10:00:00";
    private static final String queryRequest5 = "brandId=1&productId=35455&date=2020-06-16 21:00:00";
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetRequest(){
        try {
            MvcResult result1 = this.mockMvc.perform(MockMvcRequestBuilders.get("/price?"+queryRequest1)).
                    andDo(print()).andReturn();
            MvcResult result2 = this.mockMvc.perform(MockMvcRequestBuilders.get("/price?"+queryRequest2)).
                    andDo(print()).andReturn();
            MvcResult result3 = this.mockMvc.perform(MockMvcRequestBuilders.get("/price?"+queryRequest3)).
                    andDo(print()).andReturn();
            MvcResult result4 = this.mockMvc.perform(MockMvcRequestBuilders.get("/price?"+queryRequest4)).
                    andDo(print()).andReturn();
            MvcResult result5 = this.mockMvc.perform(MockMvcRequestBuilders.get("/price?"+queryRequest5)).
                    andDo(print()).andReturn();
        } catch (Exception e) {
            //TODO
        }
    }
}
