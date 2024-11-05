<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%--<%@ taglib uri="https://jakarta.ee/jstl/core" prefix="c" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>USERS LIST</title>
</head>
<body>
    <h2>Users list page</h2>

    <table>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>age</th>
            <th>email</th>
        </tr>

        <c:forEach var = "user" items = "${usersList}">

            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.age}</td>
                <td>${user.email}</td>
                <td>
                    <a href="/edit/${user.id}">EDIT</a>
                    <a href="/delete/${user.id}">DELETE</a>
                </td>
            </tr>
        </c:forEach>
    </table>

    <h2>ADD</h2>
    <c:url value="/add" var="add"/>
    <a href="${add}">Add new USER</a>
</body>
</html>