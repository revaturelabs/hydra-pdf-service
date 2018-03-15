package com.revature.hydra.pdf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;

public class RevaturePDFTest {
	
	@Test
	public void testRevaturePDF() throws Exception{
		try {
		new RevaturePDF("testTitle", "<html><head><title>Title</title></head></html>");
		}catch(Exception e) {
			fail("Constructor has thrown an exception.");
		}
	}

	@Test
	public void testToByteArray() throws Exception{
		RevaturePDF pdf = new RevaturePDF("testTitle", "<html><head><title>Title</title></head></html>");
		
		assertNotNull(pdf.toByteArray());
	}

}
