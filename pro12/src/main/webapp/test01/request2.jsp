<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    String name = (String) request.getAttribute("name");
    String address = (String) request.getAttribute("address");
%>
<html>
<head>
</head>
<body>
이름은 <%=name %>입니다. <br>
주소는 <%=address %>입니다. <br>
</body>
</html>
