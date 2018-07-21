<%-- 
    Document   : index
    Created on : 19-04-2014, 05:49:10 PM
    Author     : peligro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
String datos;
//datos ="hola mundo desde mi Scriptlets";
%>
<%
datos ="hola mundo desde mi Scriptlets";
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Primer ejemplo de JSP</title>
    </head>
    <body>
        <h1>Primer ejemplo de JSP ñandú</h1>
        <p><%=datos%></p>
    </body>
</html>


