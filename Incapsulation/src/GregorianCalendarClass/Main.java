package GregorianCalendarClass;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		System.out.println(formatDate(calendar, false));
		Calendar calendar2 = new GregorianCalendar(2034, Calendar.AUGUST, 5);
		System.out.println(calendar2.get(Calendar.DAY_OF_WEEK));
	}
	private static String formatDate(Calendar calendar, boolean raw){
		String date = (raw? calendar.get(Calendar.MONTH) : calendar.get(Calendar.MONTH)+1) + "/" + calendar.get(Calendar.DATE) +
				"/" + calendar.get(Calendar.YEAR);
		String time = calendar.get(Calendar.HOUR) + ":";
		String min = raw? ""+calendar.get(Calendar.MINUTE) :
			(calendar.get(Calendar.MINUTE) < 10)? "0"+calendar.get(Calendar.MINUTE) : ""+calendar.get(Calendar.MINUTE);
		String marker = raw? ""+calendar.get(Calendar.AM_PM) : (calendar.get(Calendar.AM_PM)==0? "AM" : "PM");
		time += min + " " + marker;
		return time + " " + date;
	}
}
