<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<h2>
    <a href="/add-employee">Thêm nhân viên</a>
</h2>

<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Wage</th>
    </tr>
    <c:forEach items="${employees}" var="e">
        <tr>
            <td>${e.id}</td>
            <td>${e.name}</td>
            <td>${e.wage}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
