package sub03;

public class Apple {
	private String country;
	private int price;
	
	public Apple(String country,int price) {
		this.country = country;
		this.price = price;
	}
	
	public String toString() {
		String result = "������ " +country + "\n���� :" + price;
		return result;
	}
}
