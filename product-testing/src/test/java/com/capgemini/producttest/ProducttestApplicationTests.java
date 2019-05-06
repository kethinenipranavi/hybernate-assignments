package com.capgemini.producttest;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.capgemini.producttest.entity.Product;
import com.capgemini.producttest.service.ProductService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ProducttestApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ProductService service;
	/*
	 * @Test public void contextLoads() { }
	 */

	@Test
	public void testAddNewProduct() throws Exception {
		Product putProduct = new Product(1, "Soap", 10);
		Product mockProduct = new Product(1, "Soap", 10);
		doReturn(mockProduct).when(service).addProduct(any());

		this.mockMvc.perform(post("/new").contentType(MediaType.APPLICATION_JSON).content(asJsonString(putProduct)))
				.andExpect(status().isOk()).andExpect(jsonPath("$.id", is(1))).andExpect(jsonPath("$.name", is("Soap")))
				.andExpect(jsonPath("$.quantity", is(10)));
	}

	@Test
	public void testReadProductSuccess() throws Exception {
		Product mockProduct = new Product(1, "Soap", 10);
		doReturn(Optional.of(mockProduct)).when(service).findProductById(1);

		this.mockMvc.perform(get("/get/1")).andExpect(status().isOk()).andExpect(jsonPath("$.id", is(1)))
				.andExpect(jsonPath("$.name", is("Soap"))).andExpect(jsonPath("$.quantity", is(10)));
	}
	
	@Test
	public void testReadProductNotFound() throws Exception {
		doReturn(Optional.empty()).when(service).findProductById(1);

		this.mockMvc.perform(get("/get/1")).andExpect(status().isNotFound());
	}

	@Test
	public void testUpdateProduct() throws Exception {
		Product putProduct = new Product(1, "Soap", 15);
		Product mockProduct = new Product(1, "Soap", 10);

		doReturn(Optional.of(mockProduct)).when(service).findProductById(1);
		doReturn(true).when(service).updateProduct(any());

		this.mockMvc.perform(put("/update/1").contentType(MediaType.APPLICATION_JSON).content(asJsonString(putProduct)))
				.andExpect(status().isOk()).andExpect(jsonPath("$.id", is(1))).andExpect(jsonPath("$.name", is("Soap")))
				.andExpect(jsonPath("$.quantity", is(15)));
	}

	@Test
	public void testUpdateProductNotFound() throws Exception {
		Product putProduct = new Product(1, "Soap", 15);

		doReturn(Optional.empty()).when(service).findProductById(1);
		doReturn(false).when(service).updateProduct(any());

		this.mockMvc.perform(put("/update/1").contentType(MediaType.APPLICATION_JSON).content(asJsonString(putProduct)))
				.andDo(print()).andExpect(status().isNotFound());
	}

	@Test
	public void testDeleteProduct() throws Exception {
		doReturn(true).when(service).deleteProduct(1);

		this.mockMvc.perform(delete("/delete/1")).andExpect(status().isOk());
	}

	@Test
	public void testDeleteProductNotFound() throws Exception {
		doReturn(false).when(service).deleteProduct(1);

		this.mockMvc.perform(delete("/delete/1")).andExpect(status().isNotFound());
	}

	static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
