<%--
  Created by IntelliJ IDEA.
  User: zhongpu
  Date: 2022/1/6
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UTF-8</title>
</head>
<body>
<%
String name = (String) request.getAttribute("name");
%>
<%= name %>
</body>
</html>
