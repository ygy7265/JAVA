package test05;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("cm add =");
		double height = sc.nextDouble();
		height /= 100;
		
		System.out.println("kg add = ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		String result;
		if(bmi < 20) {
			result = "저체중";
		}else if(bmi < 25){
			result = "정상체중";
		}else if(bmi < 30) {
			result = "경도비만";
		}else if(bmi < 40) {
			result = "경도비만";
		}else {
			result = "고도비만";
		}
		System.out.printf("BMI=%.2f, '%s'",bmi,result);
		
	}

}
