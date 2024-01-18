<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>

    <h1>You have visited the website <c:out value="${counter}"/></h1>
    <a href="/">Test another visit?</a>

    <form action="" method="post">
        <button type="submit">Click me to reset counter</button>
    </form>

    </body>
</html>