<%-- 
    Document   : get
    Created on : 01-05-2014, 07:22:58 PM
    Author     : peligro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recibiendo parámetros por la URL</title>
    </head>
    <body>
        <h1>Recibiendo parámetros por la URL</h1>
        <p>El valor id = <%=request.getParameter("id")%></p>
        <p>El valor nom = <%=request.getParameter("nom")%></p>
    </body>
</html>
