package Practice;

import java.util.Scanner;

public class Pc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int num1 = sc.nextInt();
		 int[] num2 = new int[num1];
		 
		 
		 for(int i=0; i<num2.length; i++) {
			  num2[i] = sc.nextInt();
		 }
		 
		 for(int i=0; i<num2.length; i++) {
			  System.out.println(" " + num2);
		 }
		 
	}

}
