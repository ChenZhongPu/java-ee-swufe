<%--
  Created by IntelliJ IDEA.
  User: zhongpu
  Date: 2022/1/14
  Time: 下午1:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL</title>
</head>
<body>
<h1>Hello ${foo}</h1>
<h1>Hello <c:out value="${user}" default="Guest"/></h1>
<table>
    <c:forEach var="book" items="${bookArray}">
        <tr>
            <td>${book}</td>
        </tr>
    </c:forEach>
</table>
<c:if test="${balance > 88}">
    You are rich.
</c:if>
<br>
<c:if test="${name == 'Mary'}">
    You are Mary.
</c:if>
<br>
<c:choose>
    <c:when test="${balance > 88}">
        You are rich.
    </c:when>
    <c:otherwise>
        You are poor.
    </c:otherwise>
</c:choose>

<table>
    <tr>
        <th>Title</th>
        <th>Count</th>
    </tr>
    <c:forEach var="book" items="${bookCount}">
        <tr>
            <td>${book.key}</td>
            <td>${book.value}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
