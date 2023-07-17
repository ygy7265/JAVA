package test05;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("cm add = ");
		double height = sc.nextDouble();
		
		height /= 100;
		
		System.out.print("kg add = ");
		double weight = sc.nextDouble();
		double bmi = weight / (height * height);
		
		String result;
		if(bmi < 20) {
			result = "small";
		}
		else if(bmi < 25) {
			result = "nomal";
		}
		else if(bmi < 30) {
			result = "little big";
		}
		else if(bmi < 35) {
			result = "big";
		}
		else {
			result = "biggest";
		}
		System.out.println(result);
	}
}
