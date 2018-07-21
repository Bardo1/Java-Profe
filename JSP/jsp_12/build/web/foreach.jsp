<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>JSTL</title>
    </head>
    <body>
        <h1>JSTL</h1>
        <jsp:useBean id="l" scope="session" class="com.cesarcancino.com.beans.Lista" />
        <ul>
        <c:forEach var="valor" items="${ l.listaDeNombres }">
            <li><c:out value="${valor}" /></li>
        </c:forEach>
            </ul>
       
    </body>
</html>
