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
	
	
	//Increment 실습 인스턴스생성
	Increment inc1 = new Increment();
	Increment inc2 = new Increment();
	Increment inc3 = new Increment();
	
	//인스턴스 변수 생성
	private String name;
	private String color;
	private int speed;
	//클래스변수(정적변수) static 은 public
	//static은 Method area(Data) 구역에 저장됨
	//public은 접근제어자 모든클래스나 객체에서 접근가능함 직접 참조하기위해서 public으로 선언
	public static int count;
	
	
	//생성자 : 캡술화된 속성을 초기화하기 위한 메서드
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
		System.out.println("스피드 = " +this.speed);
		System.out.println("차이름  =" +this.name);
		System.out.println("차색깔 = " +this.color);
	}
	
	//클래스 메서드 (정적메서드)
	public static int getCount() {
		return count;
	}
}
