package sub01;
/*
 * JAVA Object �ǽ�
 * Object Ŭ����
 * -�ڹ��� �ֻ��� Ŭ������ ��� Ŭ������ Object
 */
public class ObjectTest {

	public static void main(String[] args) {
		// Object type ���� ����������
		Object a1 = new Apple("�ѱ�", 3000);
		Object a2 = new Apple("�Ϻ�", 2000);
		Object a3 = new Apple("�ѱ�", 3000);
		
		String a = "Hello";
		String b = "Hello";
		
	
		//��ü������ȸ
		System.out.println(a1);
		System.out.println(a2);
		a2.toString();
		
		//��ü��
		if(a1 == a2) {
			System.out.println("a1, a2 �ּҰ� ����");
		}else {
			System.out.println("a2, a2 �ּҰ� �ٸ���");
		}
		
		if(a1.equals(a2)) {
			
			System.out.println("a1, a2 ����Ű�� ��ü�� ����");
		}else {
			System.out.println(a.equals(b));
			System.out.println("a1, a2 ����Ű�°�ü�� �ٸ���");
		}
	}

}
