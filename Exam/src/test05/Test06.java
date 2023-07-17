package test05;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("year insert = ");
		
		int year = sc.nextInt();
		 
		if(year % 4 == 0 || year % 400 ==0) {
			System.out.printf("%d 는 윤년입니다.\n", year);
		}else {
			System.out.printf("%d 는 평년입니다.\n", year);
		}
		
		GregorianCalendar greCal = new GregorianCalendar();
		
		if(greCal.isLeapYear(year)) {
			System.out.printf("%d는 윤년입니다\n",year);
		}else {
			System.out.printf("%d는 평년입니다\n",year);
		}
		
	}

}
