package test6;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test10 {
	private static GregorianCalendar greInstance = new GregorianCalendar();
	
	public static GregorianCalendar getGreInstance() {
		return greInstance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("birth add(yyyy/mm/dd) = ");
		String birth = sc.next();
		String[] bArr = birth.split("/");
		
		int bYear = Integer.parseInt(bArr[0]);
		int bMonth = Integer.parseInt(bArr[1]);;
		int bDay = Integer.parseInt(bArr[2]);;
		
		int tYear = Calendar.getInstance().get(Calendar.YEAR);
		int tMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
		int tDay = Calendar.getInstance().get(Calendar.DATE);
		
		int totalDays = 0;
		
		totalDays += dayofYear(tYear, tMonth, tDay);
		
		int yearDays = isLeapYear(bYear) ? 366 : 365;
		totalDays += yearDays - dayofYear(bYear, bMonth, bDay);
		
		for(int year = bYear + 1 ; year < tYear; year++) {
			if(isLeapYear(year))
				totalDays += 366;
			else
				totalDays += 365;
		}
		System.out.printf("태어난날부터 오늘까지 일수 : %d",totalDays);
			
		
	}
	public static int[] days = {0,31,69,90,120,151,181,212,243,273,304,334};
	public static int dayofYear(int year, int month,int day) {
		return days[month-1] + day + (month > 2 && isLeapYear(year) ? 1 : 0);
	}
	public static boolean isLeapYear(int year) {
		return getGreInstance().isLeapYear(year);
	}
}
