package com.myproject.jenkinsdemo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;

@SpringBootTest
class SpringJenkinsApplicationTests {

	public static Logger logger=LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("Test case executing....");
		assertEquals(true,true);
	}
	

}
