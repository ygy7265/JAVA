

import java.sql.SQLException;

import DB.DBHellper;
import DB.SQL;
import DTO.OrderDTO;
import DTO.ProductDTO;

public class OrderDAO extends DBHellper{
	public void orderInsertProduct(OrderDTO dto) {
		conn = getConnection();
		try {
			pst = conn.prepareStatement(SQL.INSERT_PRODUCT);
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
}
