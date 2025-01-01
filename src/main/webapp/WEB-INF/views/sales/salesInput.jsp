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
    <a href="../dashboard"><div class="logo">YOUNG THE</div></a>
    <div class="search-bar">
        <input type="text" placeholder="무엇이든 검색하세요!">
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
                <li><a href="#">판매 입력</a></li>
            </ul>
        </li>
    </ul>
</nav>

<main>
    <h1>판매 입력</h1>
    <div class="form-section">
        <div class="form-group">
            <label for="date">입자</label>
            <input type="date" id="date" name="date">
        </div>
        <div class="form-group">
            <label for="buyer">거래처</label>
            <input type="text" id="buyer" name="buyer">
        </div>
        <div class="form-group">
            <label for="remarks">비고</label>
            <input type="text" id="remarks" name="remarks">
        </div>
        <div class="form-group">
            <label for="tax">부가세 적용</label>
            <select id="tax" name="tax">
                <option>적용</option>
                <option>미적용</option>
            </select>
        </div>
    </div>

    <table>
        <thead>
        <tr>
            <th>품목코드</th>
            <th>품목명</th>
            <th>규격</th>
            <th>수량</th>
            <th>단가</th>
            <th>공급가액</th>
            <th>비고</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td><input type="text"></td>
            <td><input type="text"></td>
            <td><input type="text"></td>
            <td><input type="number"></td>
            <td><input type="number"></td>
            <td><input type="number"></td>
            <td><input type="text"></td>
        </tr>
        </tbody>
    </table>
</main>
</body>
</html>
