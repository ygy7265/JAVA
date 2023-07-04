package sub02;
/*
 * Java Thread ����ȭ �ǽ�
 * - �������� ������ ��Ű�� ����Ǵ� ó�� �帧
 * - �񵿱� ����� ������ ��Ű���ʰ� ó���Ǵ� �����帧
 */
public class ThreadSyncTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		
		//�ڽĽ����� ����(�񵿱� ���)
		ct1.start();
		ct2.start();
		ct3.start();
		
		ct1.run();
		ct2.run();
		ct3.run();
		
		
		//�ڽ� ������ �۾��� �Ϸ� �� �ٽ� ���ν������ �շ�(��������)
		ct1.join();
		ct2.join();
		ct3.join();
		
		System.out.println("counst = " +  count.getNum());
	}

}
