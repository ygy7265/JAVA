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
Context ctx = (Context)new InitialContext().lookup("java:comp/env");
DataSource ds = (DataSource) ctx.lookup("jdbc/jboard");
List<dto.FileDTO> list = new ArrayList<>();
try{
	Connection conn = ds.getConnection();
	Statement st = conn.createStatement();
	
	ResultSet rs= st.executeQuery("Select * from `FileTest`");
	
	while(rs.next()){
		dto.FileDTO dto = new dto.FileDTO();
		dto.setFno(rs.getInt(1));
		dto.setoName(rs.getString(2));
		dto.setsName(rs.getString(3));
		dto.setrDate(rs.getString(4));
		
		list.add(dto);
	}
	
	conn.close();
	st.close();
	rs.close();
}catch(Exception e){
	e.printStackTrace();	
}
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>2.Download </title>
	</head>
	<body>
		<h3>2.FileDownload</h3>
		
		<table border="1">
			<tr>
				<th>FileNo</th>
				<th>OriginalName</th>
				<th>SaveName</th>
				<th>UploadDate</th>
				<th>Download</th>
			</tr>
			<%
			for(dto.FileDTO filelist : list){
			%>
			<tr>
				<th><%=filelist.getFno() %></th>
				<th><%=filelist.getoName() %></th>
				<th><%=filelist.getsName() %></th>
				<th><%=filelist.getrDate() %></th>
				<th><a href="./proc/fileDownload.jsp?fno=<%= filelist.getFno()%>">Down</a></th>
			</tr>
			<%} %>
		</table>
	</body>
</html>