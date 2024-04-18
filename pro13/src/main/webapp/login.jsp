<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    request.setCharacterEncoding("utf-8");
%>
<html>
<head>
    <title>로그인창</title>
</head>
<body>
안녕하세요. 쇼핑몰 중심 JSP 시작입니다!!!
<br>
<h1>아이디를 입력하지 않았습니다. 아이디를 입력해주세요</h1>
<form action="result.jsp" method="post">
    아이디:<input type="text" name="userID"><br>
    비밀번호:<input type="password" name="userPw"><br>
    <input type="submit" value="로그인">
    <input type="reset" value="다시입력">
</form>
</body>
</html>
