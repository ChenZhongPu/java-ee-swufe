<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: zhongpu
  Date: 2022/1/2
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h1>Recommendation:</h1>
<%
    List<String> books = (List<String>) request.getAttribute("books");
    for (String b : books) {
%>
<%= b %><br>
<% } %>
</body>
</html>
