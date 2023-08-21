<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.io.File"%>
<%@page import="java.util.UUID"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	
	String path = application.getRealPath("/upload");
	int maxSize = 1024 * 1024 * 10;
	MultipartRequest mr = new MultipartRequest(request,path,maxSize,"UTF-8",new DefaultFileRenamePolicy());
	String uid = mr.getParameter("uid");
	String name = mr.getParameter("name");
	String file = mr.getFilesystemName("file");
	
	
	//파일명수정
	int i = file.lastIndexOf(".");
	String ext = file.substring(i);
	System.out.println("ext = " + ext);
	
	String uuid = UUID.randomUUID().toString();
	String sName = uuid+ext;
	
	File f1 = new File(path+"/"+file);
	File f2 = new File(path+"/"+sName);
	f1.renameTo(f2);
	
	Context ctx = (Context)new InitialContext().lookup("java:comp/env");
	DataSource ds = (DataSource) ctx.lookup("jdbc/jboard");
	
	try{
		Connection conn = ds.getConnection();
		PreparedStatement pst = conn.prepareStatement("INSERT INTO `FileTest` SET `oName`=?, `sName`=?,`rdate`= NOW()");
		pst.setString(1, file);
		pst.setString(2, sName);
		pst.executeUpdate();
		
		conn.close();
		pst.close();
		
	}catch(Exception e){
		e.printStackTrace();	
	}
	
	//원본 파일명 INSERT
	
	response.sendRedirect("../2_FileDownload.jsp");
	System.out.println("uid = " + uid);
	System.out.println("name = " + name);
	System.out.println("file = " + file);
%>