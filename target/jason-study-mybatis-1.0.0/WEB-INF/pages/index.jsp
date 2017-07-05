<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test</title>
</head>
<body>
    <h2>Hello World!</h2>
    <sf:form method="post" action="/toJson" modelAttribute="user">
        用户名：<sf:input path="username" />
        密  码：<sf:password path="password" />
        <input type="submit" value="提交" />
    </sf:form>
</body>
</html>


