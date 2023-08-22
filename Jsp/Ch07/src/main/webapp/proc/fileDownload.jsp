<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.io.File"%>
<%@page import="java.util.UUID"%>
<%@page import="java.sql.ResultSet"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
//파일정보 수신
	request.setCharacterEncoding("UTF-8");
	String fno = request.getParameter("fno");
	
	//파일정보 조회
	Context ctx = (Context)new InitialContext().lookup("java:comp/env");
	DataSource ds = (DataSource) ctx.lookup("jdbc/jboard");
	List<dto.FileDTO> list = new ArrayList<>();
	dto.FileDTO dto = null;
	try{
	Connection conn = ds.getConnection();
	Statement st = conn.createStatement();
	
	ResultSet rs= st.executeQuery("Select * from `FileTest` where `fno` =" + fno);
	
	while(rs.next()){
		dto = new dto.FileDTO();
		dto.setFno(rs.getInt(1));
		dto.setoName(rs.getString(2));
		dto.setsName(rs.getString(3));
		dto.setrDate(rs.getString(4));
	}
	
	conn.close();
	st.close();
	rs.close();
	}catch(Exception e){
	e.printStackTrace();	
	}
	//다운로드 헤더
	response.setContentType("application/octet-stream");
	//파일이름
	response.setHeader("Content-Disposition", "attachment; filename="+URLEncoder.encode(dto.getoName(), "utf-8"));
	response.setHeader("Content-Transfer-Encoding", "binary");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Cache-Control", "private");
	//파일을 불러올경로
	String path = application.getRealPath("/upload");
	File file = new File(path+"/"+dto.getsName());
	
	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
	BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());
	
	while(true){
		//파일경로읽기
		int data = bis.read();
		if(data == -1){
			break;
		}
		//생성
		bos.write(data);
	}
	bos.close();
	bis.close();
%>