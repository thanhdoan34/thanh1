<%--
  Created by IntelliJ IDEA.
  User: Doan Dinh Thanh
  Date: 05/06/2020
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sql"  uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Product</title>
</head>
<body>
<sql:setDataSource var="myDatasource" driver="com.mysql.jdbc.Driver"
                   url="jdbc:mysql://127.0.0.1:3306/t1808a1_sem4?serverTimezone=UTC"
                   user="root"
                   password=""/>

<sql:query var="result"  dataSource="${myDatasource}">
    SELECT * FROM product;
</sql:query>
<table>
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>desc</td></tr>

    <c:forEach var="row" items="${result.rows}">
        <tr>
            <td><c:out value="${row.id}"/></td>
            <td><c:out value="${row.name}"/></td>
            <td><c:out value="${row.pro_desc}"/></td></tr>


    </c:forEach>
</table>

</body>
</html>

