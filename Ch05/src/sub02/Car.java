package sub02;

public class Car {
	
	//private 은 캡슐화 외부에서 못보게하기위함 바깥에서 참조를못하기때문에 초기화를못해줌.
	private String color;
	private String name;
	private int speed;
	
	//생성자 캡슐화된 속성을 초기화 하기위한 메서드
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
	
	//Getter, Setter 정의 -필요에따라서정의
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
