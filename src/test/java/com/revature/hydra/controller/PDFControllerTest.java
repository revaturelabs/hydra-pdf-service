package com.revature.hydra.controller;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.revature.hydra.services.PDFService;

public class PDFControllerTest {

	private MockMvc mockMvc;
	
	@Mock
	private PDFService service;
	
	@InjectMocks
	private PDFController controller;
	
	@Before
	public void setup() throws Exception {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}
	
	@Test
	public void testSetPdfService() throws Exception{
		controller.setPdfService(service);
	}

	@Test
	public void testGenerate() throws Exception {
		mockMvc.perform(post("/report/generate"))
		.andExpect(status().isOk());
	}

}
