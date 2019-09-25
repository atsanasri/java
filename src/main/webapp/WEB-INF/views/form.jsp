<%--
  Created by IntelliJ IDEA.
  User: anasri
  Date: 25/09/2019
  Time: 01:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>new product</title>
</head>
<body>

<sf:form action="${form}" modelAttribute="product"  method="post" >

    <sf:input path="productname" placeholder="enter productname" name="productname"/><br>
    <sf:input path="info" placeholder="enter product information" name="info"/><br>
      <sf:button>add</sf:button>
</sf:form>

</body>
</html>
