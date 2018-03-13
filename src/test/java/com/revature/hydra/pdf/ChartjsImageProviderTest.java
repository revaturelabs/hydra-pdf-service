package com.revature.hydra.pdf;

import static org.junit.Assert.*;

import org.junit.Test;

import com.revature.hydra.exceptions.PDFGenerationException;

public class ChartjsImageProviderTest {
	ChartjsImageProvider provider = new ChartjsImageProvider();
	
	@Test
	public void testRetrieve() {
		provider.retrieve("ditto");
	}

	@Test(expected=PDFGenerationException.class)
	public void testGetImageRootPath() {
		provider.getImageRootPath();
	} 

}
