<%--
  Created by IntelliJ IDEA.
  User: zhongpu
  Date: 2022/1/14
  Time: 00:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL with []</title>
    <%@ include file="css.html" %>
</head>
<body class="d-flex flex-column h-100">
${bookArray[0]}

<br>
${bookCount[bookArray[0]]}
<%@ include file="foot.html" %>
</body>
</html>
