package com.first.app.service.impl;

import org.springframework.stereotype.Service;

import com.first.app.model.MyTime;
import com.first.app.service.TimeService;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

@Service
public class TimeServiceImpl implements TimeService {

	
	
	

	@Override
	/*public MyTime convertTime(LocalTime time) {
		DateTimeFormatter df=DateTimeFormatter.ofPattern("HH:mm");
		LocalTime lt_new=LocalTime.now();
		String localTimeString=df.format(time);
		
		String ars[]=localTimeString.split(":",2);
		
		//Hours
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH");
		
		int hh=Integer.parseInt(ars[0]);
		
		//minutes
		
		int mm=Integer.parseInt(ars[1]);
		
		LocalTime midd=LocalTime.NOON;
		int midda=Integer.parseInt(dtf.format(midd));
		System.out.println(midd);
		LocalTime midn=LocalTime.MIDNIGHT;
		int middn=Integer.parseInt(dtf.format(midn));
		System.out.println(midn);
		
		String ones[]= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","thriteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty","Twenty One","Twenty two","Twenty three","Twenty four"};
		
		String tens[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String nums[]={"","","Twenty","Thirty","Forty","Fifty"};
		String str="";
		 
		
		if((hh>=1&&hh<=24)&&(mm>=0&&mm<=59)) {
			int j=mm/10;
			int i=mm%10;
			
			 str=("Its "+ones[hh]+":"+nums[j]+" "+tens[i]);
			if(hh==midda) {
			
			str=("Its Midday "+ones[hh]+":00");
			}
			else if(hh==middn)
			{
				str=("Its Midnight "+ones[hh]+":00");
			}
			 
		}
		
		mt.setLocTime(str);
		return mt;

		

	}*/

	
	public String convertTimeToString(LocalTime time) {
		System.out.println("Time="+time);
		DateTimeFormatter df=DateTimeFormatter.ofPattern("HH:mm");
		LocalTime lt_new=LocalTime.now();
		String localTimeString=df.format(time);
		
		String ars[]=localTimeString.split(":",2);
		
		//Hours
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH");
		
		int hh=Integer.parseInt(ars[0]);
		
		//minutes
		
		int mm=Integer.parseInt(ars[1]);
		
		LocalTime midd=LocalTime.NOON;
		int midda=Integer.parseInt(dtf.format(midd));
		System.out.println(midd);
		LocalTime midn=LocalTime.MIDNIGHT;
		int middn=Integer.parseInt(dtf.format(midn));
		System.out.println(midn);
		
		String ones[]= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","thriteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty","Twenty One","Twenty two","Twenty three","Twenty four"};
		
		String tens[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String nums[]={"","","Twenty","Thirty","Forty","Fifty"};
		String str="";
		 
		
		if((hh>=1&&hh<=24)&&(mm>=0&&mm<=59)) {
			int j=mm/10;
			int i=mm%10;
			
			 str=("Its "+ones[hh]+":"+nums[j]+" "+tens[i]);
			if(hh==midda) {
			
			str=("Its Midday "+ones[hh]+":00");
			}
			else if(hh==middn)
			{
				str=("Its Midnight "+ones[hh]+":00");
			}
			 
		}
		return str;
	}
}

