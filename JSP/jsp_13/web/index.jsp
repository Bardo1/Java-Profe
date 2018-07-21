<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta charset="utf-8" />
        <title>Conexión MySQL con JSTL</title>
    </head>
    <body>
        <h1>Conexión MySQL con JSTL</h1>
        <sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/test" user="root" password="" var="con" />
        
        <sql:query dataSource="${con}" var="resultados">
            select id,nombre from usuarios;
        </sql:query>
            
            <ul>
            <c:forEach var="filas" items="${resultados.rows}">
                <li>
                    ID : <c:out value="${filas.id}" /><br>
                    Nombre: <c:out value="${filas.nombre}" />
                    <hr>
                </li>
            </c:forEach>    
            </ul>
        
    </body>
</html>
