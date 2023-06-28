package sub03;

import java.util.List;

import sub01.Apple;
import java.util.ArrayList;

/*
 * JAVA 자료구조 리스트
 * List
 * -배열과 유사한 자료구조,동적으로 데이터 저장
 * -List를 구현한 ArrayList
 */
public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer> list = new ArrayList<>();
		//다형성을 위해 ArrayList 상위에있는 List로 선언
		List<Integer> list = new ArrayList<>();
		
		//데이터입력
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		//1번째자리에 인덱스와 6데이터 값 삽입
		list.add(1,6);
		System.out.println(list);
		//list 인덱스 제거
		list.remove(2);
		System.out.println(list);
		//list 인데스값 가져오기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(3));
		//리스트 인덱스,값 변경
		list.set(0, 2);
		System.out.println(list);
		//리스트 크기 
		System.out.println("list 크기 " + list.size());
		//리스트 반복문
		for(int num : list) {
			System.out.println(num);
		}
		//문자열 리스트
		List<String> people = new ArrayList<>();
		people.add("김유신");
		people.add("강감찬");
		people.add("이순신");
		
		System.out.println(people);
		
		//객체리스트
		List<Apple> apples = new ArrayList<>();
		Apple a1 = new Apple("한국",3000);
		Apple a2 = new Apple("미국",2000);
		
		apples.add(a1);
		apples.add(a2);
		apples.add(new Apple("일본",1000));
		
		//Apple apple = apples.get(0);
		//apple.show();
		
		apples.get(0).show();
		apples.get(1).show();
		
	}

}
