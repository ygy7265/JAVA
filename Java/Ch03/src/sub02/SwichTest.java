package sub02;

import java.util.Scanner;

public class SwichTest {

	public static void main(String[] args) {
		
		System.out.println("숫자입력 : ");
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		System.out.println("입력한 숫자" +  number);
		
		switch (number %2 ) {
		case 0: {
			System.out.println("number 는 짝수");
			break;
		}
		case 1: { 
			System.out.println("number 는 홀수");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + number %2 );
		}
	}

}
