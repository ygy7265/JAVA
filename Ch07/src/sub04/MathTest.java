package sub04;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Basic Method
		System.out.println("절대값 :" + Math.abs(-5));
		System.out.println("제곱근:"  + Math.sqrt(9));
		System.out.println("올림값 :" + Math.ceil(1.2));
		System.out.println("올림값 :" + Math.ceil(1.8));
		System.out.println("내림값 :" + Math.floor(1.2));
		System.out.println("내림값 :" + Math.floor(1.8));
		System.out.println("반올림 :" + Math.round(1.2));
		System.out.println("반올림 :" + Math.round(1.8));
		
		//Random
		double num1 = Math.random();//0~1 사이의 실수
		System.out.println("num1 : "  + num1);
		
		double num2 = num1 * 10;//0~10사이에 실수
		System.out.println("num2 : " + num2);
		
		double num3 = Math.ceil(num2);//1~10 사이에 정수
		System.out.println("num3 : " + num3);
		
		int rand = (int)Math.ceil(Math.random() * 45);
		System.out.println("rand :" + rand);
	}

}
