package sub04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
 * 자료구조 집합
 * 집합(SET)
 * -입력된 데이터의 순서를 고려하지않고,중복을 허용하지 않는 자료구조
 * -중복된 데이터를 제거 또는 데이터존재여부확인
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
