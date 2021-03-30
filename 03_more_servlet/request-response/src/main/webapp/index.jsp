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
<a href="SelectBeerServlet?body=large&amount=100&sizes=10oz&sizes=11oz">SelectBeer URL</a>
<br/>
<a href="selectbeer.html">SelectBeer Form</a>
<br/>
<a href="ClientInfoServlet">Client Info</a>
<br/>
<a href="image">Image</a>
<br/>
<a href="image/beer.jpeg">Image URL</a>
<br/>
<a href="redirect">Redirect</a>
<br/>
<a href="DispatchServlet">Dispatch</a>
</body>
</html>