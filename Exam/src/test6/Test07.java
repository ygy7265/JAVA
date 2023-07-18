package test6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0, b=0, c=0;
		try {
			System.out.print("first =");
			a = Integer.parseInt(br.readLine());
			
			System.out.print("second = ");
			b = Integer.parseInt(br.readLine());
			
			System.out.print("third = ");
			c = Integer.parseInt(br.readLine());
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.printf("가장 큰 수는 %d 입니다", larger(a,b < c ? c : b));

	}
	public static int larger(int a, int b) {
		return (a>=b) ? a:b;
	}

}
