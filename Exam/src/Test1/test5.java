package Test1;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수입력 : ");
		int score = sc.nextInt();
		
		System.out.println("입력한점수는" + score + "입니다");
		
		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("A입니다");
			break;
		case 8:
			System.out.println("B입니다");
			break;
		case 7:
			System.out.println("C입니다");
			break;
		case 6:
			System.out.println("D입니다");
			break;
		default:
			System.out.println("F입니다");
			break;
			
		}
		sc.close();
	}

}
