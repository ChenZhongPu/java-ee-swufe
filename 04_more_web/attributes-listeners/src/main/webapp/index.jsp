<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<br/>
<%
    // if accessed from '/test', s will be bar
    // if accessed from '/' directly, s will be null.
    // `config` is the implicit variable for ServletConfig
    String s = config.getInitParameter("foo");
    out.println(s);
%>
<br/>
<%
    // `application` the the implicit variable for ServletContext
    String email = application.getInitParameter("adminEmail");
    out.println(email);
%>
</body>
</html>