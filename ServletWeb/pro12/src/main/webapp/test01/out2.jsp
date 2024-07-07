<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    request.setCharacterEncoding("utf-8");
    String name = request.getParameter("name");
    String age = request.getParameter("age");
%>
<html>
<head>
</head>
<body>
<%
    if (name != null || name.length() != 0) {
%>
<h1><%=name %>, <%=age %>
</h1>
<%
} else {
%>
<h1>이름을 입력하세요</h1>
<%
    }
%>

<%
    if (name != null || name.length() != 0) {
%>
<h1><% out.println(name + " , " + age); %></h1>
<%
} else {
%>
<h1>이름을 입력하세요</h1>
<%
    }
%>
</body>
</html>
