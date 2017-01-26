<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lobby</title>
</head>
<body>
<ul>
    <c:forEach items="${players}" var="player">
        <li>${player.login}</li>
    </c:forEach>
</ul>
</body>
</html>