package sub01;
/*
 * ����ó���ǽ�
 * ���ܴ� ���α׷� �����߿� �߻��ϴ� ��翡��
 * 
 */
public class ExceptionTest {

	public static void main(String[] args) {
		
		//���࿹��
		
		//���ܻ�Ȳ1 ����� 0���� ������
		int num1 = 2;
		int num2 = 0;
		
		int rs1 = 0;
		int rs2 = 0;
		int rs3 = 0;	
		int rs4 = 0;
		try { //���ܰ� �߻��� ���ɼ��� �ִ� �ڵ� �ۼ�
			rs1 = num1 + num2;
			rs2 = num1 - num2;
			rs3 = num1 * num2;
			rs4 = num1 / num2;
		}catch (ArithmeticException e) {
			//���ܰ� �߻��� ���ɼ��� �ִ� �ڵ� �ۼ�
			e.printStackTrace();
		}	
		System.out.println("rs1 = " + rs1);
		System.out.println("rs2 = " + rs2);
		System.out.println("rs3 = " + rs3);
		System.out.println("rs4 = " + rs4);
		
		//���ܻ�Ȳ2 �迭�� �ε����� �������
		int[] arr = {1,2,3,4,5};
		try {
		for(int i=0; i<6; i++) {
			System.out.println(arr[i]);
		} //catch() ��ȣ�ȿ��� �߻��Ҽ��ִ� ���� Ÿ���� ���� ����ó���� exception�� �������� ��Ī�ؼ� ���
		}catch (ArrayIndexOutOfBoundsException e) {
		
		}
		
		
		//���ܻ�Ȳ3 ��ü �������� ����(null point error)
		Animal ani = null;  //�������� ������ �س�����Ȳ
		try {
			ani.move();
			ani.hunt();
		}catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//���ܻ�Ȳ4 
		Animal a1 = new Tiger(); //��ĳ����
		Animal a2 = new Shark();
		Animal a3 = new Eagle();
		
		//�ٿ�ĳ���� �ٸ�Ŭ�������� �ٿ�ĳ���� �Ұ�
		//Eagle ealge =(Eagle)a1; * ���� �߻�
		
		try {
			 Shark shark = (Shark) a1;
		}catch (ClassCastException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//�Ϲݿ��� *���������ʾƵ� �߻��ϴ� ���� ���������� üũ
		try {
			Class obj = Class.forName("sub01.Animal");
		}catch (ClassNotFoundException e) {
			// ã�� �� ���� Ŭ���� ����
			e.printStackTrace();
		}finally { //����ó���� ������(�ֵ����) �׻����Ǵ��ڵ�
			System.gc(); //�޸�����(�������÷���)
			System.out.println("finally ����");
		}
		System.out.println("���α׷� ����");
		
	}

}
