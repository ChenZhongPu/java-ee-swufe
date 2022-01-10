<%--
  Created by IntelliJ IDEA.
  User: zhongpu
  Date: 2022/1/9
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<%
String result = (String) request.getAttribute("result");
%>
<%= result %>
</body>
</html>
