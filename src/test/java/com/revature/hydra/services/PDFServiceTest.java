package com.revature.hydra.services;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.itextpdf.text.DocumentException;

public class PDFServiceTest {

	@Test
	public void testGeneratePDF() throws DocumentException, IOException {
		PDFService service = new PDFService();
		assertNotNull(service.generatePDF("testTitle", "<html><head><title>Title</title></head></html>"));
	}

}
