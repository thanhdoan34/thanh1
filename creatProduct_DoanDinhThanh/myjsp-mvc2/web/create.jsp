<%--
  Created by IntelliJ IDEA.
  User: Doan Dinh Thanh
  Date: 05/06/2020
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>create Product</title>
</head>
<body>
<h2> create Product </h2>

<form action="CreateController" method="post">
    ID:<input type="text" name="id"><br/><br/>
    Name:   <input type="text" name="name"><br/><br/>
    Desc:    <input type="text" name="pro_desc"><br/><br/>
    <input type="submit" value="Create">
</form>

</body>
</html>
