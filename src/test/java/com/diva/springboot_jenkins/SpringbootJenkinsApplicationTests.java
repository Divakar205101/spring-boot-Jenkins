package com.diva.springboot_jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJenkinsApplicationTests {
	
	private static final Logger log = LoggerFactory.getLogger(SpringbootJenkinsApplication.class);

	@Test
	void contextLoads() {
		log.info("test case executed......");
		log.info("pipe line added......");
		assertEquals(true, true);
	}

}
