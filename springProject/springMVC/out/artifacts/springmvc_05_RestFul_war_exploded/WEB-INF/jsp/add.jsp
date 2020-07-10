<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>

    <title>Title</title>

</head>

<body>

<form action="${pageContext.request.contextPath}/add" method="post">

    id:<input type="text" name="id"><br>

    用户名：<input type="text" name="name"><br>

    密码：<input type="text" name="password"><br>

    <input type="submit">

</form>

</body>

</html>