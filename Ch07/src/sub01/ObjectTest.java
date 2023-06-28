package sub01;
/*
 * JAVA Object 실습
 * Object 클래스
 * -자바의 최상위 클래스로 모든 클래스는 Object
 */
public class ObjectTest {

	public static void main(String[] args) {
		// Object type 으로 다형성적용
		Object a1 = new Apple("한국", 3000);
		Object a2 = new Apple("일본", 2000);
		Object a3 = new Apple("한국", 3000);
		
		String a = "Hello";
		String b = "Hello";
		
	
		//객체정보조회
		System.out.println(a1);
		System.out.println(a2);
		a2.toString();
		
		//객체비교
		if(a1 == a2) {
			System.out.println("a1, a2 주소가 같다");
		}else {
			System.out.println("a2, a2 주소가 다르다");
		}
		
		if(a1.equals(a2)) {
			
			System.out.println("a1, a2 가르키는 객체가 같다");
		}else {
			System.out.println(a.equals(b));
			System.out.println("a1, a2 가르키는객체가 다르다");
		}
	}

}
