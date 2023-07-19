package review;

import java.util.Calendar;

enum Week{
	MONDAY,TUESDAY,WEDENSDAY,THURSDAY,FRIDAY,SATUDAY,SUNDAY
}
public class WeekExample {
	public static void main(String[] args) {
			Week today = null;
			
			Calendar cal = Calendar.getInstance();
			int week = cal.get(Calendar.DAY_OF_WEEK);
			
			switch(week) {
			case 1:
				today = Week.SUNDAY;
				break;
			case 2:
				today = Week.MONDAY;
				break;
			case 3:
				today = Week.TUESDAY;
				break;
			case 4:
				today = Week.WEDENSDAY;
				break;
			case 5:
				today = Week.THURSDAY;
				break;
			case 6:
				today = Week.FRIDAY;
				break;
			case 7:
				today = Week.SATUDAY;
				break;
			}
			if(today == Week.WEDENSDAY) {
				System.out.println("wedensday");
			}
	}
}
