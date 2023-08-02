<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>

	<script type="text/javascript">	
	$(function(){
       	$('.next').click(function(e){
       		e.preventDefault();
       		if($("input[name = 'chk1']").is(':checked') && $("input[name = 'chk2']").is(':checked')){
     
       			location.href = "./register.jsp"
       		}
       		else{
       			alert("Check Please..");
       		}
       		
       	}) 
	});
	</script>
<%
			
		String terms = "";
		String terms2 = "";
	try{
		
		Context initCtx = new InitialContext();
		Context ctx = (Context)initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource)ctx.lookup("jdbc/jboard");
		Connection conn = ds.getConnection();
		
		Statement st = conn.createStatement();
		
		ResultSet rs = st.executeQuery("select * from `terms`");
		
		
		if(rs.next()){
			terms = rs.getString(1);
			terms2 = rs.getString(2);
		}
	}catch(Exception e){
		e.printStackTrace();
	}
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Jboard::terms</title>
    <link rel="stylesheet" href="../css/style.css">
    <style>
    
    </style>
</head>
<body>
    <div id="container">
        <header>
            <h3>Board System v1.0</h3>
        </header>
        <main>
            <section id="user" class="terms">
                <table>
                    <caption>Site Terms</caption>
                    <tr>
                        <td>
                            <textarea id = "text1" readonly><%= terms %></textarea>
                            <p>
                                <label><input type="checkbox" name="chk1">Agree</label>
                            </p>
                        </td>
                    </tr>
                </table>
                <table>
                    <caption>User Information</caption>
                    <tr>
                        <td>
                            <textarea readonly><%= terms2 %></textarea>
                        <p>
                        <label><input type="checkbox" name ="chk2">Agree</label>
                        </p>
                    </td>
                </tr>
                </table>
                <div>
                    <a href="./login.jsp">Cancel</a>
                    <a href="./register.jsp" class = "next">Next</a>
                  
                </div>
            </section>
        </main>
        <footer>
            <p>ⓒcopyright YoonGyeongYeop.com</p>
        </footer>
    </div>
</body>
</html>