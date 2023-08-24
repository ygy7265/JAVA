package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
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
		conn = getConnection();
		ProductDTO dto = null;
		try {
			pst = conn.prepareStatement(SQL.SELECT_PRODUCT_LIST_VIEW);
			pst.setInt(1, pNo);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				dto = new ProductDTO();
				 dto.setPno(rs.getInt(1));
				 dto.setType(rs.getInt(2));
				 dto.setpName(rs.getString(3));
				 dto.setPrice(rs.getString(4));
				 dto.setDelivery(rs.getString(5));
				 dto.setStock(rs.getInt(6));
				 dto.setSold(rs.getInt(7));
				 dto.setThumb1(rs.getString(8));
				 dto.setThumb2(rs.getString(9));
				 dto.setThumb3(rs.getString(10));
				 dto.setSeller(rs.getString(11));
				 dto.setEtc(rs.getString(12));
				 dto.setRdate(rs.getString(13));
				 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}
	
	
	public List<ProductDTO> selectProductsadmin() {
		List<ProductDTO> list = new ArrayList<>();
		ProductDTO dto = null;
		conn = getConnection();
		try {
			st = conn.createStatement();
	
			rs = st.executeQuery(SQL.SELECT_PRODUCT_LIST);
			
			while(rs.next()) {
				 dto = new ProductDTO();
				 dto.setPno(rs.getInt(1));
				 dto.setType(rs.getInt(2));
				 dto.setpName(rs.getString(3));
				 dto.setPrice(rs.getString(4));
				 dto.setDelivery(rs.getString(5));
				 dto.setStock(rs.getInt(6));
				 dto.setSold(rs.getInt(7));
				 dto.setThumb1(rs.getString(8));
				 dto.setThumb2(rs.getString(9));
				 dto.setThumb3(rs.getString(10));
				 dto.setSeller(rs.getString(11));
				 dto.setEtc(rs.getString(12));
				 dto.setRdate(rs.getString(13));
				 
				 list.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	public List<ProductDTO> selectProducts(String type,int pagestart) {
		List<ProductDTO> list = new ArrayList<>();
		ProductDTO dto = null;
		conn = getConnection();
		try {
			pst = conn.prepareStatement(SQL.SELECT_PRODUCT_LIST_TYPE);
			pst.setString(1, type);
			pst.setString(2, type);
			pst.setInt(3, pagestart);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				 dto = new ProductDTO();
				 dto.setPno(rs.getInt(1));
				 dto.setType(rs.getInt(2));
				 dto.setpName(rs.getString(3));
				 dto.setPrice(rs.getString(4));
				 dto.setDelivery(rs.getString(5));
				 dto.setStock(rs.getInt(6));
				 dto.setSold(rs.getInt(7));
				 dto.setThumb1(rs.getString(8));
				 dto.setThumb2(rs.getString(9));
				 dto.setThumb3(rs.getString(10));
				 dto.setSeller(rs.getString(11));
				 dto.setEtc(rs.getString(12));
				 dto.setRdate(rs.getString(13));
				 
				 list.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}
	public void updateproduct(ProductDTO dto) {}
	public void deleteproduct(int pNo) {}
	
	public int selectCountProductTotal(String type) {
		conn = getConnection();
		int result = 0;
		try {
			pst = conn.prepareStatement(SQL.SELECT_PRODUCT_LIST_COUNT);
			pst.setString(1, type);
			pst.setString(2, type);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				result = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
}
