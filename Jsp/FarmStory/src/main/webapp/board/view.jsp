<%@page import="java.util.List"%>
<%@page import="DTO.ArticleDTO"%>
<%@page import="DAO.ArticleDAO"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file = "../_header.jsp" %>
<%
	String group = request.getParameter("group");
	String cate = request.getParameter("cate");
	String grocate = "?group="+group+"&cate="+cate;
	String no = request.getParameter("no");
	pageContext.include("./_aside"+group+".jsp");
	
	ArticleDAO dao = new ArticleDAO();
	ArticleDTO dto = dao.viewPage(no);
	List<ArticleDTO> commentdto = dao.SelectArticleComment(no);
%>
<section class="view">
    <h3>Write</h3>    
        <table>
            <tr>
                <td>Title</td>
                <td><input type="text" name="title" readonly value="<%= dto.getTitle() %>"></td>
            </tr>
            <tr>
                <td>Content</td>
                <td>
                    <textarea name="content" readonly><%= dto.getContent() %></textarea>
                </td>
            </tr>
            <tr>
                <td>Attachment</td>
                <td><input type="file" name="file"></td>
            </tr>
        </table>
        <div>
        	<%if(UserSession != null){ %>
        		<%if(UserSession.getUid().equals(dto.getWriter()) ) {%>
            	<a href="/FarmStory/proc/Proc.jsp<%=grocate %>&num=6&no=<%=dto.getNo() %>" class="btnDelete">Delete</a>
            	<a href="/FarmStory/board/modify.jsp" class="btnModify">Update</a>
            	<%} %>
            <%}%>
            <a href="/FarmStory/board/list.jsp" class="btnList">list</a>
                                
        </div>
        <section class="commentList">
            <h3>Comments</h3>
            <%for(ArticleDTO commentlist : commentdto) {%>
            <article class="comment">
            <span>
                <span>ID = <%=commentlist.getWriter()%></span>
                <span>DATE = <%=commentlist.getRdate()%></span>
            </span>
            <textarea class="comment"name="comment" readonly><%=commentlist.getContent()%></textarea>
            <div>
            	
            	<%if(UserSession != null){
            		if(UserSession.getUid().equals(commentlist.getWriter())){ %>
                <a href="/FarmStory/proc/Proc.jsp<%=grocate %>&num=5&no=<%=commentlist.getNo() %>" class="del">Delete</a>
                <a href="#" class="mod">Update</a>
                
                <script>
            	document.getElementsByClassName("mod")[0].onclick = function (e) {
            			e.preventDefault();
            			$('.comment').readonly = false;
            	    };
            	</script>
                <%	}
            	  }%>
            </div>
            </article>
            <%} %>
            <%if(commentdto.isEmpty()){ %>
            <p class="empty">
                No Comments
            </p>
            <%} %>
        </section>
        <section class="commentForm">
            <h3>ComentsWrite</h3>
            <form action="/FarmStory/proc/Proc.jsp?num=4" method="post">
            		<%if(UserSession != null){ %>
            		<input type="hidden" name ="parent" value="<%= no %>"/>
            		<input type="hidden" name ="writer" value="<%=UserSession.getUid()%>"/>
            		<%} %>
            		<input type="hidden" name ="cate" value="<%= cate %>"/>
            		<input type="hidden" name ="group" value="<%= group %>"/>
                <textarea name="minicontent"></textarea>
                    <div>
                        <a href="#" class="btnCancle">Cancel</a>
                        
                        <input type="submit" class="btnWrite" value="Write Success"/>
                        
                    </div>
       
            </form>
        </section>
</section>

		 </article>
    </section>
</div>

<%@ include file = "../_footer.jsp" %>