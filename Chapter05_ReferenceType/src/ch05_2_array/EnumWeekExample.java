package ch05_2_array;

import java.util.Calendar;

public class EnumWeekExample {
	
	public static void main(String[] args) {
		
		Week today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1:
				today = Week.SUNDAY;break;
			case 2:
				today = Week.MUNDAY;break;
			case 3:
				today = Week.THUSDAY;break;	
			case 4:
				today = Week.WEDNEDAY;break;
			case 5:
				today = Week.THURDAY;break;
			case 6:
				today = Week.FRIDAY;break;
			case 7:
				today = Week.SAYURDAY;break;
		}
		
				
		
	}
}
