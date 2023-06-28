package sub02;
/*
 * String Builder Test
 * 
 * String Ŭ����
 * -String ���ڿ��� ó���ϴ� Ŭ����
 * -���ڿ� �񱳴� equals, �پ��� ���ڿ� ���� �޼��� ����
 * -String Ŭ������ immutale Ư������ ���� ������ �����ϱ� ���� StringBuilder ���
 */
public class StringBUilderTest {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "JAVA";
		str += "Programming";
		System.out.println("str ��ü�ּ�  = "+str.hashCode());
		System.out.println("str ��ü�ּ�  = "+System.identityHashCode(str));
		
		//String �����ٲܶ����� �޸𸮿����̱⋚���� StringBuilder �� ���� �ϳ��� ��ü���� �ٷ���ְ��Ѵ�
		
		System.out.println("str ��ü�ּ�  = "+System.identityHashCode(str));
		
		StringBuilder sb = new StringBuilder("JAVA");
		sb.append("Programming");
		System.out.println("sb ��ü �ּ� =" + System.identityHashCode(sb));
		System.out.println("sb ��ü�ּ� =" + System.identityHashCode(sb));
		System.out.println("sb = " + sb);
	}

}
