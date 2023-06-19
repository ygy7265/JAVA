package sub01;
/*
 * 날짜 : 2023/06/19
 * 이름 : 윤경엽
 * 내용 : JAVA 캡슐화 실습
 */
public class Car1 {
	
	
	//필드(속성)
	String name;
	String color;
	int speed;
	
	
	//메서드(기능)
	public void speedUp(int speed) {
		this.speed += speed;
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}

}
