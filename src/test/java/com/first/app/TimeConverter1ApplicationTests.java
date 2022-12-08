package com.first.app;

import java.time.LocalTime;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.first.app.model.MyTime;
import com.first.app.service.TimeService;
import com.first.app.service.impl.TimeServiceImpl;

@SpringBootTest
class TimeConverter1ApplicationTests {
	
	TimeService ts=new TimeServiceImpl();
	LocalTime lt=LocalTime.now();

	@Test
	void contextLoads() {
		String result=ts.convertTimeToString(lt);
		Assertions.assertEquals("Its Twenty two:Forty",result);
		

		
	}
	
	@Test
	void StringNotNull() {
		String result=ts.convertTimeToString(lt);
		Assertions.fail("Failed result");;
	}

}
