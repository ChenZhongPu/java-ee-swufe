<%--
  Created by IntelliJ IDEA.
  User: zhongpu
  Date: 3/3/21
  Time: 10:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>Beer Recommended JSP</title>
</head>
<body>
<%
    List<String> styles = (List<String>) request.getAttribute("styles");
    out.println("<br/>this is a jsp page");
    for (String brand: styles) {
        out.println("<br/>try: " + brand);
    }
%>

</body>
</html>
