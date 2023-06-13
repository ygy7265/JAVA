package sub01;
/*
 * 날짜 : 2023/06/13
 * 이름 : 윤경엽
 * 내용 : JAVA 조건문 if 실습하기
 */
public class IfTest {

	public static void main(String[] args) {
		int num1 =1;
		int num2 = 2;
		
		if(num1 < num2) {
			System.out.println("num1은 num2 보다 작다.");
		}
		if(num1 > 1) {
			System.out.println("num1은 1보다 크다");
		}
		if(num1 > 0) {
			if(num2 > 0) {
				System.out.println("num1은 0보다 크고 num2는 1보다 크다");
			}
		}
		if(num1 > 0 && num2 > 0) {
			System.out.println("num1은 0보다 크고 num2는 1보다 크다");
		}
		
		int var1 =1 ,var2 = 2;
		
		if(var1 > var2) {
			System.out.println("var1은 var2보다 크다");
		}
		else {
			System.out.println("var1이 var2 보다 작다");
		}
		
		int n1 = 1, n2 = 2, n3 = 3,n4 = 4;
		if(n1 > n2) {
			System.out.println("n1이n2보다 크다");
		}else if(n2 > n3) {
			System.out.println("n2이 n3보다 크다");
		}else if(n3 > n4) {
			System.out.println("n3이 n4보다 크다");
		}else {
			System.out.println("n4가 가장 크다");
		}
		

	}
}

