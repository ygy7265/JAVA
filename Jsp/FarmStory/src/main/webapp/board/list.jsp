<%@page import="java.util.List"%>
<%@page import="DTO.ArticleDTO"%>
<%@page import="DAO.ArticleDAO"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file = "../_header.jsp" %>

<%
	request.setCharacterEncoding("UTF-8");

	String group = request.getParameter("group");
	String cate = request.getParameter("cate");
	String pg = request.getParameter("pg");
	
	
	ArticleDAO dao = new ArticleDAO();
	
	pageContext.include("./_aside"+group+".jsp");
	
	int pageStart = 0;
	int pageStartNum = 0;
	int pageEnd = 0;
	int currentPage = 1;
	int pageGroupCurrent = 1;
	int pageGroupStart = 1;
	int pageGroupEnd = 0;
	int total = 0;
	
	if(pg != null){
		currentPage = Integer.parseInt(pg);
	}
	
	pageStart = (currentPage - 1) * 10;

	total = dao.PageArticle(cate);
	
	if(total % 10 == 0){
		pageEnd = (total / 10);
	}else{
		pageEnd = (total / 10) + 1;
	}
	
	pageGroupCurrent = (int)Math.ceil(currentPage / 10.0);
	pageGroupStart = (pageGroupCurrent - 1) * 10 + 1;
	pageGroupEnd = pageGroupCurrent * 10;
	
	if(pageGroupEnd > pageEnd){
		pageGroupEnd = pageEnd;
	}
	
	pageStartNum = total - pageStart;
	List<ArticleDTO> list = dao.SelectArticle(cate,pageStart);
%>
			<section class="list">
			    <h3>List</h3>
			    <article>
			        <table border="0">
			            <tr>
			                <th>Number</th>
			                <th>Title</th>
			                <th>Writer</th>
			                <th>Date</th>
			                <th>inquiry</th>
			            </tr>
			            <%for(ArticleDTO arlist : list){ %>
			            <tr>
			                <td><%= pageStartNum-- %></td>
			                <td><a href="./view.jsp?group=<%=group %>&cate=<%=cate %>&no=<%= arlist.getNo()%>"><%=arlist.getTitle() %></a>&nbsp;[<%=dao.ViewCount(arlist.getNo()) %>]</td>
			                <td><%= arlist.getWriter() %></td>
			                <td><%= arlist.getRdate() %></td>
			                <td><%= arlist.getHit() %></td>
			            </tr>
			            <%} %>
			        </table>
			    </article>
			    <div class="paging">
			    	<%if(pageGroupStart > 1) {%>
			    	<a href="/FarmStory/board/list.jsp?cate=<%=cate %>&group=<%=group %>&pg=<%= pageGroupStart-1 %>" class="prev">Back</a>
			    	<%} 
			    	for(int i= pageGroupStart; i<=pageGroupEnd; i++){
			    	%>
			        <a href="/FarmStory/board/list.jsp?cate=<%=cate %>&group=<%=group %>&pg=<%= i %>" class="num <%= currentPage == i ?"current":""%> "><%= i %></a>
			        <%} %>
			        <%if(pageGroupEnd < pageEnd){ %>
			        <a href="/FarmStory/board/list.jsp?cate=<%=cate %>&group=<%=group %>&pg=<%= pageGroupEnd+1 %>" class="next">Next</a>
			        <%} %>
			    </div>
				<%if(UserSession != null){ %>
			    <a href="./write.jsp?group=<%=group %>&cate=<%=cate %>" class="btnWrite">Write</a>
			    <%} %>
			</section>
		 </article>
    </section>
</div>
<%@ include file = "../_footer.jsp" %>