package sub03;

import java.util.List;

import sub01.Apple;
import java.util.ArrayList;

/*
 * JAVA �ڷᱸ�� ����Ʈ
 * List
 * -�迭�� ������ �ڷᱸ��,�������� ������ ����
 * -List�� ������ ArrayList
 */
public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer> list = new ArrayList<>();
		//�������� ���� ArrayList �������ִ� List�� ����
		List<Integer> list = new ArrayList<>();
		
		//�������Է�
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		//1��°�ڸ��� �ε����� 6������ �� ����
		list.add(1,6);
		System.out.println(list);
		//list �ε��� ����
		list.remove(2);
		System.out.println(list);
		//list �ε����� ��������
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(3));
		//����Ʈ �ε���,�� ����
		list.set(0, 2);
		System.out.println(list);
		//����Ʈ ũ�� 
		System.out.println("list ũ�� " + list.size());
		//����Ʈ �ݺ���
		for(int num : list) {
			System.out.println(num);
		}
		//���ڿ� ����Ʈ
		List<String> people = new ArrayList<>();
		people.add("������");
		people.add("������");
		people.add("�̼���");
		
		System.out.println(people);
		
		//��ü����Ʈ
		List<Apple> apples = new ArrayList<>();
		Apple a1 = new Apple("�ѱ�",3000);
		Apple a2 = new Apple("�̱�",2000);
		
		apples.add(a1);
		apples.add(a2);
		apples.add(new Apple("�Ϻ�",1000));
		
		//Apple apple = apples.get(0);
		//apple.show();
		
		apples.get(0).show();
		apples.get(1).show();
		
	}

}
