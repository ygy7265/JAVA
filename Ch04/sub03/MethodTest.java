package sub03;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r1 = type1(1.1);
		double r2 = type1(2.1);
		double r3 = type1(3.1);
		double r4 = type1(4.1);
		type2(true);
		type2(false);
		type4();
		
		boolean tr = type3();
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
	}
	
	//���� 1 �Ű�����:O , ���ϰ�:O
	public static double type1(double x) {
		double y = x + 3.14;
		return y;
		
	}
	
	//���� 2 �Ű�����:O , ���ϰ�:X
	public static void type2(boolean status) {
		if(status) {
			System.out.println("�� �Դϴ�");
		}
		else {
			System.out.println("�����Դϴ�");
		}
	}
	//���� 3 �Ű�����:X , ���ϰ�:O
	public static boolean type3() {
		int num1 = 1;
		int num2 = 2;
		
		if(num1 < num2) {
			return true;
		}else {
			return false;
		}
	}
	//���� 4 �Ű�����:X , ���ϰ�:X
	public static void type4() {
		double result=type1(0.3);
		System.out.println();
	}

}
