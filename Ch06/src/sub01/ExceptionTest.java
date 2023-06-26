package sub01;
/*
 * 예외처리실습
 * 예외는 프로그램 실행중에 발생하는 모든에러
 * 
 */
public class ExceptionTest {

	public static void main(String[] args) {
		
		//실행예외
		
		//예외상황1 어떤수를 0으로 나눌떄
		int num1 = 2;
		int num2 = 0;
		
		int rs1 = 0;
		int rs2 = 0;
		int rs3 = 0;	
		int rs4 = 0;
		try { //예외가 발생할 가능성이 있는 코드 작성
			rs1 = num1 + num2;
			rs2 = num1 - num2;
			rs3 = num1 * num2;
			rs4 = num1 / num2;
		}catch (ArithmeticException e) {
			//예외가 발생할 가능성이 있는 코드 작성
			e.printStackTrace();
		}	
		System.out.println("rs1 = " + rs1);
		System.out.println("rs2 = " + rs2);
		System.out.println("rs3 = " + rs3);
		System.out.println("rs4 = " + rs4);
		
		//예외상황2 배열의 인덱스를 벗어났을때
		int[] arr = {1,2,3,4,5};
		try {
		for(int i=0; i<6; i++) {
			System.out.println(arr[i]);
		} //catch() 괄호안에는 발생할수있는 오류 타입을 적어 예외처리함 exception은 모든오류를 통칭해서 사용
		}catch (ArrayIndexOutOfBoundsException e) {
		
		}
		
		
		//예외상황3 객체 생성없이 참조(null point error)
		Animal ani = null;  //생성없이 참조만 해놓은상황
		try {
			ani.move();
			ani.hunt();
		}catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//예외상황4 
		Animal a1 = new Tiger(); //업캐스팅
		Animal a2 = new Shark();
		Animal a3 = new Eagle();
		
		//다운캐스팅 다른클래스에서 다운캐스팅 불가
		//Eagle ealge =(Eagle)a1; * 오류 발생
		
		try {
			 Shark shark = (Shark) a1;
		}catch (ClassCastException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//일반예외 *실행하지않아도 발생하는 오류 컴파일전에 체크
		try {
			Class obj = Class.forName("sub01.Animal");
		}catch (ClassNotFoundException e) {
			// 찾을 수 없는 클래스 선업
			e.printStackTrace();
		}finally { //예외처리가 끝난후(있든없든) 항상실행되는코드
			System.gc(); //메모리정리(가비지컬렉터)
			System.out.println("finally 실행");
		}
		System.out.println("프로그램 종료");
		
	}

}
