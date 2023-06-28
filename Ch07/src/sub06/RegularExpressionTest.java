package sub06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * JAVA���Խ� �ǽ�
 */
public class RegularExpressionTest {

	public static void main(String[] args) {
		// ����ǥ����
		String strtPatt = "a[a-z]*";
		
		boolean r1 = Pattern.matches(strtPatt, "apple");
		boolean r2 = Pattern.matches(strtPatt, "banana");
		
		System.out.println("apple =" + r1);
		System.out.println("banana = " + r2);
		
		//����ǥ���� ����
		String[] patterns = {
								"[0-9]+", //����1���̻�
								"1[0-9]]*", //1�ν����ϴ¼��� 0���̻�
								"^[0-9]", //���ڷ� �����ϴ� ����
								"[^0-9]", //���ڰ��ƴѹ���
								".",//����1��
								"[a-z]?", // ����ҹ���1��
								"[a-z]*", //����ҹ��� 0���̻�
								"[a-z]+", //����ҹ��� 1���̻�
								"[A-Z]*", //���� �빮�� 0���̻�
								"[��-�R]+", //�ѱ� 1���̻�
								"^[0-9]+[��-�R]+", //����+�ѱ� 1���̻�
								"^[0-9a-z]+", //����+���� 1���̻�
								"^[A-z]+", //�빮�ڿ���+�ҹ���1���̻�
								"\\s", //����
								"\\S", //������ �ƴѹ���
								"\\d", //����
								"\\w", //���ڿ� ����
								"\\W", //Ư������ 
		};
		String[] words = {"apple", "123�ѱ�", "123456", "011","hello","ȫ�浿","1","apple","APPLE","Banana","#$%"};
		for(String word : words) {
			System.out.print(word + "���ڿ� ��ġ�ϴ� ���� : ");
			for(String pattern : patterns) {
				boolean result = Pattern.matches(pattern,word);
				
				if(result) {
					System.out.println(pattern + ", ");
				}
			}
			System.out.println(" ");
		}
		
		//���� ����ϴ� ���� ǥ����
		String ptt1 = "^[a-zA-z0-9]*$";
		String ptt2 = "^[��-�R]*$";
		String ptt3 = "(01\\d{1})-(\\d{3,4})-(\\d{4})";
		String ptt4 = "(\\w+)@(\\w+).(\\w+)";
		
		String str = "�̸�:ȫ�浿, �޴���:010-1234-1001,�̸���:hong@gmail.com";
		
		Pattern p1 = Pattern.compile(ptt3);
		Matcher m1 = p1.matcher(str);
		Pattern p2 = Pattern.compile(ptt4);
		Matcher m2 = p2.matcher(str);
		
		System.out.println("�޴�����ȸ");
		
		while(m1.find()) {
			System.out.println(m1.group());
		}
		System.out.println("�̸��� ��ȸ");
		while(m2.find()) {
			System.out.println(m2.group());
		}
	}

}
