package Test2;

import java.util.Scanner;

public class test6 {

	
	public static void intro() {
		System.out.println("*********strat*******");
		System.out.println("두개의 정수를 입력");
	}
	public static int input(Scanner sc , String name) {
		System.out.print("변수 " +name+ "값입력");
		int input = sc.nextInt();
		return input;
	}
	public static void result(int val) {
		System.out.println("덧셈결과 :" + val);
		System.out.println("**********END ********");
	}
	public static int add(int x, int y) {
		return x+y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		intro();
		
		int a= input(sc,"a");
		int b= input(sc,"b");
		
		int output = add(a,b);
		result(output);
		sc.close();
	}
	

}
