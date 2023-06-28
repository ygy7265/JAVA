package sub02;

import java.util.Stack;
/*
 * JAVA 자료구조 스택
 * 스택(Stack)
 * -스택은 데이터가 순서대로 쌓이는 자료구조 (LIFO:후입선출)
 * -변수선언과 매서드 실행에 사용
 */
public class StackTest {

	public static void main(String[] args) {
		// Generic은 basic type X
			Stack<Integer> stack = new Stack<>();
			
			stack.push(1);
			stack.push(2);
			stack.push(3);
			stack.push(4);
			stack.push(5);
			
//			System.out.println("stack pop :" + stack.pop());
//			System.out.println("stack pop :" + stack.pop());
			while(!stack.empty()) {
				System.out.println("stack pop :" +stack.pop());
			}
	}

}
