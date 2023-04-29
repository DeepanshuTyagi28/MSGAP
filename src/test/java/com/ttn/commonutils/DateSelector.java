package com.ttn.commonutils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateSelector {
	public static Date date;

    static DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    public static String getTodayDate() {
    	// Used to get today's date
       date = new Date();
        String todayDate = dateFormat.format(date);
        return todayDate;
    }
    
    private static Date yesterday() {
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        return cal.getTime();
    }
    
    private static Date tommorow() {
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, +1);
        return cal.getTime();
    }
    
    // Used to get yesterday's date
    public static String getYesterdayDate() {
         date = new Date();
        String yesterdayDate = dateFormat.format(yesterday());
        return yesterdayDate;
    }
    
    // Used to get tommorow's date
    public static String getTommorowDate() {
         date = new Date();
        String tommorowDate = dateFormat.format(tommorow());
        return tommorowDate;
    }

    public static String getDate(int amount){
         date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, amount);
        Date nextDate = calendar.getTime();
        String anyDate = dateFormat.format(nextDate);
        return anyDate;
    }
}
