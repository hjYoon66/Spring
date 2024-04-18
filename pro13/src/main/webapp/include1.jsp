<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    request.setCharacterEncoding("utf-8");
%>
<html>
<head>
    <title>인클루드1</title>
</head>
<body>
안녕하세요. 쇼핑몰 중심 JSP 시작입니다!!!
<br>
<jsp:include page="duke_image.jsp" flush="true">
    <jsp:param name="name" value="듀크"/>
    <jsp:param name="imgName" value="duke.png"/>
</jsp:include>
<br>
안녕하세요. 쇼핑몰 중심 JSP 끝 부분입니다!!!
</body>
</html>
