package sub05;

public class Sedan extends Car{
	private int cc;
	
	public Sedan(String name,String color,int speed,int cc) {
		super(name,color,speed);
		this.cc = cc;
	}
	public void speedTurbo() {
		this.speed += 20;
	}
	
	public void show() {
		super.show(); //super 는부모클래스를 가르키는것
		System.out.println("배기량" + this.cc);
	}
	
}
