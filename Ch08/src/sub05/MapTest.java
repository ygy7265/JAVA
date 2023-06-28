package sub05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * JAVA 자료구조 맵 실습하기
 * 
 * 맵(MAP)
 * -키 -값(Key - value)
 */

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MAP생성
		Map<Character, String>map = new HashMap<>();
		map.put('A',"Apple");
		map.put('B',"Banana");
		map.put('C',"Cherry");
		
		System.out.println(map);
		//map 크기
		System.out.println("map 크기 : " + map.size());
		
		//데이터출력
		System.out.println("map A값 : " + map.get('A'));
		System.out.println("map B값 : " + map.get('B'));
		System.out.println("map C값 : " + map.get('C'));
		
		//map 반복문
		for(char k : map.keySet()) {
			System.out.println(k + " - " + map.get(k));
		}
		//List-Map 응용
		List<Map<Integer,Apple>> list = new ArrayList<>();
		
		Map<Integer, Apple> m1 = new HashMap<>();
		m1.put(101, new Apple("한국", 3000));
		m1.put(102, new Apple("중국", 2000));
		m1.put(103, new Apple("일본", 1000));
		
		Map<Integer, Apple> m2 = new HashMap<>();
		m2.put(201, new Apple("미국", 3000));
		m2.put(202, new Apple("영국", 2000));
		m2.put(203, new Apple("호주", 1000));
		
		Map<Integer, Apple> m3 = new HashMap<>();
		m3.put(301, new Apple("대만", 3000));
		m3.put(302, new Apple("태국", 2000));
		m3.put(303, new Apple("홍콩", 1000));
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		//한국사과
		Map<Integer,Apple> m= list.get(0);
		Apple a = m.get(101);
		a.show();
		//호주사과
		list.get(1).get(203).show();
		list.get(1).get(203);
		System.out.println(list.get(1).get(203));
		//태국사과
	}

}
