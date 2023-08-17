<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String cate = request.getParameter("cate");
%>
<div id="sub">
	<div><img src="../images/sub_top_tit5.png" alt="Community"></div>
	 	<section class="community">
	     <aside>
	         <img src="../images/sub_aside_cate5_tit.png" alt="community"/>
	
	         <ul class="lnb">
	             <li class=<%= cate.equals("notice") ? "on" : ""%>><a href="/FarmStory/board/list.jsp?group=Community&cate=notice">공지사항</a></li>
	             <li class=<%= cate.equals("menu") ? "on" : ""%>><a href="/FarmStory/board/list.jsp?group=Community&cate=menu">오늘의식단</a></li>
	             <li class=<%= cate.equals("chef") ? "on" : ""%>><a href="/FarmStory/board/list.jsp?group=Community&cate=chef">나도요리사</a></li>
	             <li class=<%= cate.equals("qnq") ? "on" : ""%>><a href="/FarmStory/board/list.jsp?group=Community&cate=qna">1:1고객문의</a></li>
	             <li class=<%= cate.equals("fqq") ? "on" : ""%>><a href="/FarmStory/board/list.jsp?group=Community&cate=fqq">자주묻는질문</a></li>
	         </ul>
	
	     </aside>
	     <article>
	         <nav>
	             <img src="../images/sub_nav_tit_cate5_<%= cate %>.png" alt="커뮤니티"/>
	             <p>
	                 HOME > 커뮤니티 > 
	                 <%if(cate.equals("nitice")) {%>
	                 <em>공지사항</em>
	                 <%} %>
	                 <%if(cate.equals("menu")) {%>
	                 <em>오늘의식단</em>
	                 <%} %>
	                 <%if(cate.equals("chef")) {%>
	                 <em>나도요리사</em>
	                 <%} %>
	                 <%if(cate.equals("qna")) {%>
	                 <em>1:1고객문의</em>
	                 <%} %>
	                 <%if(cate.equals("fqq")) {%>
	                 <em>자주묻는질문</em>
	                 <%} %>
	             </p>
	         </nav>
	
	         <!-- 내용 시작 -->