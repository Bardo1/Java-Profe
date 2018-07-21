
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <%@include file="header.jsp" %>
        <title>Usuarios</title>
    </head>
    <body>
        <ol class="breadcrumb">
            <li><a href="<%=request.getContextPath()%>/user">Home</a></li>
            <li class="active">Agregar usuario</li>
        </ol>
        <h1>Agregar usuario</h1>
        <form name="form" action="<%=request.getContextPath()%>/agregar_post" method="post">
            
            
  <div class="form-group">
    <label for="exampleInputEmail1">Nombre</label>
    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="Nombre" name="nom" />
  </div>
            
  <div class="form-group">
    <label for="exampleInputEmail1">E-Mail</label>
    <input type="email" class="form-control" id="exampleInputEmail1" placeholder="E-Mail" name="correo" />
  </div>
 
  <button type="submit" class="btn btn-default">Enviar</button>
</form>
           
    </body>
</html>
