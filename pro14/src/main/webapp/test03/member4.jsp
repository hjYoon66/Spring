<%@ page language="java" contentType="text/html; charset=UTF-8"
         import="java.util.*,sec01.ex01.*"
         pageEncoding="UTF-8"  isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    request.setCharacterEncoding("UTF-8");
%>
<c:set var="id" value="hong" scope="page"/>
<c:set var="pwd" value="1234" scope="page"/>
<c:set var="name" value="${'홍길동'}" scope="page"/>
<c:set var="age" value="${22}" scope="page"/>
<c:set var="height" value="${177}" scope="page"/>
<html>
<head>
    <meta  charset=”UTF-8">
    <title>조건식 실습</title>
</head>
<body>

</body>
</html>