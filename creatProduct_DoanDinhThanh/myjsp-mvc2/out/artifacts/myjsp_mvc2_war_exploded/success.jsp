<%--
  Created by IntelliJ IDEA.
  User: Pham Viet Khanh
  Date: 29/05/2020
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>


<jsp:useBean id="khanh" class="com.example.entity.User" scope="session"/>
<jsp:useBean id="product" class="com.example.entity.Product" scope="session"/>
<table border="1"width="90%">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Desc</th>
    </tr>
    <tr>
<th><jsp:getProperty name="product" property="id"/></th>
<th><jsp:getProperty name="product" property="name"/></th>
<th><jsp:getProperty name="product" property="pro_desc"/></th>
    </tr>
</table>
</body>
</html>
