package sub02;
/*
 * String Builder Test
 * 
 * String 클래스
 * -String 문자열을 처리하는 클래스
 * -문자열 비교는 equals, 다양한 문자열 가공 메서드 제공
 * -String 클래스의 immutale 특성으로 인한 성능을 개선하기 위해 StringBuilder 사용
 */
public class StringBUilderTest {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "JAVA";
		str += "Programming";
		System.out.println("str 객체주소  = "+str.hashCode());
		System.out.println("str 객체주소  = "+System.identityHashCode(str));
		
		//String 값을바꿀때마다 메모리에쌓이기떄문에 StringBuilder 를 통해 하나의 객체에서 다룰수있게한다
		
		System.out.println("str 객체주소  = "+System.identityHashCode(str));
		
		StringBuilder sb = new StringBuilder("JAVA");
		sb.append("Programming");
		System.out.println("sb 객체 주소 =" + System.identityHashCode(sb));
		System.out.println("sb 객체주소 =" + System.identityHashCode(sb));
		System.out.println("sb = " + sb);
	}

}
