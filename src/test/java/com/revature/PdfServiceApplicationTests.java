package com.revature;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.revature.hydra.PdfServiceApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { PdfServiceApplicationTests.class })
public class PdfServiceApplicationTests {

	@Test
	public void contextLoads() throws Exception{
	}

	@Test
	public void testApi() throws Exception{
		PdfServiceApplication app = new PdfServiceApplication();
		
		assertNotNull(app.api());
	}
}
