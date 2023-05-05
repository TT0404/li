package com;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
	 public String time() {
	        Date date = new Date();
	        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        String time1 = format.format(date);
	        return time1;

	    }
}
