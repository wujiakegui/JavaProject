<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020/6/4
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/login">
    用户名：<input type="text"/><br/>
    密码：<input type="password"/><br/>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
