package HomeworkCalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		int currDay = calendar.get(Calendar.DATE);
		int currMonth = calendar.get(Calendar.MONTH);
		calendar.set(Calendar.DATE, 1);
		int weekday = calendar.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println("   ПН    ВТ    СР    ЧТ    ПТ    СБ    ВС");
		for(int i = 1; i < weekday; i++) System.out.print("      ");
		do{
			int day = calendar.get(Calendar.DATE);
			System.out.printf("%5d", day);
			if(day == currDay) System.out.print("*"); else System.out.print(" ");
			if(weekday == Calendar.SUNDAY-1) System.out.println();
			calendar.add(Calendar.DATE, 1);
			weekday = calendar.get(Calendar.DAY_OF_WEEK)-1;
		} while(calendar.get(Calendar.MONTH) == currMonth);
	}
}
