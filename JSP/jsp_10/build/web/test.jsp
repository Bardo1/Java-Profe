<%-- 
    Document   : index
    Created on : 11-05-2014, 07:07:51 PM
    Author     : peligro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta charset="utf-8" />
        <title>Ejemplo de EJB</title>
    </head>
    <body>
        <h1>Ejemplo de EJB ñandú</h1>
        <jsp:useBean id="t" scope="request" class="com.jsp_10.modelos.testModel" />
        
        El nombre desde el EJB es : <jsp:getProperty name="t" property="nombre" />
        <hr />
        El E-Mail es : <jsp:getProperty name="t" property="correo" />
        
    </body>
</html>
