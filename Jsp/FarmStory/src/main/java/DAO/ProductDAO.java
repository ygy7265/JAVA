package DAO;

import java.sql.SQLException;
import java.util.List;

import DB.DBHellper;
import DB.SQL;
import DTO.ProductDTO;

public class ProductDAO extends DBHellper{
	public void insertProduct(ProductDTO dto) {
		conn = getConnection();
		try {
			pst = conn.prepareStatement(SQL.INSERT_PRODUCT);
			pst.setInt(1, dto.getType());
			pst.setString(2, dto.getpName());
			pst.setInt(3, dto.getPrice());
			pst.setInt(4, dto.getDelivery());
			pst.setInt(5, dto.getStock());
			pst.setString(6, dto.getThumb1());
			pst.setString(7, dto.getThumb2());
			pst.setString(8, dto.getThumb3());
			pst.setString(9, dto.getSeller());
			pst.setString(10, dto.getEtc());
			pst.executeUpdate();
			
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ProductDTO selectProduct(int pNo) {
		return null;
	}
	public List<ProductDTO> selectProducts() {
		return null;
	}
	public void updateproduct(ProductDTO dto) {}
	public void deleteproduct(int pNo) {}
}
