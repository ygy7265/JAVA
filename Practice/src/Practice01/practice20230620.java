package Practice01;

import java.util.Scanner;

public class practice20230620 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		int b = sc.nextInt();
		
		for(int j=0; j <arr.length; j++) {
			if(b == arr[j]) {
				count++;
			}
		
			
		}
		System.out.println(count);
		
	}

}
