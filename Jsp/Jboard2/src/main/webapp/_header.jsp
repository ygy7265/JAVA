<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>글쓰기</title>
    <link rel="stylesheet" href="./css/style.css"/>    
</head>
<body>
    <div id="wrapper">
        <header>
            <h3>Board System v2.0</h3>
            <p>
                <span><a href="/Jboard2/user/myinfo.do">${sessionScope.sessUser.nick}</a></span>님 반갑습니다.
                <a href="/Jboard2/user/logout.do?success=200">[로그아웃]</a>
            </p>
        </header>