<%@ page import="sec01.ex01.MemberBean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%
    request.setCharacterEncoding("utf-8");
    MemberBean member = new MemberBean("lee", "1234", "이순신", "lee@test.com");
    request.setAttribute("member", member);

%>
<html>
<head>
    <title>forward1</title>
</head>
<body>
<jsp:forward page="member2.jsp"></jsp:forward>
</body>
</html>
