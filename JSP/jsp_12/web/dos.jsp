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
        
        <c:set var="dato" value="1" />   
        
        <c:if test="${ dato=='1' }" var="dato" scope="page">
            <hr />
            texto dentro de la condición
        </c:if>
    </body>
</html>
