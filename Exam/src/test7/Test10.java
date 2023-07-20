package test7;
class Human{
	public void print() {
		System.out.println("human");
	}
}
class Man extends Human{
	public void print() {
		System.out.println("man");
	}
}
class Woman extends Human{
	public void print() {
		System.out.println("Woman");
	}
	static void print1() {
		System.out.println();
	}
	void print2() {
		System.out.println();
	}
}
public class Test10 {
	public static void main(String[] args) {
		Human p1 = makeHuman(1);
		Human p2 = makeHuman(2);
		
		p1.print();
		p2.print();
		
		new Human();
		
		Woman.print1();
	}
	
	public static Human makeHuman(int kind) {
		if(kind == 1) {
			return new Man();
		}
		else {
			return new Woman();
		}
		
	}
}
