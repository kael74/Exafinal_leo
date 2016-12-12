<%-- 
    Document   : login
    Created on : 09-dic-2016, 11:54:10
    Author     : UPEU
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="resources/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css"/>
        <link href="<c:url value="resources/css/materialize.css"/>" rel="stylesheet" type="text/css"/>
        <link href="<c:url value="resources/css/materialize.min.css"/>" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body class="yellow lighten-4">
        <div class="container">
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <header class="text-center card-panel blue-grey white-text">ExaEND Technology</header>
        <form method="POST" action="log" class="card-panel ">
            
            <div>
                <a>Correo</a>
                <input type="text" class="col-lg-12" name="user">
            </div>
            <br>
            <div>
                <a>Contraseña</a>
                <input type="password" class="col-lg-12" name="pass">
            </div>
            <br>
            <div>
                <button class="btn btn-danger">Ingresar</button>
            </div>
            
        </form>
        </div>
        <div class="col-md-4"></div>
        </div>
        <script src="<c:url value="resources/js/bootstrap.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="resources/js/bootstrap.js"/>" type="text/javascript"></script>
        <script src="<c:url value="resources/js/materialize.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="resources/js/materialize.js"/>" type="text/javascript"></script>
    </body>
</html>
