package sub02;

import java.util.Stack;
/*
 * JAVA �ڷᱸ�� ����
 * ����(Stack)
 * -������ �����Ͱ� ������� ���̴� �ڷᱸ�� (LIFO:���Լ���)
 * -��������� �ż��� ���࿡ ���
 */
public class StackTest {

	public static void main(String[] args) {
		// Generic�� basic type X
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
