package com.revature.hydra.exceptions;

import static org.junit.Assert.*;

import org.junit.Test;

public class PDFGenerationExceptionTest {

	@Test(expected=PDFGenerationException.class)
	public void testExceptio() throws Exception {
		throw new PDFGenerationException();
	}

}
