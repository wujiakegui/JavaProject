<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020/6/4
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>下载页面</title>
</head>
<body>
<h3>下载列表</h3>
<table>
    <tr>
        <td>文件名称</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${filenames}" var="file">
        <tr>
            <td>${file.value}</td>
            <td><a href="${pageContext.request.contextPath}/download?filename=${file.key}">下载</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
