package test05;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("year = ");
		int year = sc.nextInt();
		
		if(year % 4 == 0 || year % 400 ==0) {
			System.out.printf("%d는 윤년\n",year);
		}else {
			System.out.printf("%d는 평년\n",year);
		}
		
		GregorianCalendar graCal = new GregorianCalendar();
		
		if(graCal.isLeapYear(year)) {
			System.out.printf("%d는 윤년\n",year);
		}
		else {
			System.out.printf("%d는 평년\n", year);
		}
	}
}
