<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%
    request.setCharacterEncoding("utf-8");
    request.setAttribute("id", "hong");
    request.setAttribute("pwd", "1234");
    request.setAttribute("name", "홍길동");
    request.setAttribute("email", "hong@test.com");
%>
<html>
<head>
    <title>forward1</title>
</head>
<body>
<jsp:forward page="member1.jsp"></jsp:forward>
</body>
</html>
