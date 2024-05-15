<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>표현 언어에서 사용되는 데이터들</title>
</head>
<body>
<h1>표현 언어로 여러 가지 데이터 출력하기</h1>
<h1>
    \${100}: ${100}<br>
    \${"안녕하세요"}: ${"안녕하세요"}<br>
    \${10+1}: ${10+1}<br>
    \${"10"+1} : ${"10"+1 }<br>
    <%--\${null+10 }: ${null+10 }<br> --%>
    <%--\${"안녕"+11 }: ${"안녕"+11 }<br> --%>
    <%--\${"hello"+"world"}:${"hello"+"world"}<br> --%>
</h1>

</h1>
</body>
</html>
