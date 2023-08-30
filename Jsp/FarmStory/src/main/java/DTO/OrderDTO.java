package DTO;

import com.google.gson.Gson;

public class OrderDTO {
	
	private int orderNo;
	private int orderProduct;
	private int orderCount;
	private int orderDelivery;
	private int orderPrice;
	private int orderTotal;
	private String orderUser;
	private String orderDate;
	private String orderpName;
	private String thumb1;
	

	public String getThumb1() {
		return thumb1;
	}
	public void setThumb1(String thumb1) {
		this.thumb1 = thumb1;
	}
	public String getOrderpName() {
		return orderpName;
	}
	public void setOrderpName(String orderpName) {
		this.orderpName = orderpName;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public int getOrderProduct() {
		return orderProduct;
	}
	public void setOrderProduct(int orderProduct) {
		this.orderProduct = orderProduct;
	}
	public void setOrderProduct(String orderProduct) {
		this.orderProduct = Integer.parseInt(orderProduct);
	}
	public int getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}
	
	public void setOrderCount(String orderCount) {
		this.orderCount = Integer.parseInt(orderCount);
	}
	public int getOrderDelivery() {
		return orderDelivery;
	}
	public void setOrderDelivery(int orderDelivery) {
		this.orderDelivery = orderDelivery;
	}
	public void setOrderDelivery(String orderDelivery) {
		this.orderDelivery = Integer.parseInt(orderDelivery);
	}
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	public void setOrderPrice(String orderPrice) {
		this.orderPrice = Integer.parseInt(orderPrice);;
	}
	public int getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(int orderTotal) {
		this.orderTotal = orderTotal;
	}
	public void setOrderTotal(String orderTotal) {
		this.orderTotal = Integer.parseInt(orderTotal);
	}
	public String getOrderUser() {
		return orderUser;
	}
	public void setOrderUser(String orderUser) {
		this.orderUser = orderUser;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	@Override
	public String toString() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}
	
	
}
