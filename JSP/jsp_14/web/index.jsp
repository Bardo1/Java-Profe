<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>..:: Hola desde Java EE MVC  ::..</title>
    </head>
    <body>
        <h1>Hola desde Java EE MVC</h1>
        <ul>
            <li> Scriplet : <%=request.getAttribute("saludo") %> </li>
            <li> Expresion languaje : ${saludo} </li>
            <li> JSTL  :  <c:out value="${saludo}" /> </li>
        </ul>
    </body>
</html>
