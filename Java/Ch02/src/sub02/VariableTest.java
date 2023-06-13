package sub02;

/*
 * 날짜: 2023/06/12
 * 이름 : 윤경엽
 * 내용 : Ch02.Java 변수와 연산자 실습
 * 
 * 변수(Variable)
 * -데이터 처리를 위한 데이터 그릇
 * -변수는 메모리 공간이며 각 데이터의 종류에 따라 크기가 다름
 * 상수(Constant)
 * -최초 저장된 데이터로 고정되는 변수
 * -대문자로 표기 
 */
public class VariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수
		int a = 5;
		int b = 6;
		System.out.println(a);
		System.out.println(b);
		
		a = 7;
		b = 8;
		System.out.println(a);
		System.out.println(b);
		
		String name = "윤경엽";
		System.out.println(name + "반갑습니다");
		
	
		//상수(상수는 대문자로 표시하는 rule이 있다.)
		final int NUM = 5;
		
		//NUM = 7; (실행안됨)
		System.out.println("NUM = " + NUM);
	}

}
