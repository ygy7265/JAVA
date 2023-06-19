package sub02;

public class Car {
	
	//private �� ĸ��ȭ �ܺο��� �������ϱ����� �ٱ����� ���������ϱ⶧���� �ʱ�ȭ��������.
	private String color;
	private String name;
	private int speed;
	
	//������ ĸ��ȭ�� �Ӽ��� �ʱ�ȭ �ϱ����� �޼���
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	
	public void speedUp(int speed) {
		
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println(this.color);
		System.out.println(this.name);
		System.out.println(this.speed);
		System.out.println("-------------");
	}
	
	//Getter, Setter ���� -�ʿ信��������
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
