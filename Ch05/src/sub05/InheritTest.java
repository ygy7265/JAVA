package sub05;
/*
 * ��¥ : 2023/06/21
 * �̸� : ���濱
 * ���� : JAVA ��� �ǽ��ϱ�
 * ���(Inheritance)
 * -���� Ŭ������ �Ӽ��� ����� �״�� �ڽ� Ŭ�������� Ȯ���Ű�� ���α׷��� ����
 * -�������� ���������� �θ�Ŭ������ �ΰ� �ڽ�Ŭ�������� ��ӹ޾� �ϰ��� ���α׷��ּ���
 * -�θ�Ŭ������ �Ӽ� ���ٱ����� protected �� ���� �ڽ�Ŭ���������� �θ�Ӽ��� �ʱ�ȭ �Ѵ�.
 * 
 */



class Parent{
	private int num1;
	private int num2;
	
	public Parent(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public int plus() {
		return num1 + num2;
	}
}
class Child extends Parent{
	private int num3;
	private int num4;
	 //��ӹ������ �θ�Ŭ������ �Ű��������� �ʱ�ȭ ���־����
	public Child(int num1,int num2,int num3,int num4) {
		super(num1,num2);//�θ�Ŭ���� ������ ȣ��
		this.num3 = num3;
		this.num4 = num4;
	}
	public int minus() {
		return num3 - num4;
	}
}

public class InheritTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��� ��ü
		
		Child c1 = new Child(1,2,3,4);
		int rs1 = c1.plus();
		int rs2 = c1.minus();
		
		System.out.println(rs1);
		System.out.println(rs2);
		
		Sedan sedan = new Sedan("�ҳ�Ÿ","���",0,2000);
		sedan.speedUp(80);
		sedan.speedTurbo();
		sedan.show();
		
		Truck bongo = new Truck("����","����",0,0);
		bongo.load(100);
		bongo.speedUp(60);
		bongo.show();
		
		StockAccount kb = new StockAccount("kb����", "101-123", "ȫ�浿", 10000, "�Ｚ����", 10, 6);
		kb.deposit(100000);
		kb.buy(5, 50000);
		kb.sell(5, 62000);
		kb.show();
	}

}
