<%@page import="vo.UserVo"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String success = request.getParameter("success");
	
	UserVo sessUser = (UserVo) session.getAttribute("sessUser");
	
	if(sessUser != null){
		response.sendRedirect("/Jboard/list.jsp");
		return;
	}
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Jboard::login</title>
    <link rel="stylesheet" href="/Jboard/css/style.css">
   	<script type="text/javascript">
   		const success = <%= success %>;
   		
   		if(success == 100){
   			alert('Login Failed..');
   		}else if(success == 101){
   			alert('Login Please..');
   		}
   	</script>
</head>
<body>
    <div id="container">
        <header>
            <h3>Board System v1.0</h3>
        </header>
        <main>
            <section class="login">
                <form action="/Jboard/proc/Proc.jsp?num=1" method="post">
                    <table>
                        <tr>
                            <td><img src="/Jboard/images/login_ico_id.png" alt="id"></td>
                            <td><input type="text" name="uid" placeholder="ID ADD"></td>
                        </tr>
                        <tr>
                            <td><img src="/Jboard/images/login_ico_pw.png" alt="pw"></td>
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
                    <a href="/Jboard/user/terms.jsp">Sign IN</a>
                </div>
            </section>
        </main>
        <footer>
            <p>ⓒcopyright YoonGyeongYeop.com</p>
        </footer>
    </div>
</body>
</html>