package com.first.app.service;

import java.time.LocalTime;

import com.first.app.model.MyTime;

public interface TimeService {
	//MyTime convertTime(LocalTime lt);
	String convertTimeToString(LocalTime fmt);

}
