package sub01;
/*
 * Java Thread Test
 * Thread
 * -�ϳ��� ���μ��� �ȿ��� ����Ǵ� ���α׷� �����帧
 * -������� ���ÿ� ����Ǵ� ���ؽ���
 * -Thread Ŭ���� ��ӹ޾�start ����
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
