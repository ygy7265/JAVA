package sub02;
import java.util.Scanner;

/*
 * Throws �ǽ� 
 */
public class ThrowsTest {
	
	public static void myMethod01(int n1) throws Exception {
		meMethod02(n1);
	}
	public static void meMethod02(int n1) throws Exception{
		//�Է��� �߸�������,0���γ������� ������Ȳ 2���� �߻����� 
		Scanner scan = new Scanner(System.in);
		int n2 = scan.nextInt();
		int result = n1 / n2;
		System.out.println("result = " + result);
	}
	public static void main(String[] args) {
		// ȣ���ϴ°����� ����ó�� ��
		try {
			myMethod01(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("��������");
	}

}
