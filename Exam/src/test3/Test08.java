package test3;

class Product{
	protected String category;
	protected int price;
	
	public Product(String category, int price) {
		this.category = category;
		this.price = price;
		
	}
	public void info() {}
}
class Televistion extends Product{

	public Televistion(String category, int price) {
		super(category, price);
		// TODO Auto-generated constructor stub
	}
	public void info() {
		System.out.println("제품분류: " + category);
		System.out.println("제품가격: " + price);
	}
	
}
class Computer extends Televistion{

	public Computer(String category, int price) {
		super(category, price);
		// TODO Auto-generated constructor stub
	}
	public void info() {
		System.out.println("제품분류 : " + category);
		System.out.println("제품가격 : " + price);
	}
}
public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Televistion("가전", 100);
		Product p2 = new Computer("컴퓨터", 150);
		
		p1.info();
		p2.info();
	}

}
