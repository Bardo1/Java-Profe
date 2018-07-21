<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>Ejemplo de Hibernate</title>
    </head>
    <body>
        <h1>Ejemplo de Hibernate</h1>
        <p>hay  <c:out value="${datos.size()}" /> </p>
        <ul>
            <c:forEach items="${datos}" var="dato">
                <li>
                    ID : <c:out value="${dato.getId()}" /> 
                    <br />
               Nombre : <c:out value="${dato.getNombre()}" /> // E-Mail : <c:out value="${dato.getCorreo()}" />
                    
                </li>
            </c:forEach>
        </ul>
           
    </body>
</html>
