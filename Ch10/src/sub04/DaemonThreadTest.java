package sub04;
/*
 * DemonThread 실습
 * 
 * 데몬스레드(Daemon Thread)
 * -메인스레드를 보조하는 보조스레드 
 * - 메인스레드가 종료되면 데몬스레드도 같이종료
 */
public class DaemonThreadTest {
	public static void main(String[] args) throws InterruptedException {
		SubThread st = new SubThread();
		
		st.setDaemon(true);//데몬스레드 설정
		st.start();
		
		for(int i=1; i<=10; i++) {
			Thread.sleep(100);
			System.out.println("MainThread start");
		}
		System.out.println("Pro End");
	}
}
