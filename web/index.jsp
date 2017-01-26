<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Connexion</title>
</head>
<body>
<form action="Lobby" method="POST">
    <h1>Veuillez renseigner votre nom utilisateur</h1>
    <input type="text" name="login" placeholder="Your Name">
    <input type="submit" value="Soumettre">
    <c:choose>
        <c:when test="${notValid}">
            <h2>Pseudo déjà pris, veuillez en sélectionner un autre</h2>
        </c:when>
    </c:choose>
</form>
</body>
</html>