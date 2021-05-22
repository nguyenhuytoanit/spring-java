<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<body>


<form action="/createEmployee" method="post">
    <label for="name">name: </label>
    <input type="text" id="name" name="name"><br><br>
    <label for="wage">wage: </label>
    <input type="text" id="wage" name="wage"><br><br>

    <input type="submit" value="Submit">
</form>


</body>
</html>
