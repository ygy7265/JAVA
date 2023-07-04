package sub02;
/*
 * Java Thread 동기화 실습
 * - 동기방식은 순서를 지키며 실행되는 처리 흐름
 * - 비동기 방식은 순서를 지키지않고 처리되는 실행흐름
 */
public class ThreadSyncTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		
		//자식스레드 실행(비동기 방식)
		ct1.start();
		ct2.start();
		ct3.start();
		
		ct1.run();
		ct2.run();
		ct3.run();
		
		
		//자식 스레드 작업이 완료 후 다시 메인스레드로 합류(스레드대기)
		ct1.join();
		ct2.join();
		ct3.join();
		
		System.out.println("counst = " +  count.getNum());
	}

}
