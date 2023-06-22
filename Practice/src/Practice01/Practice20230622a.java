package Practice01;

//�������̽� Ȱ��
interface Shop {
	public void buy();
	public void sell();
	public void jjim();
}

//������(�������̵�) ����
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

//�������̽� ����
class Computer2 implements Shop{
	private keyboard key;
	private mouse mus;
	
	public Computer2(keyboard key,mouse mus) {
		this.key = key;
		this.mus = mus;
	}
	//�������̵�(�޼���������)
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

//�߻�Ŭ����(�߻�޼ҵ带 �ϳ��̻����ؾ��ϴ�����)
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
//�߻�Ŭ���� �޼��� ������
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

//���� Ŭ����
public class Practice20230622a {

	public static void main(String[] args) {
	//������(��ĳ����)
	Computer keyboard = new keyboard();
	Computer mouse = new mouse();
	keyboard.green();
	mouse.yellow();

	
	//�������̽� Ȱ��
	keyboard key = new keyboard();
	mouse mus = new mouse();
	
	Shop shop = new Computer2(key,mus);
	shop.buy();
	shop.sell();
	shop.jjim();
	
	//�߻�ȭŬ����
	Computer3 cpu3 = new Count(10);
	cpu3.countUP(100);
	}

}
