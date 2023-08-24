<%@page import="DTO.UserDTO"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.io.File"%>
<%@page import="java.util.UUID"%>
<%@page import="DAO.ProductDAO"%>
<%@page import="DTO.ProductDTO"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String path = application.getRealPath("/thumb");
int maxSize = 1024 * 1024 * 10;
MultipartRequest mr = new MultipartRequest(request,path,maxSize,"UTF-8",new DefaultFileRenamePolicy());
String mrthumb1 = mr.getOriginalFileName("thumb1");
String mrthumb2 = mr.getOriginalFileName("thumb2");
String mrthumb3 = mr.getOriginalFileName("thumb3");


//파일명수정
int i1 = mrthumb1.lastIndexOf(".");
String ext1 = mrthumb1.substring(i1);
int i2 = mrthumb2.lastIndexOf(".");
String ext2 = mrthumb2.substring(i2);
int i3 = mrthumb3.lastIndexOf(".");
String ext3 = mrthumb3.substring(i3);


String uuid1 = UUID.randomUUID().toString();
String uuid2 = UUID.randomUUID().toString();
String uuid3 = UUID.randomUUID().toString();
String sName1 = uuid1+ext1;
String sName2 = uuid2+ext2;
String sName3 = uuid3+ext3;

File f1 = new File(path+"/"+mrthumb1);
File f2 = new File(path+"/"+mrthumb2);
File f3 = new File(path+"/"+mrthumb3);
File f4 = new File(path+"/"+sName1);
File f5 = new File(path+"/"+sName2);
File f6 = new File(path+"/"+sName3);
f1.renameTo(f4);
f2.renameTo(f5);
f3.renameTo(f6);

	String productName = mr.getParameter("productName");
	String type = mr.getParameter("type");
	String price= mr.getParameter("price");
	String delivery = mr.getParameter("delivery");
	String stock = mr.getParameter("stock");
	String seller = mr.getParameter("seller");
	String thumb1 = mr.getParameter("thumb1");
	String thumb2 = mr.getParameter("thumb2");
	String thumb3 = mr.getParameter("thumb3");
	String etc = request.getParameter("etc");
	
	ProductDTO dto = new ProductDTO();
	dto.setpName(productName);
	dto.setType(type);
	dto.setPrice(price);
	dto.setDelivery(price);
	dto.setStock(stock);
	dto.setSeller(seller);
	dto.setThumb1(sName1);
	dto.setThumb2(sName2);
	dto.setThumb3(sName3);
	dto.setEtc(etc);
	
	ProductDAO dao = new ProductDAO();
	dao.insertProduct(dto);

	response.sendRedirect("../productRegister.jsp");
	
	
%>