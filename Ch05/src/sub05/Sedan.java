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
		super.show(); //super �ºθ�Ŭ������ ����Ű�°�
		System.out.println("��ⷮ" + this.cc);
	}
	
}
