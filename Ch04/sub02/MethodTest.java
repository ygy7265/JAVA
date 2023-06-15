package sub02;

public class MethodTest {
	
	//전역변수
	int num = 1;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//메소드 호출
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);
		
		System.out.println("y1 = " + y1);
		System.out.println("y2 = " + y2);
		System.out.println("y3 = " + y3);
		
		int total1 = sum(1,10);
		int total2 = sum(1,100);
		
		
		System.out.println("total = " + total1);
		System.out.println("tota2 = " + total2);
	}
	
	
	//public static *void* 쓰면 출구가 없어 return 불가 y를 return 하기 위해서는 y의 type 인 int 로 선언
	public static int f(int x) {
		int y = 2 * x + 3;
		return y;
	}
	
	public static int sum(int start,int end) {
		//지역변수 : 메소드가 종료되면 스택에서 해제
		int total = 0;
		for(int k=start; k<=end; k++) {
			total += k;
		}
		return total;
	}

}
