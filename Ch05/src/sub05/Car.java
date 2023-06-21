package sub05;

public class Car {
	
	//protected 자식클래스에서 참조할수있게 해주는 접근제한자
	protected String name;
	protected String color;
	protected int speed;
	
	//생성자
	public Car(String name,String color, int speed) {
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
		System.out.println("차량이름 :"+this.name);
		System.out.println("차량색 :"+this.color);
		System.out.println("스피드"+this.speed);
	}
	
	
	
}
