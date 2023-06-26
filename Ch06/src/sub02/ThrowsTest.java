package sub02;
import java.util.Scanner;

/*
 * Throws 실습 
 */
public class ThrowsTest {
	
	public static void myMethod01(int n1) throws Exception {
		meMethod02(n1);
	}
	public static void meMethod02(int n1) throws Exception{
		//입력이 잘못됬을떄,0으로나눴을때 오류상황 2가지 발생가능 
		Scanner scan = new Scanner(System.in);
		int n2 = scan.nextInt();
		int result = n1 / n2;
		System.out.println("result = " + result);
	}
	public static void main(String[] args) {
		// 호출하는곳에서 예외처리 함
		try {
			myMethod01(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("정상종료");
	}

}
