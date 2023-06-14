package ch01.sec06;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
        String input = sc.nextLine();
        System.out.println("입력받은 문자열: " + input);
	}

}
