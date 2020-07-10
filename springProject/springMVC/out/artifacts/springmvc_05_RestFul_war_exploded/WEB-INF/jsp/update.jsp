<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>

    <title>Title</title>

</head>

<body>

<form action="${pageContext.request.contextPath}/update" method="post">

    <table>

        <tr>

            <td>id</td>

            <td><input type="text" name="id" value="${user.id}" readonly="readonly"></td>

        </tr>

        <tr>

            <td>用户名</td>

            <td><input type="text" name="name" value="${user.name}"></td>

        </tr>

        <tr>

            <td>密码</td>

            <td><input type="text" name="password" value="${user.password}"></td>

        </tr>

    </table>

    <!--将请求的方式设为PUT-->

    <input type="hidden" name="_method" value="PUT">

    <input type="submit">

</form>

</body>

</html>