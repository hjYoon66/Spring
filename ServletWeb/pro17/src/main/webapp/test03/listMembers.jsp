<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8"
         isELIgnored="false"
%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<html>
<head>
    <c:choose>
        <c:when test='${msg eq "addMember"}'>
            <script>
                window.onload = function(){
                    alert("회원을 등록했습니다.");
                }
            </script>
        </c:when>
        <c:when test='${msg eq "modified"}'>
            <script>
                window.onload = function(){
                    alert("회원을 수정했습니다.");
                }
            </script>
        </c:when>
        <c:when test='${msg eq "deleted"}'>
            <script>
                window.onload = function(){
                    alert("회원을 삭제했습니다.");
                }
            </script>
        </c:when>
    </c:choose>

    <title>회원 정보 출력창</title>
    <style>
        .cls1{
            font-size: 40px;
            text-align: center;
        }
        .cls2{
            font-size: 20px;
            text-align: center;
        }
    </style>
</head>
<body>
    <p class="cls1">회원 정보</p>
    <table align="center" border="1">
        <tr align="center" bgcolor="lightgreen">
            <td width="7%"><b>아이디</b></td>
            <td width="7%"><b>비밀번호</b></td>
            <td width="7%"><b>이름</b></td>
            <td width="7%"><b>아이디</b></td>
            <td width="7%"><b>가입일</b></td>
            <td width="7%"><b>수정</b></td>
            <td width="7%"><b>삭제</b></td>

        </tr>
        <c:choose>
            <c:when test="${membersList eq null}">
                <tr>
                    <td colspan="5">
                        <b>등록된 회원이 없습니다.</b>
                    </td>
                </tr>
            </c:when>
            <c:when test="${membersList ne null}">
                <c:forEach var="mem" items="${membersList}">
                    <tr align="center">
                        <td>${mem.id}</td>
                        <td>${mem.pwd}</td>
                        <td>${mem.name}</td>
                        <td>${mem.email}</td>
                        <td>${mem.joinDate}</td>
                        <td><a href="${contextPath}/member/modMemberForm.do?id=${mem.id} ">수정</a></td>
                        <td><a href="${contextPath}/member/delMember.do?id=${mem.id} ">삭제</a></td>
                    </tr>
                </c:forEach>
            </c:when>
        </c:choose>
    </table>
    <a href="${contextPath}/member/memberForm.do">
        <p class="cls2">회원 가입하기</p>
    </a>
</body>
</html>
