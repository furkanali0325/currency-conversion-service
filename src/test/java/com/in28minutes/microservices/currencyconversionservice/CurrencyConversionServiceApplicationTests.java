package com.in28minutes.microservices.currencyconversionservice;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
@Slf4j
class CurrencyConversionServiceApplicationTests {

	@Test
	void contextLoads() {
		log.info("First test is under execution");
		Assertions.assertEquals(true,true);

	}

}
