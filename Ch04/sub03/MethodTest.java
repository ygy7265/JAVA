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
	
	//형태 1 매개변수:O , 리턴값:O
	public static double type1(double x) {
		double y = x + 3.14;
		return y;
		
	}
	
	//형태 2 매개변수:O , 리턴값:X
	public static void type2(boolean status) {
		if(status) {
			System.out.println("참 입니다");
		}
		else {
			System.out.println("거짓입니다");
		}
	}
	//형태 3 매개변수:X , 리턴값:O
	public static boolean type3() {
		int num1 = 1;
		int num2 = 2;
		
		if(num1 < num2) {
			return true;
		}else {
			return false;
		}
	}
	//형태 4 매개변수:X , 리턴값:X
	public static void type4() {
		double result=type1(0.3);
		System.out.println();
	}

}
