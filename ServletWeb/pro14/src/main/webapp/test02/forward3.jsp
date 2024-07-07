<%@ page import="sec01.ex01.MemberBean" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%
    request.setCharacterEncoding("utf-8");
    List membersList = new ArrayList<>();
    MemberBean m1 = new MemberBean("lee", "1234", "이순신", "lee@test.com");
    MemberBean m2 = new MemberBean("son", "1234", "손흥민", "son@test.com");
    membersList.add(m1);
    membersList.add(m2);
    request.setAttribute("membersList", membersList);


%>
<html>
<head>
    <title>forward3</title>
</head>
<body>
<jsp:forward page="member3.jsp"></jsp:forward>
</body>
</html>
