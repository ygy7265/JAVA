package sub03;



class Increment{
	private int num1;
	public static int num2;
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
	}
	
	
}

public class Car {
	
	
	//Increment �ǽ� �ν��Ͻ�����
	Increment inc1 = new Increment();
	Increment inc2 = new Increment();
	Increment inc3 = new Increment();
	
	//�ν��Ͻ� ���� ����
	private String name;
	private String color;
	private int speed;
	//Ŭ��������(��������) static �� public
	//static�� Method area(Data) ������ �����
	//public�� ���������� ���Ŭ������ ��ü���� ���ٰ����� ���� �����ϱ����ؼ� public���� ����
	public static int count;
	
	
	//������ : ĸ��ȭ�� �Ӽ��� �ʱ�ȭ�ϱ� ���� �޼���
	public Car(String name,String color,int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		this.count++;
		
	}
	public void speedUp(int speed) {
		
		this.speed += speed;
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	public void show() {
		System.out.println("���ǵ� = " +this.speed);
		System.out.println("���̸�  =" +this.name);
		System.out.println("������ = " +this.color);
	}
	
	//Ŭ���� �޼��� (�����޼���)
	public static int getCount() {
		return count;
	}
}
