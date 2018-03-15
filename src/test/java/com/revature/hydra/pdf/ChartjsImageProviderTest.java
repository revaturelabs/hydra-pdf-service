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
	
	@Test
	public void testRetrieveWithString() {
		assertNotNull(provider.retrieve(String.valueOf("data:image/png;base64, iVBORw0KGgoAAAANSUhEUgAAAAUA"
				+ "AAAFCAYAAACNbyblAAAAHElEQVQI12P4//8/w38GIAXDIBKE0DHxgljNBAAO"
			    + "9TXL0Y4OHwAAAABJRU5ErkJggg==")));
	}

	@Test(expected=PDFGenerationException.class)
	public void testGetImageRootPath() {
		provider.getImageRootPath();
	} 

}
