package com.shop;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.shop.db.DBHelper;
import com.shop.db.SQL;

class CustomerDAO extends DBHelper{
	
	private static CustomerDAO instance = new CustomerDAO();
	public static CustomerDAO getInstance() {
		return instance;
	}
	private CustomerDAO() {};
	
	
	public int insertCustomer(CustomerVO vo) throws SQLException, ClassNotFoundException{
		conn = getConnection();
		int result;
		pst = conn.prepareStatement(SQL.INSERT_CUSTOMER);
		pst.setString(1, vo.getCustid());
		pst.setString(2, vo.getName());
		pst.setString(3, vo.getHp());
		pst.setString(4, vo.getAddr());
		result = pst.executeUpdate();
		
		return result;
	}
	public CustomerVO selectCustomer(String custId) {
		CustomerVO vo = null;
		try {
			
			conn = getConnection();
			pst = conn.prepareStatement(SQL.SELECT_CUSTOMER);
			pst.setString(1, custId);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				vo = new CustomerVO();
				vo.setCustid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAddr(rs.getString(4));
				vo.setRdate(rs.getString(5));
			}
			close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vo;
	}
	public List<CustomerVO> selectCustomers(){
		return null;
	}
	public int updateCustomer(CustomerVO vo) {
		return 0;
	}
	public int deleteCustomer(String custId) {
		return 0;
	}
	
}
class OrderDAO extends DBHelper{
	private static OrderDAO instance = new OrderDAO();
	public static OrderDAO getInstance() {
		return instance;
	}
	private OrderDAO() {}
	

	public int insertorder(OrderVO vo) {
		return 0;
	}
	public OrderDAO selectorder(int orderNo) {
		return null;
	}
	public List<OrderVO> selectOrders(){
				
		return null;
	}
	public int updateOrder(OrderVO vo) {
		return 0;
	}
	public int deleteOrder(int orderNo) {
		return 0;
	}
}
public class ShopDAO extends DBHelper{
	private static ShopDAO instance = new ShopDAO();
	public static ShopDAO getInstace() {
		return instance;
	}
	private ShopDAO() {}
	
	public int insertProd() {
		return 0;
	}
	public ShopVO selectProd(int prodNo) {
		ShopVO vo = null;	
		try {
			conn = getConnection();
			pst = conn.prepareStatement(SQL.SELECT_PRODUCTS);
			pst.setInt(1, prodNo);
			rs = pst.executeQuery();
					
			while(rs.next()) {
				vo = new ShopVO();						
				vo.setProdNo(rs.getInt(1));
				vo.setProdName(rs.getString(2));
				vo.setStock(rs.getInt(3));
				vo.setPrice(rs.getInt(4));
				vo.setCompany(rs.getString(5));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return vo;
	}
	public List<ShopVO> selectsProd(){
		List<ShopVO> list = new ArrayList<>();
		try {
			conn = getConnection();
			pst= conn.prepareStatement(SQL.SELECT_PRODUCT);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				ShopVO vo = new ShopVO();
				vo.setProdNo(rs.getInt(1));
				vo.setProdName(rs.getString(2));
				vo.setStock(rs.getInt(3));
				vo.setPrice(rs.getInt(4));
				vo.setCompany(rs.getString(5));
				list.add(vo);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public int updateProd(int prodNo) {
		return 0;
	}
	public int deleteProd(int prodNo) {
		return 0;
	}
}
