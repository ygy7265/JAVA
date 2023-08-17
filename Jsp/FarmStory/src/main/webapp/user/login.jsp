<%@page import="DTO.UserDTO"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_header.jsp" %>
<% 
	if(UserSession != null){
		response.sendRedirect("/FarmStory/");
	}
	
%>

<script>
const su = <%= sucessUser %>;
	if(su == 102){
		alert('Login Failed..');
	}
</script>
<div id="user">
    <section class="login">
        <form action="/FarmStory/proc/Proc.jsp?num=1" method="post">
            <table>
                <tr>
                
                    <td><img src="/FarmStory/images/login_ico_id.png" alt="id"></td>
                    <td><input type="text" name="uid" placeholder="ID ADD"></td>
                </tr>
                <tr>
                    <td><img src="/FarmStory/images/login_ico_pw.png" alt="pw"></td>
                    <td><input type="password" name="pass" placeholder="PASSWORD ADD"></td>
                </tr>
            </table>
            <input type="submit" value="login" class="btnLogin">
        </form>
        <div>
            <h3>User Login Information</h3>
            <p>
                Sign IN Please
            </p>
            <a href="/FarmStory/user/terms.jsp">Sign IN</a>
        </div>
    </section>
</div>
<%@ include file="../_footer.jsp" %>