<%@page import="org.apache.jasper.tagplugins.jstl.core.Remove"%>
<%@page import="DAO.ArticleDAO"%>
<%@page import="DTO.ArticleDTO"%>
<%@page import="DTO.UserDTO"%>
<%@page import="DAO.UserDAO"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String num = request.getParameter("num");
	String cate = request.getParameter("cate");
	String group = request.getParameter("group");
	UserDTO UserSession =(UserDTO) session.getAttribute("sessUser");
	//User
	String uid = request.getParameter("uid");
	String pass = request.getParameter("pass");
	String name = request.getParameter("name");
	String nick = request.getParameter("nick");
	String email = request.getParameter("email");
	String hp = request.getParameter("hp");
	String zip = request.getParameter("zip");
	String addr1 = request.getParameter("addr1");
	String addr2 = request.getParameter("addr2");
	String rdate = request.getParameter("rdate");
	String regip = request.getRemoteAddr();
	String Userlogout = request.getParameter("logout");
	
	//Article
	String no = request.getParameter("no");
	String parent = request.getParameter("parent");
	String comment = request.getParameter("comment");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String minicontent = request.getParameter("minicontent");
	String file = request.getParameter("file");
	String hit = request.getParameter("hit");
	String writer = request.getParameter("writer");
	
	
	UserDAO dao = UserDAO.getInstance();
	UserDTO dto = new UserDTO();
	ArticleDTO ardto = new ArticleDTO();
	ArticleDAO ardao = new ArticleDAO();
	
	if(num == null){
		num = "";
	}
	//Login
	if(num.equals("1")){
		dto = dao.Login(uid, pass);
		if(dto != null){
			session.setAttribute("sessUser", dto);
			response.sendRedirect("/FarmStory/");
		}else{
			response.sendRedirect("/FarmStory/user/login.jsp?success=102");
		}
		
		
	}
	if(Userlogout != null){		
			session.invalidate();
			response.sendRedirect("/FarmStory/");
			
	}
	
	
	//UserInsert
	if(num.equals("2")){
	dto.setUid(uid);
	dto.setPass(pass);
	dto.setName(name);
	dto.setNick(nick);
	dto.setEmail(email);
	dto.setHp(hp);
	dto.setZip(zip);
	dto.setAddr1(addr1);
	dto.setAddr2(addr2);
	dto.setRegip(regip);
	dao.insertUser(dto);
	
	out.print("Test");
	response.sendRedirect("/FarmStory/user/login.jsp");
	}
	
	//Writer
	if(num.equals("3")){
		ardto.setTitle(title);
		ardto.setContent(content);
		ardto.setWriter(writer);
		ardto.setCate(cate);
		ardto.setRegip(regip);
		ardto.setRdate(rdate);
		
		ardao.InsertArticle(ardto);
		response.sendRedirect("/FarmStory/board/list.jsp?group="+group+"&cate="+cate);
	}
	
	if(num.equals("6")){
		ardao.DeleteView(no);
		response.sendRedirect("/FarmStory/board/list.jsp?group="+group+"&cate="+cate);
	}
	//Comment
	if(num.equals("4")){
		if(UserSession == null){
			response.sendRedirect("/FarmStory/board/list.jsp?success=101&group="+group+"&cate="+cate);
			return;
		}
		ardto.setParent(parent);
		ardto.setContent(minicontent);
		ardto.setWriter(writer);
		ardto.setCate(cate);
		ardto.setRegip(regip);
		ardto.setRdate(rdate);
		
		ardao.InsertArticleComment(ardto);
		response.sendRedirect("/FarmStory/board/list.jsp?group="+group+"&cate="+cate);
		
	}
	if(num.equals("5")){
		ardao.DeleteComment(no);
		response.sendRedirect("/FarmStory/board/list.jsp?group="+group+"&cate="+cate);
	}
	
%>