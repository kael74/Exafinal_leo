<%-- 
    Document   : Trabajador
    Created on : 12/12/2016, 03:59:49 AM
    Author     : Admin2
--%>
<% if(request.getSession().getAttribute("permiso").equals(3)) {%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-default navbar-inverse">
        <a class="navbar-brand" href="#">ExaEND</a>
        <a href="index" > Prueba</a>
        </nav>
        <h1>admin</h1>
    </body>
</html>
<%} else{
    response.sendRedirect("cliente");
}%>