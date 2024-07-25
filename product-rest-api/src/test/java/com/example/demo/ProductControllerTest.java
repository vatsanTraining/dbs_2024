package com.example.demo;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.example.demo.entity.Product;
import com.example.demo.services.ProductService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest
public class ProductControllerTest {

	
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService service;


    @Autowired
    private ObjectMapper objectMapper;
	
    @Test
    public void testGetProductById() throws Exception {
    	
        Product mockProduct = new Product(100, "Fridge",5600);
        
        when(service.findById(100)).thenReturn(mockProduct);

        mockMvc.perform(get("/api/v1/products/100"))
                .andExpect(status().is(200))
                .andExpect(jsonPath("$.productId").value(100))
                .andExpect(jsonPath("$.productName").value("Fridge"));
    }

    
    @Test
    public void testPostProduct() throws Exception{

        Product product = new Product(102,"tv",4500);
        
        // given 
        given(service.save(any(Product.class)))
                .willAnswer((invocation)-> invocation.getArgument(0));

        //when
        ResultActions response = mockMvc.perform(post("/api/v1/products")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(product)));

//then
        response.andDo(print()).
                andExpect(status().isCreated())
                .andExpect(jsonPath("$.productId", is(product.getProductId())))
                .andExpect(jsonPath("$.productName",
                        is(product.getProductName())))
                .andExpect(jsonPath("$.ratePerUnit",
                        is(product.getRatePerUnit())));
             

    }
    
    @Test
  public void testGetAll() throws Exception{

  	  List<Product> listOfproducts = new ArrayList<>();
  	  
      listOfproducts.add(new Product(102,"tv",4500));
      listOfproducts.add(new Product(101,"printer",5500));
      listOfproducts.add(new Product(103,"ups",6500));
      
      
      		//given
      given(service.findAll()).willReturn(listOfproducts);

      //when
      ResultActions response = mockMvc.perform(get("/api/v1/products"));

      //then
      response.andExpect(status().isOk())
              .andDo(print())
              .andExpect(jsonPath("$.size()",
                      is(listOfproducts.size())));

  }
    @Test
	    public void testDelete() throws Exception{
  	  
	        int productId = 100;
	
	        //given
	          given(service.remove(productId)).willReturn(true);
//when
	        
	        ResultActions response = mockMvc.perform(delete("/api/v1/products/{id}", productId));
//then	
	        response.andExpect(status().isOk())
	                .andDo(print());
	    }


}
