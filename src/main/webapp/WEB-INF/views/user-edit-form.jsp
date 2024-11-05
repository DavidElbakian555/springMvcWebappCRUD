<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%--<%@ taglib prefix="c" uri="https://jakarta.ee/jstl/core" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <c:if test="${empty user.username}">
        <title>Add</title>
    </c:if>
    <c:if test="${!empty user.username}">
        <title>Edit</title>
    </c:if>
</head>
    <body>
        <c:if test="${empty user.username}">
            <c:url value="/add" var="var"/>
        </c:if>
        <c:if test="${!empty user.username}">
            <c:url value="/edit" var="var"/>
        </c:if>

        <form action="${var}" method="POST">
            <c:if test="${!empty user.username}">
                <input type="hidden" name="id" value="${user.id}">
            </c:if>

            <label for="username">Name</label>
            <input type="text" name="username" id="username">

            <label for="age">Age</label>
            <input type="text" name="age" id="age">

            <label for="email">Email</label>
            <input type="email" name="email" id="email">

            <c:if test="${empty user.id}">
                <input type="submit" value="Add new user">
            </c:if>
            <c:if test="${!empty user.id}">
                <input type="submit" value="Edit user">
            </c:if>
        </form>
    </body>
</html>
<%--<body>--%>
<%--    <c:url value="/edit" var="var"/>--%>
<%--    <form action="${var}" method="POST">--%>
<%--        <input type="hidden" name="id" value="${user.id}">--%>

<%--        <label for="title">Name</label>--%>
<%--        <input type="text" name="title" id="title">--%>

<%--        <label for="year">Age</label>--%>
<%--        <input type="text" name="year" id="year">--%>

<%--        <label for="genre">Email</label>--%>
<%--        <input type="email" name="email" id="genre">--%>

<%--        <input type="submit" value="Enter">--%>
<%--    </form>--%>
<%--</body>--%>
