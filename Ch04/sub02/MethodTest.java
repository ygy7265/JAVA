package sub02;

public class MethodTest {
	
	//��������
	int num = 1;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�޼ҵ� ȣ��
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);
		
		System.out.println("y1 = " + y1);
		System.out.println("y2 = " + y2);
		System.out.println("y3 = " + y3);
		
		int total1 = sum(1,10);
		int total2 = sum(1,100);
		
		
		System.out.println("total = " + total1);
		System.out.println("tota2 = " + total2);
	}
	
	
	//public static *void* ���� �ⱸ�� ���� return �Ұ� y�� return �ϱ� ���ؼ��� y�� type �� int �� ����
	public static int f(int x) {
		int y = 2 * x + 3;
		return y;
	}
	
	public static int sum(int start,int end) {
		//�������� : �޼ҵ尡 ����Ǹ� ���ÿ��� ����
		int total = 0;
		for(int k=start; k<=end; k++) {
			total += k;
		}
		return total;
	}

}
