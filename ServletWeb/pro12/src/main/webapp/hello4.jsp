<%--
  Created by IntelliJ IDEA.
  User: poiu601
  Date: 2024-04-07
  Time: 오후 2:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%!
//    String name = "이순신";
//    public String getName(){return name;}
%>
<% String age = request.getParameter("age"); %>
<html>
<head>
    <title>표현식 연습</title>
</head>
<body>
<%--<h1>안녕하세요 <%=name %>님!</h1>--%>
<h1>나이는 <%=age %>입니다!</h1>
<h1>키는 <%=180 %>cm 입니다!!</h1>
<h1>나이 +10은 <%=Integer.parseInt(age)+10 %>살 입니다!!</h1>
</body>
</html>
