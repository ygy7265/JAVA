package test05;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("number add =");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=n; i++) {
			int fact = 1;
			
			for(int j=2; j<=i; j++) {
				fact *= j;
			}
			sum += fact;
			System.out.printf("%d = %,d\n",i,fact);
		}
		System.out.printf("1!+2!+....%d! = %,d\n",n,sum);
	}

}
