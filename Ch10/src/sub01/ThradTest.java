package sub01;
/*
 * Java Thread Test
 * Thread
 * -하나의 프로세스 안에서 실행되는 프로그램 실행흐름
 * -스레드는 동시에 실행되는 병해실행
 * -Thread 클래스 상속받아start 실행
 */
public class ThradTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubThread st1 = new SubThread("Sub01");
		SubThread st2 = new SubThread("Sub02");
		st1.start();
		st2.run();	
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
		
		System.out.println("end ");
		
	}

}
