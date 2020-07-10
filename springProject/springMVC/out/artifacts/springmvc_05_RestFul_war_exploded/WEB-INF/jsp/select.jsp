<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@page isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>

    <title>Title</title>

</head>

<body>

<table>

    <tr>

        <td>id</td>

        <td>用户名</td>

        <td>密码</td>

        <td></td>

        <td></td>

    </tr>

    <c:forEach items="${users}" var="user">

        <tr>

            <td>${user.id}</td>

            <td>${user.name}</td>

            <td>${user.password}</td>

            <td>

                <form action="${pageContext.request.contextPath}/select/${user.id}" method="get">

                    <button type="submit">修改</button>

                </form>

            </td>

            <td>

                <form action="${pageContext.request.contextPath}/delete/${user.id}" method="post">

                    <!--将请求的方式设为DELETE-->

                    <input type="hidden" name="_method" value="DELETE">

                    <button type="submit">删除</button>

                </form>

            </td>

        </tr>

    </c:forEach>

</table>

</body>

</html>