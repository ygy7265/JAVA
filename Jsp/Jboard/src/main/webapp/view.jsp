<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="dao.ArticleDAO"%>
<%@page import="vo.ArticleVo"%>
<%@ include file="./_header.jsp" %>
<%
	request.setCharacterEncoding("UTF-8");
	String no = request.getParameter("no");
	ArticleDAO dao = new ArticleDAO();
	ArticleVo vo = dao.selectAticle(no);
	
	List<ArticleVo> list = new ArrayList<>();
	list = dao.selectComments(no);
	
%>

<script>
	$(function(){
		$('.del').click(function(e){
			
			const result = confirm('click');
			
			if(result){
				return true;
			}else{
				return false;	
			}
			
		});
	})
</script>
   <main>
       <section id="board" class="view">
           <h3>Write</h3>    
                   <table>
                       <tr>
                           <td>Title</td>
                           <td><input type="text" name="title" placeholder="<%=vo.getTitle() %>"></td>
                       </tr>
                       <tr>
                           <td>Content</td>
                           <td>
                               <textarea name="content" readonly> <%=vo.getContent() %></textarea>
                           </td>
                       </tr>
                       <%if(vo.getFile() > 0){ %>
                       <tr>
                           <td>Attachment</td>
                           <td><input type="file" name="file"></td>
                       </tr>
                       <%} %>
                   </table>
                   <div>
                       <a href="#" class="btnDelete">Delete</a>
                       <a href="./modify.jsp" class="btnModify">Update</a>
                       <a href="./list.jsp" class="btnList">list</a>                    
                   </div>
                   <section class="commentList">
                       <h3>Comments</h3>
                       <%for(ArticleVo covo : list){ %>
                       <article class="comment">
                       <span>
                           <span><%=covo.getNick() %></span>
                           <span><%=covo.getRdate() %></span>
                       </span>
                       <textarea name="comment" readonly><%=covo.getContent() %></textarea>
                       <%if(covo.getWriter().equals(sessUser.getUid())){ %>
                       <div>
                           <a href="/Jboard/proc/Proc.jsp?num=5&no=<%=covo.getNo() %>&parent=<%=covo.getParent() %>" class="del">Delete</a>
                           <a href="/Jboard/proc/Proc.jsp" class="mod">Update</a>
                       </div>
                       <%} %>
                       </article>
                       <%} %>
                       <%if(list.isEmpty()){ %>
                       <p class="empty">
                           No Comments
                       </p>
                       <%} %>
                   </section>
                   <section class="commentForm">
                       <h3>ComentsWrite</h3>
                       <form action="/Jboard/proc/Proc.jsp?num=4" method="post">
                       		<input type="hidden" name ="parent" value="<%= no %>"/>
                       		<input type="hidden" name ="write" value="<%= sessUser.getUid()%>"/>
                           <textarea name="minicontent"></textarea>
                               <div>
                                   <a href="#" class="btnCancle">Cancel</a>
                                   <input type="submit" class="btnWrite" value="Write Success"/>
                               </div>
                  
                       </form>
                   </section>
       </section>
   </main>
<%@ include file="./_footer.jsp" %>