package DTO;

import java.text.DecimalFormat;

public class ProductDTO {
	private int pno;
	private int type;
	private String pName;
	private int price;
	private int delivery;
	private int stock;
	private String seller;
	private int sold;
	private String thumb1;
	private String thumb2;
	private String thumb3;
	private String etc;
	private String rdate;
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public int getType() {
		return type;
	}
	public void setType(String type) {
		this.type = Integer.parseInt(type);
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPrice(String price) {
		this.price = Integer.parseInt(price);
	}
	
	public String getPrecieWithComma() {
		DecimalFormat df = new DecimalFormat("###,###");
		return  df.format(price);
	}
	public int getDelivery() {
		return delivery;
	}
	public void setDelivery(int delivery) {
		this.delivery = delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = Integer.parseInt(delivery);
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void setStock(String stock) {
		this.stock = Integer.parseInt(stock);
	}
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}
	public String getThumb1() {
		return thumb1;
	}
	public void setThumb1(String thumb1) {
		this.thumb1 = thumb1;
	}
	public String getThumb2() {
		return thumb2;
	}
	public void setThumb2(String thumb2) {
		this.thumb2 = thumb2;
	}
	public String getThumb3() {
		return thumb3;
	}
	public void setThumb3(String thumb3) {
		this.thumb3 = thumb3;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	
	
}
