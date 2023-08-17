<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file = "../_header.jsp" %>

<%
	request.setCharacterEncoding("UTF-8");
	String group = request.getParameter("group");
	String cate = request.getParameter("cate");
	
	pageContext.include("./_aside"+group+".jsp");
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
			            
			            <tr>
			                <td>1</td>
			                <td><a href="./view.jsp?group=<%=group %>&cate=<%=cate %>">1</a>&nbsp;[2]</td>
			                <td>3</td>
			                <td>4</td>
			                <td>5</td>
			            </tr>
			        </table>
			    </article>
			    <div class="paging">
			        <a href="#" class="prev">Back</a>
			        <a href="#" class="num">1</a>
			        <a href="#" class="next">Next</a>
			    </div>
			
			    <a href="./write.jsp?group=<%=group %>&cate=<%=cate %>" class="btnWrite">Write</a>
			</section>
		 </article>
    </section>
</div>
<%@ include file = "../_footer.jsp" %>