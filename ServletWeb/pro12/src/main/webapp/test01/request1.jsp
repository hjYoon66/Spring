<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    request.setAttribute("name","이순신");
    request.setAttribute("address","서울시 강남구");
%>
<html>
<head>
</head>
<body>
<%
    RequestDispatcher dispatch = request.getRequestDispatcher("request2.jsp");
    dispatch.forward(request, response);
%>
</body>
</html>
