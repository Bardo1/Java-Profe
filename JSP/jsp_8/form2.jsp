<%-- 
    Document   : form2
    Created on : 01-05-2014, 07:08:18 PM
    Author     : peligro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8"); 
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Recibiendo el formulario</title>
    </head>
    <body>
        <h1>Recibiendo el formulario</h1>
        <p>Tu IP : <%=request.getRemoteAddr()%></p>
        <p>Tu server es <%=request.getServerName()%></p>
        <p>
           Tu nombre es : <%=request.getParameter("nom")%>
        </p>
         <p>
           Tu E-Mail es : <%=request.getParameter("correo")%>
        </p>
         <p>
           Tu país es : <%=request.getParameter("pais")%>
        </p>
         <p>
           Tu sexo es : <%=request.getParameter("sexo")%>
        </p>
    </body>
</html>
