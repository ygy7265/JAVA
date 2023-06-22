package Practice01;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수입력");
		int num3 = sc.nextInt();
		int sum2 = sc.nextInt();
		int result = num(num3, sum2);
		System.out.println(result);
	
	}
	
	public static int num(int num1,int num2) {
		int sum = 0;
		sum = num1 + num2;
		return sum;
	}

}
