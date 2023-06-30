package test4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		int answer = (int) (Math.random()*10)+1;
		int input = 0;
		int count = 0;
		
		do {
			count++;
			System.out.println("------------------");
			System.out.println("answer의 값을 맞춰보세요.");
			System.out.println("1~10사이의값을 입력 :");
			try {
				Scanner sc = new Scanner(System.in);
				input = sc.nextInt();
				
				if(input < 0) {
					throw new Exception("음수는 입력 할 수 없습니다");
				}
			}catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("숫자가아닙니다.숫자를입력하세요");
				continue;
				
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				continue;
			}
			if(answer > input) {
				System.out.println("더 큰수를 입력하세요");
			}else if (answer < input) {
				System.out.println("더작은수를 입력하세요");
			}else {
				System.out.println("answer = " + answer);
				System.out.println("정답");
				System.out.println("시도횟수 : " + count + "회");
				break;
			}
		}while(true);
			System.out.println("프로그램이 정상 종료 되었습니다");
		
	}
}
