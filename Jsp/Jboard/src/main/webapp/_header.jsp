<%@page import="vo.UserVo"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	UserVo sessUser = (UserVo)session.getAttribute("sessUser");
	if(sessUser == null){
		response.sendRedirect("/Jboard/user/login.jsp?success=101");
		return;
	}
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Jboard::write</title>
    <link rel="stylesheet" href="/Jboard/css/style.css">

</head>
<body>
    <div id="container">
        <header>
            <h3>Board System v1.0</h3>
            <p>
                <%= sessUser.getNick() %>WellCome
                <a href="/Jboard/user/logout.jsp" class="logout">Logout</a>
            </p>
        </header>