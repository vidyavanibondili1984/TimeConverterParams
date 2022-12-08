package com.first.app.controller;
import java.sql.Timestamp;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.first.app.model.MyTime;
import com.first.app.service.TimeService;



@RestController
@RequestMapping("/default")
public class TimeController {
	TimeService hss; 
	public TimeController(TimeService hss) {
		super();
		this.hss = hss;
	}
	@GetMapping("/hello")
	public String hello() {
		return "Welcome to SPring boot REST API application";
	}

	/*@RequestMapping(value="/fetch/{time}", method=RequestMethod.GET)
	@ResponseBody
	public String testResult(@PathVariable("time") @DateTimeFormat(pattern="HH:mm") LocalTime time)
	{
		System.out.println("ENtered");
		System.out.println(time);
		String str=hss.convertTimeToString(time);
		//return "time="+time.toString();
		
		return str;
	}*/
	
	//http://localhost:8080/default/fetch/?time={{timestamp}}
	//In postman set Pre-request script as const moment = require('moment');
	   //pm.globals.set("timestamp", moment().format("HH:mm:ss"));
	// then under params set key as time and value as {{timestamp}}
	@RequestMapping(value="/fetch/", method=RequestMethod.GET )
	@ResponseBody
	public String testResult(@RequestParam("time") @DateTimeFormat(pattern="HH:mm:ss") LocalTime time)
	{
		
		System.out.println("ENtered");
		String mytime=hss.convertTimeToString(time);
		
		//String str=mytime.getLocTime();
		return mytime;
	}
	
}

