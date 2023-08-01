<%@page import="org.jdom2.output.Format"%>
<%@page import="org.jdom2.output.XMLOutputter"%>
<%@page import="org.jdom2.Document"%>
<%@page import="org.jdom2.Element"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vo.UserVo"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page contentType="text/xml;charset=UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%

	List<UserVo> users = new ArrayList<>();
	try{
		Context initCtx = new InitialContext();
		Context ctx = (Context)initCtx.lookup("java:comp/env");
		
		DataSource ds = (DataSource)ctx.lookup("jdbc/userdb");
		Connection conn = ds.getConnection();
		
		Statement st= conn.createStatement(); 
		ResultSet rs = st.executeQuery("select * from `user2`");
		
		while(rs.next()){
			UserVo user = new UserVo();
			user.setUid(rs.getString(1));
			user.setName(rs.getString(2));
			user.setHp(rs.getString(3));
			user.setAge(rs.getInt(4));
			
			users.add(user);
		}
		
		rs.close();
		st.close();
		conn.close();
	}catch(Exception e){
		e.printStackTrace();
	}
	
	
	//json Output
	Document doc = new Document();
	Element elUsers = new Element("users");
	
	for(UserVo vo : users){
		Element elUser = new Element("user");
		Element elUid   = new Element("uid");
		Element elName  = new Element("name");
		Element elHp  	= new Element("hp");
		Element elAge 	= new Element("age");
		
		elUid.setText(vo.getUid());
		elName.setText(vo.getName());
		elHp.setText(vo.getHp());
		elAge.setText(""+vo.getAge());
		
		elUser.addContent(elUid);
		elUser.addContent(elName);
		elUser.addContent(elHp);
		elUser.addContent(elAge);
		
		elUsers.addContent(elUser);
	}
	doc.setRootElement(elUsers);
	
	XMLOutputter outputter = new XMLOutputter(Format.getPrettyFormat());
	String xml = outputter.outputString(doc);
	
	out.print(xml);
	
	
%>