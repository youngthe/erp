<!DOCTYPE html>
<html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<head>
    <title>HOME</title>
    <link rel="stylesheet" href="/static/css/basic.css">
    <script src="/static/js/sideToggle.js"></script>
</head>
<body>
<header>
    <a href="dashboard"><div class="logo">YOUNG THE</div></a>
    <div class="search-bar">
        <input type="text" placeholder="무엇이든 검색하세요!">
    </div>
    <div>
        안녕하세요 ${user.username} 님
        <a href="logout">로그아웃</a>
    </div>
</header>

<nav>
    <ul>
        <li>
            <div class="bar-top">
                <a href="#" class=bar-top id="salesToggle">판매</a>
            </div>
            <ul id="salesMenu">
                <li><a href="#">판매 조회</a></li>
                <li><a href="sales/sales-input">판매 입력</a></li>
            </ul>
        </li>
    </ul>
</nav>
</body>
</html>
