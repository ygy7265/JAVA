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
	//저장할폴더경로
	String path = application.getRealPath("/upload");
	int maxSize = 1024 * 1024 * 10;
	MultipartRequest mr = new MultipartRequest(request,path,maxSize,"UTF-8",new DefaultFileRenamePolicy());
	//파일파라미터이름
	String file = mr.getFilesystemName("file");
	
	//파일명수정
	//확장자 파싱
	int i = file.lastIndexOf(".");
	String ext = file.substring(i);
	//파일 고유이름만들기
	String uuid = UUID.randomUUID().toString();
	//고유이름에 확장자붙이기
	String sName = uuid+ext;
	
	//경로에 저장해준 파일이름으로 새로운객체생성
	File f1 = new File(path+"/"+file);
	//고유한이름으로 바꿔줄 객체생성
	File f2 = new File(path+"/"+sName);
	//파일이름변경
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
	System.out.println("file = " + file);
%>