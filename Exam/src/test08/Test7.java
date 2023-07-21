package test08;

import java.util.ArrayList;
import java.util.List;

class Products{
	List<Product> list = new ArrayList<>();
	public void SetProduct(String item,int price) {
		Product product = new Product();
		product.setItem(this, item, price);
	}
	public void showList() {
		for(Product p : list) {
			System.out.printf("Product = %s, price = %,d\n",p.getItem(),p.getPrice());
		}
	}
	private class Product{
		private String item;
		private int price;
		
		public void setItem(Products outer,String item,int price) {
			this.item = item;
			this.price = price;
			
			outer.list.add(this);
		}
		public String getItem() {
			return item;
		}
		public int getPrice() {
			return price;
		}
	}
}
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Products products = new Products();
		products.SetProduct("shoes", 30000);
		products.SetProduct("shirts", 20000);
		products.SetProduct("Pants", 15000);
		
		products.showList();
				
	}

}
