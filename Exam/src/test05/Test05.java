package test05;

public class Test05 {
	public static void main(String[] args) {
		int price = 187000;
		int won50000 = price / 50000;
		int won10000 = price % 50000 / 10000;
		int won5000 = price % 10000 / 5000;
		int won1000 = price % 5000 / 1000;
		
		System.out.println("won50000 =" + won50000);
		System.out.println("won50000 =" + won10000);
		System.out.println("won50000 =" + won5000);
		System.out.println("won50000 =" + won1000);
	}
}
