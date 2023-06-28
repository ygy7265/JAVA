package sub02;
/*
 * String Type
 */
public class StringTest {

	public static void main(String[] args) {
		// ���ڿ� (���� + �迭) ���� hello char {h e l l o}
		   
		String str1 = "Hello"; 				//���ͷ�(�Ͻ���)
		String str2 = new String("Hello");  // �����
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		
		
		//str1 == str2 �� ���ڿ��� �ּҰ��̵��ֱ⶧���� �ּҾȿ��ִ� ���� ���������.
		//���ڿ� ��
		if(str1.equals(str2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
			
		//���ڿ� ����
		String msg = "Hello Korea";
		System.out.println("mgs = " + msg.length());
		//���ڿ� ����
		System.out.println("msg first char = " + msg.charAt(6));
		//���ڿ� �ڸ���
		String sub01 = msg.substring(0,5);
		String sub02 = msg.substring(6);
		
		System.out.println("sub1 = "+ sub01);
		System.out.println("sub2 = "+ sub02);
		
		//���ڿ� �ε���
		int idx1 = msg.indexOf("e");
		int idx2 = msg.lastIndexOf("e");
		System.out.println(idx1);
		System.out.println(idx2);
		
		//���ڿ� ��ü
		String rs1 = msg.replace("Korea", "Busan");
		String rs2 = msg.replace("Hello", "Welcome");
		System.out.println(rs1);
		System.out.println(rs2);
		//���ڿ� ��ȯ
		int var1 = 1;
		double var2 = 3.14;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = "" + var3;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
