<%@page import="dao.ArticleDAO"%>
<%@page import="vo.ArticleVo"%>
<%@page import="dao.UserDao"%>
<%@page import="vo.UserVo"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%

	//loginProc
	String num =  request.getParameter("num");
	String uid = request.getParameter("uid");
	String pass = request.getParameter("pass");
	String pass2 = request.getParameter("pass2");
	String name  = request.getParameter("name");
	String nick  = request.getParameter("nick");
	String email = request.getParameter("email");
	String hp    = request.getParameter("hp");
	String zip   = request.getParameter("zip");
	String addr1 = request.getParameter("addr1");
	String addr2 = request.getParameter("addr2");
	String title = request.getParameter("title");
	String writer = request.getParameter("write");
	String content = request.getParameter("content");
	String regip = request.getRemoteAddr();
	UserVo vo = new UserVo();
	
	if(num.equals("1")){
	vo = UserDao.getInstance().selectUsers(uid, pass);
	if(vo != null){
		session.setAttribute("sessUser", vo);
		response.sendRedirect("/Jboard/list.jsp");
	}else{
		response.sendRedirect("/Jboard/user/login.jsp?success=100");
	}
	out.print(vo);
	}
	//registerProc

	if(num.equals("2")){
	
	vo.setUid(uid);
	vo.setPass(pass);
	vo.setName(name);
	vo.setNick(nick);
	vo.setEmail(email);
	vo.setHp(hp);
	vo.setAddr1(addr1);
	vo.setAddr2(addr2);
	vo.setRegip(regip);
	
	UserDao.getInstance().insertUser(vo);
	response.sendRedirect("/Jboard/user/login.jsp");
	}
	
	//writerProc
	if(num.equals("3")){
		ArticleVo artVo = new ArticleVo();
		
		artVo.setTitle(title);
		artVo.setWriter(writer);
		artVo.setContent(content);
		artVo.setRegip(regip);
		
		ArticleDAO dao = new ArticleDAO();
		dao.insertAticle(artVo);
		response.sendRedirect("/Jboard/list.jsp");
	}
	
	
%>