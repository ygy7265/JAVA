package sub04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
 * �ڷᱸ�� ����
 * ����(SET)
 * -�Էµ� �������� ������ ��������ʰ�,�ߺ��� ������� �ʴ� �ڷᱸ��
 * -�ߺ��� �����͸� ���� �Ǵ� ���������翩��Ȯ��
 */
public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		
		for(int i =0 ; i < 5; i++) {
			set.add(i);
		}
		
		System.out.println(set);
		
		Iterator<Integer> iter = set.iterator();
		
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
