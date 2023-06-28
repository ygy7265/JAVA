package sub05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * JAVA �ڷᱸ�� �� �ǽ��ϱ�
 * 
 * ��(MAP)
 * -Ű -��(Key - value)
 */

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MAP����
		Map<Character, String>map = new HashMap<>();
		map.put('A',"Apple");
		map.put('B',"Banana");
		map.put('C',"Cherry");
		
		System.out.println(map);
		//map ũ��
		System.out.println("map ũ�� : " + map.size());
		
		//���������
		System.out.println("map A�� : " + map.get('A'));
		System.out.println("map B�� : " + map.get('B'));
		System.out.println("map C�� : " + map.get('C'));
		
		//map �ݺ���
		for(char k : map.keySet()) {
			System.out.println(k + " - " + map.get(k));
		}
		//List-Map ����
		List<Map<Integer,Apple>> list = new ArrayList<>();
		
		Map<Integer, Apple> m1 = new HashMap<>();
		m1.put(101, new Apple("�ѱ�", 3000));
		m1.put(102, new Apple("�߱�", 2000));
		m1.put(103, new Apple("�Ϻ�", 1000));
		
		Map<Integer, Apple> m2 = new HashMap<>();
		m2.put(201, new Apple("�̱�", 3000));
		m2.put(202, new Apple("����", 2000));
		m2.put(203, new Apple("ȣ��", 1000));
		
		Map<Integer, Apple> m3 = new HashMap<>();
		m3.put(301, new Apple("�븸", 3000));
		m3.put(302, new Apple("�±�", 2000));
		m3.put(303, new Apple("ȫ��", 1000));
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		//�ѱ����
		Map<Integer,Apple> m= list.get(0);
		Apple a = m.get(101);
		a.show();
		//ȣ�ֻ��
		list.get(1).get(203).show();
		list.get(1).get(203);
		System.out.println(list.get(1).get(203));
		//�±����
	}

}
