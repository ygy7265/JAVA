package sub01;

public class Banana {
	private String country;
	private int price;
	
	public Banana(String country,int price) {
		this.country = country;
		this.price = price;
	}
	
	public String toString() {
		String result = "������ " +country + "\n���� : " + price;
		return result;
	}
}
