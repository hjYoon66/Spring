<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%
    request.setCharacterEncoding("UTF-8");
    String id = (String) request.getAttribute("id");
    String pwd = (String) request.getAttribute("pwd");
    String name = (String) request.getAttribute("name");
    String email = (String) request.getAttribute("email");

%>
<html>
<head>
    <title>회원 정보 출력 창</title>
</head>
<body>
<table border="1"  align="center" >
    <tr align="center" bgcolor="#99ccff">
        <td width="20%"><b>아이디</b></td>
        <td width="20%"><b>비밀번호</b></td>
        <td width="20%" ><b>이름</b></td>
        <td width="20%"><b>이메일</b></td>
    </tr>
    <tr align=center>
        <td>${member.id}</td>
        <td>${member.pwd}</td>
        <td>${member.name}</td>
        <td>${member.email}</td>
    </tr>

</table>

</body>
</html>
