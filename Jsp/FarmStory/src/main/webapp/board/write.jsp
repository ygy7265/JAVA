<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file = "../_header.jsp" %>
<%

String group = request.getParameter("group");
String cate = request.getParameter("cate");
if(UserSession == null){
	response.sendRedirect("/FarmStory/board/list.jsp?success=101&group="+group+"&cate="+cate);
	return;
}
pageContext.include("./_aside"+group+".jsp");
%>
<section class="write">
    <h3>Write</h3>
    <article>
        <form action="../proc/Proc.jsp?num=3&group=<%=group %>&cate=<%=cate %>" method="post">
        	<input type ="hidden" name="writer" value="<%=UserSession.getUid()%>">
        	<input type ="hidden" name="group" value="<%= group %>">
        	<input type ="hidden" name="cate" value="<%= cate %>">
            <table>
                <tr>
                    <td>Title</td>
                    <td><input type="text" name="title" required placeholder="Title ADD"></td>
                </tr>
                <tr>
                    <td>Content</td>
                    <td>
                        <textarea name="content" required></textarea>
                    </td>
                </tr>
                <tr>
                    <td>Attachment</td>
                    <td><input type="file" name="file"></td>
                </tr>
            </table>
            <div>
                <a href="/FarmStory/board/list.jsp?group=<%=group %>&cate=<%=cate %>" class="btnCancel">Cancel</a>
                <input type="submit" class="btnWrite" value="WriteSucess">
            </div>
        </form>
    </article>
  </section>

 <%@ include file = "../_footer.jsp" %>