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
        
        <c:set var="dato" value="56666" /> 
        
        <c:choose>
            <c:when test="${ dato=='12' }">
                es igual a 12
            </c:when>
            
            <c:when test="${ dato=='1' }">
                es igual a 1
            </c:when>
            
            <c:when test="${ dato=='5' }">
                es igual a 5
            </c:when>
            <c:when test="${ dato=='23' }">
                    es igual a 23
            </c:when>
            <c:otherwise>
                    default
            </c:otherwise>
        </c:choose>

    </body>
</html>
