<%-- 
    Document   : form
    Created on : 01-05-2014, 06:52:57 PM
    Author     : peligro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Trabajo con formularios</title>
    </head>
    <body>
        <h1>Ingrese sus datos</h1>
        
        <form action="form2.jsp" method="post" name="form">
            
            <p>Nombre : <input type="text" name="nom" /></p>
            <p>E-mail : <input type="text" name="correo" /></p>
            <p>País : 
                <select name="pais">
                    <option value="cl">Chile</option>
                    <option value="pe">Perú</option>
                    <option value="co">Colombia</option>
                    <option value="ve">Venezuela</option>
                    <option value="mx">México</option>
                    <option value="ar">Argentina</option>
                </select>
            </p>
            <p>
                Sexo M: <input type="radio" name="sexo" value="m" /> F: <input type="radio" name="sexo" value="f" />
            
            </p>
            <p>
            <hr />
            <input type="submit" value="Enviar" title="Enviar" />
            </p>
        </form>
        
    </body>
</html>
