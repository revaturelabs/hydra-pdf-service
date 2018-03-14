package com.revature.hydra.pdf;

import static org.junit.Assert.*;

import org.junit.Test;

import com.revature.hydra.exceptions.PDFGenerationException;
import com.revature.hydra.exceptions.PDFGenerationExceptionTest;

public class ChartjsImageProviderTest {
	ChartjsImageProvider provider = new ChartjsImageProvider();
	
	@Test(expected=PDFGenerationException.class)
	public void testRetrieveError() {
		provider.retrieve("nonworking");
	}

	@Test(expected=PDFGenerationException.class)
	public void testGetImageRootPath() {
		provider.getImageRootPath();
	} 

}
