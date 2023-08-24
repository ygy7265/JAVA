package DAO;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import DB.DBHellper;
import DB.SQL;
import DTO.OrderDTO;


public class OrderDAO extends DBHellper{
	public void orderInsertProduct(OrderDTO dto) {
		conn = getConnection();
		try {
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
			e.printStackTrace();
		}
	}
	
	public List<OrderDTO> orderSelectProducts() {
		conn = getConnection();
		List<OrderDTO> list = new ArrayList<>();
		try {
		
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
			dto.setOrderpName(rs.getString("pName"));
			dto.setThumb1(rs.getString("thumb1"));
			
			list.add(dto);
			}
			
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public OrderDTO orderSelectProduct(int pNo) {
		conn = getConnection();
		OrderDTO dto = null;
		try {
		
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
			e.printStackTrace();
		}
		
		return dto;
	}
	
	
	
}
