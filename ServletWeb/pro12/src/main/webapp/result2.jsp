<%--
  Created by IntelliJ IDEA.
  User: poiu601
  Date: 2024-04-07
  Time: 오후 2:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    request.setCharacterEncoding("utf-8");
    String user_id = request.getParameter("user_id");
    String user_pw = request.getParameter("user_pw");
%>
<html>
<head>
    <title>결과 출력창</title>
</head>
<body>
<%
    if (user_id == null || user_id.length() == 0) {
%>
아이디를 입력하세요.<br>
<a href="/login.html">로그인 하기</a>
<%
} else {
%>
<h1>환영합니다. <%=user_id%>님!!!!</h1>
<%
    }
%>

</body>
</html>
