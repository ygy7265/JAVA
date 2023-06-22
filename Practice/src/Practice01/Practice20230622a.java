package Practice01;

//인터페이스 활용
interface Shop {
	public void buy();
	public void sell();
	public void jjim();
}

//다형성(오버라이드) 색상
class Computer {
	public void red() {};
	public void blue() {};
	public void yellow() {};
	public void green() {};
	public void black() {
	System.out.println("black");
	}
}
class keyboard extends Computer{
	public void red() {
		System.out.println("red");
	}
	public void blue() {
		System.out.println("blue");
	}
}
class mouse extends keyboard {
	public void yellow() {
		System.out.println("yellow");
	}
	public void green() {
		System.out.println("green");
	}
}

//인터페이스 구현
class Computer2 implements Shop{
	private keyboard key;
	private mouse mus;
	
	public Computer2(keyboard key,mouse mus) {
		this.key = key;
		this.mus = mus;
	}
	//오버라이드(메서드재정의)
	public void buy() {
		System.out.println("buy list");
		key.black();
		mus.blue();
		System.out.println("------------------");
	}
	public void sell() {
		System.out.println("sell list");
		key.black();
		mus.green();
		System.out.println("------------------");
	}
	public void jjim() {
		System.out.println("jjim list");
		key.blue();
		mus.red();
		System.out.println("------------------");
	}
}

//추상클래스(추상메소드를 하나이상보유해야하는조건)
abstract class Computer3 {
	protected int count;
	public Computer3(int count) {
		this.count = count;
	}
	public abstract void countUP(int count);
	public  void show() {
		System.out.println("count = " + this.count);
	};

}
//추상클래스 메서드 재정의
class Count extends Computer3{
	
	public Count(int count) {
		super(count);
	}

	public void countUP(int count)
	{
		this.count += count;
		System.out.println(this.count);
	}
}

//메인 클래스
public class Practice20230622a {

	public static void main(String[] args) {
	//다형성(업캐스팅)
	Computer keyboard = new keyboard();
	Computer mouse = new mouse();
	keyboard.green();
	mouse.yellow();

	
	//인터페이스 활용
	keyboard key = new keyboard();
	mouse mus = new mouse();
	
	Shop shop = new Computer2(key,mus);
	shop.buy();
	shop.sell();
	shop.jjim();
	
	//추상화클래스
	Computer3 cpu3 = new Count(10);
	cpu3.countUP(100);
	}

}
