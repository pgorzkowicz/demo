package com.prime.demo.integration;

import com.prime.demo.DemoApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@EnableAutoConfiguration
@SpringBootTest(classes = DemoApplication.class)
@AutoConfigureMockMvc
class DemoApplicationTests {

	@Autowired
	protected MockMvc mvc;

	@Test
	public void getPrimeList() throws Exception {
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("/prime/5")
				.accept(MediaType.APPLICATION_JSON)).andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
	}

	@Test
	public void testPrimesEndPointWithLimit() throws Exception {
		mvc.perform(get("/prime/5").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(content().json("{\"limit\":5,\"primeList\":[2,3,5]}"));
	}
}