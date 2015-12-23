package com.eanurag.scratch;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSample {

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

		Date currentDate = new Date();
		
		System.out.println(currentDate instanceof Date);


		String systemDate = dateFormat.format(currentDate);

		System.out.println(systemDate);
	}

}
