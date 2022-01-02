<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<h2><%= java.time.LocalDate.now() %></h2>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>