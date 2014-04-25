package chapter6;

import java.util.Calendar;

public class CalendarEx {
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		
		System.out.print(msg + year + "/" + month + "/" + day  + "/");
		switch (dayOfWeek) {
		case Calendar.SUNDAY:
			System.out.print("Sunday");
			break;
		case Calendar.MONDAY:
			System.out.print("Monday");
			break;
		case Calendar.TUESDAY:
			System.out.print("Tuesday");
			break;
		case Calendar.WEDNESDAY:
			System.out.print("Wednesday");
			break;
		case Calendar.THURSDAY:
			System.out.print("Thursday");
			break;
		case Calendar.FRIDAY:
			System.out.print("Friday");
			break;
		case Calendar.SATURDAY:
			System.out.print("Saturday");
			break;
		default:
			break;
		}
		System.out.print(" (" + hourOfDay + ")");
		if(ampm == Calendar.AM) System.out.print("AM");
		else System.out.print("PM");
		
		System.out.println(" " + hour + ":" + minute + ":" + second + ":" + millisecond);
	}
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		printCalendar("Now is ", now);
		
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear();
		firstDate.set(2012, 11, 25);
		firstDate.set(Calendar.HOUR_OF_DAY, 20);
		firstDate.set(Calendar.MINUTE, 30);
		printCalendar("First Date is ", firstDate);
	}
}
