package sub01;
//보이지않아도 상위 클래스를 상속받는다
public class Apple{
	private String contry;
	private int price;
	
	public Apple(String contry,int price) {
		this.contry = contry;
		this.price = price;
	}
	
	@Override
	public String toString() {
		// hashCode = 객체의 유일한 주소값
		System.out.println("객체 해시값" + hashCode());
		System.out.println("contry = " + this.contry);
		System.out.println("price = " + this.price);
		return super.toString();
	}
}
