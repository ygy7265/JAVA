package DAO;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import DB.DBHellper;
import DB.SQL;
import DTO.OrderDTO;


public class OrderDAO extends DBHellper{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public void orderInsertProduct(OrderDTO dto) {
		conn = getConnection();
		try {
			logger.info("Insert Order Product Start..");
			pst = conn.prepareStatement(SQL.INSERT_ORDER);
			pst.setInt(1, dto.getOrderProduct());
			pst.setInt(2, dto.getOrderCount());
			pst.setInt(3, dto.getOrderDelivery());
			pst.setInt(4, dto.getOrderPrice());
			pst.setInt(5, dto.getOrderTotal());
			pst.setString(6, dto.getOrderUser());
			
			pst.executeUpdate();
			
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			logger.error("Insert Order Product error = " + e.getMessage());
		}
	}
	
	public List<OrderDTO> orderSelectProducts() {
		conn = getConnection();
		List<OrderDTO> list = new ArrayList<>();
		try {
			logger.info("Select Order Products Start..");
			pst = conn.prepareStatement(SQL.SELECT_ORDERS);
			rs = pst.executeQuery();
			
			while(rs.next()) {
			OrderDTO dto = new OrderDTO();
			dto.setOrderNo(rs.getInt("orderNo"));
			dto.setOrderProduct(rs.getInt(2));
			dto.setOrderCount(rs.getInt(3));
			dto.setOrderDelivery(rs.getInt(4));
			dto.setOrderPrice(rs.getInt(5));
			dto.setOrderTotal(rs.getInt(6));
			dto.setOrderUser(rs.getString(7));
			dto.setOrderDate(rs.getString(8));
			dto.setOrderpName(rs.getString(9));
			dto.setThumb1(rs.getString(10));
			
			list.add(dto);
			}
			
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			logger.error("Select Order Produts List error = " + e.getMessage());
		}
		
		return list;
	}
	
	public OrderDTO orderSelectProduct(int pNo) {
		conn = getConnection();
		OrderDTO dto = null;
		try {
			logger.info("Select Order Product Start..");
			pst = conn.prepareStatement(SQL.SELECT_ORDER_LIST);
			rs = pst.executeQuery();
			
			if(rs.next()) {
			dto = new OrderDTO();
			dto.setOrderNo(rs.getInt(1));
			dto.setOrderProduct(rs.getInt(2));
			dto.setOrderCount(rs.getInt(3));
			dto.setOrderDelivery(rs.getInt(4));
			dto.setOrderPrice(rs.getInt(5));
			dto.setOrderTotal(rs.getInt(6));
			dto.setOrderUser(rs.getString(7));
			dto.setOrderDate(rs.getString(8));
			dto.setOrderpName(rs.getString(11));
			}

			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			logger.error("Select Order Product error = " + e.getMessage());
		}
		
		return dto;
	}
	
	
	
}
