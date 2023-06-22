package Practice01;

import java.util.Scanner;

public class practice20230620a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int[]arr = new int[n];
		for(int j=0; j<arr.length;j++) {
			arr[j] = sc.nextInt();
			if(x > arr[j]) {
				System.out.print(arr[j]+ " ");
			}
		}
		
	}
}
