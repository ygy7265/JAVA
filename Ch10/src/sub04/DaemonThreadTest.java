package sub04;
/*
 * DemonThread �ǽ�
 * 
 * ���󽺷���(Daemon Thread)
 * -���ν����带 �����ϴ� ���������� 
 * - ���ν����尡 ����Ǹ� ���󽺷��嵵 ��������
 */
public class DaemonThreadTest {
	public static void main(String[] args) throws InterruptedException {
		SubThread st = new SubThread();
		
		st.setDaemon(true);//���󽺷��� ����
		st.start();
		
		for(int i=1; i<=10; i++) {
			Thread.sleep(100);
			System.out.println("MainThread start");
		}
		System.out.println("Pro End");
	}
}
