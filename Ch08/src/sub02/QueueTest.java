package sub02;

import java.util.LinkedList;
import java.util.Queue;

/*
 * ť(Queue)
 * -ť�� �����Ͱ� ���ʴ�� ���̴� �ڷᱸ��(FIFO:���Լ���)
 * -�̺�Ʈ,�ִϸ��̼� ���࿡ ���
 */
public class QueueTest {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
//		queue.offer(1);
//		queue.offer(2);
//		queue.offer(3);
//		queue.offer(4);
//		queue.offer(5);
		int i = 0;
		while(i < 10) {
			
			System.out.println(queue.offer(i));
			i++;
		}
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}
