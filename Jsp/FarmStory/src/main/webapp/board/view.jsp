<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file = "../_header.jsp" %>
<%
	String group = request.getParameter("group");
	String cate = request.getParameter("cate");
	pageContext.include("./_aside"+group+".jsp");
%>
<section class="view">
    <h3>Write</h3>    
        <table>
            <tr>
                <td>Title</td>
                <td><input type="text" name="title" placeholder="1"></td>
            </tr>
            <tr>
                <td>Content</td>
                <td>
                    <textarea name="content" readonly></textarea>
                </td>
            </tr>
            <tr>
                <td>Attachment</td>
                <td><input type="file" name="file"></td>
            </tr>
        </table>
        <div>
            <a href="#" class="btnDelete">Delete</a>
            <a href="./modify.jsp" class="btnModify">Update</a>
            <a href="./list.jsp" class="btnList">list</a>                    
        </div>
        <section class="commentList">
            <h3>Comments</h3>
            <article class="comment">
            <span>
                <span>1</span>
                <span>2</span>
            </span>
            <textarea name="comment" readonly>3</textarea>
            <div>
                <a href="#" class="del">Delete</a>
                <a href="#" class="mod">Update</a>
            </div>
            </article>
            <p class="empty">
                No Comments
            </p>
        </section>
        <section class="commentForm">
            <h3>ComentsWrite</h3>
            <form action="/Jboard/proc/Proc.jsp?num=4" method="post">
            		<input type="hidden" name ="parent" value=""/>
            		<input type="hidden" name ="write" value=""/>
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