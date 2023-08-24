<%@page import="DTO.UserDTO"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

	<%
	String successUser =  request.getParameter("success"); 
	UserDTO UserSession =(UserDTO) session.getAttribute("sessUser");
	
	%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>팜스토리</title>
    <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css"/>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css"/>    
    <link rel="stylesheet" href="/FarmStory/css/style.css"/>
    <link rel="stylesheet" href="/FarmStory/user/css/style.css"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
    <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>    

	
	    <script>
        $(function(){
            $('.slider > ul').bxSlider({
                slideWidth: 980,
                pager: false,
                controls: false,
                auto: true
            });

            $('#tabs').tabs();
        });
        
        const success = <%= successUser %>
        
        if(success == 101){
        	alert('LoginPlease..');
        	location.href = "/FarmStory/user/login.jsp";
        }else if(success == 102){
        	alert('ID and pwd Cheak..');
        }
    </script>
</head>
<body>
    <div id="container">
        <header>
            <a href="/FarmStory/" class="logo"><img src="/FarmStory/images/logo.png" alt="로고"/></a>
            <p>
                <a href="/FarmStory/index.jsp">HOME |</a>
              <% if (UserSession == null) { %>
				    <!-- 사용자가 로그인하지 않은 경우 -->
				    <a href="/FarmStory/user/login.jsp?num=1">로그인 |</a>
				<% } else { %>
				    <!-- 사용자가 로그인한 경우 -->
				    <a href="/FarmStory/proc/Proc.jsp?logout=1">로그아웃 |</a>
				<% } %>
               	
                <a href="/FarmStory/user/terms.jsp">회원가입 |</a>
                <a href="/FarmStory/admin/">관리자 |</a>
                <a href="#">고객센터</a>
            </p>
            <img src="/FarmStory/images/head_txt_img.png" alt="3만원 이상 무료배송"/>
            
            <ul class="gnb">
                <li><a href="/FarmStory/introduction/hello.jsp">팜스토리소개</a></li>
                <li><a href="/FarmStory/market/list.jsp"><img src="/FarmStory/images/head_menu_badge.png" alt="30%"/>장보기</a></li>
                <li><a href="/FarmStory/board/list.jsp?group=Croptalk&cate=story">농작물이야기</a></li>
                <li><a href="/FarmStory/board/list.jsp?group=Event&cate=event">이벤트</a></li>
                <li><a href="/FarmStory/board/list.jsp?group=Community&cate=notice">커뮤니티</a></li>
            </ul>
        </header>