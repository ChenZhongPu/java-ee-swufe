<%@ page import="com.swufe.javaee.el.model.User" %><%--
  Created by IntelliJ IDEA.
  User: zhongpu
  Date: 2022/1/13
  Time: 下午9:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL</title>
    <%@ include file="css.html" %>
</head>
<body class="d-flex flex-column h-100">
${name}
<br>
${user.name}
<br>
${user.favourite.price}
<br>
${requestScope.user.name}
<%@ include file="foot.html" %>
</body>
</html>
