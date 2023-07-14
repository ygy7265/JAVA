package com.shop.db;

public class SQL {
	public static final String SELECT_CUSTOMER = "SELECT * FROM `customer` where `custid` = ?";
	public static final String INSERT_CUSTOMER = "INSERT into `customer` values(?,?,?,?,NOW())";
	public static final String SELECT_PRODUCT = "select * from `product`";
	public static final String SELECT_PRODUCTS = "SELECT * FROM `product` where `prodNo` = ?";
}
