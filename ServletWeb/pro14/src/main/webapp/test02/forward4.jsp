<%@ page import="sec01.ex01.MemberBean" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%
    request.setCharacterEncoding("utf-8");
    request.setAttribute("id", "hong");
    request.setAttribute("pwd", "1234");
    request.setAttribute("name", "홍길동");
    application.setAttribute("email", "hong@test.com");
//    request.setAttribute("address", "서울시 강남구");

%>
<html>
<head>
    <title>forward4</title>
</head>
<body>
<jsp:forward page="member4.jsp"></jsp:forward>
</body>
</html>
