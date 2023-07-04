package sub03;
/*
 * Java Thread 활용실습
 */
public class ThreadAddTest {
	public static void main(String[] args) throws InterruptedException {
		AddThread at1 = new AddThread(1, 50);
		AddThread at2 = new AddThread(51, 100);
		
		//Runnable 구현클래스를Thread 객체로 생성
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2);
		
		
		//스레드 실행
		t1.start();
		t2.start();
		
		//스레드대기 (다른스레드 종료를 대기)
		t1.join();
		t2.join();
		
		int tot1 = at1.getNum();
		int tot2 = at2.getNum();
		
		int total = tot1 + tot2;
		System.out.println("total = " + total);
	}
}
