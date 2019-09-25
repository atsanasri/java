<%--
  Created by IntelliJ IDEA.
  User: anasri
  Date: 15/09/2019
  Time: 03:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>home</title>
</head>
<body>
<div >
    <a  href="<c:url value='/form'/>">Add product</a>

<table >
    <tr>
        <th>productname</th>
        <th>info</th>

    </tr>
    <tbody>
    <c:forEach var="inf" items="${map}">

        <tr>
            <td>${inf.value}</td>
            <td>${inf.value}</td>
        </tr>
    </c:forEach>

    </tbody>
</table>
</div>

</body>
</html>
