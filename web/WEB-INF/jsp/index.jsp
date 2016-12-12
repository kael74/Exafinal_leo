<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ExaEnd</title>
        <link href="<c:url value="resources/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css"/>
        <link href="<c:url value="resources/css/materialize.css"/>" rel="stylesheet" type="text/css"/>
        <link href="<c:url value="resources/css/materialize.min.css"/>" rel="stylesheet" type="text/css"/>

    </head>

    <body>
    <nav class="navbar navbar-default navbar-inverse">
        <a class="navbar-brand" href="#">ExaEND</a>
        <a href="empleado" > Prueba</a>
        
    </nav>
    <div class="container">
        <aside>
            <c:out value="${usuario}" />
        </aside>
        <c:forEach var="ro" begin="0" items="${rol}">
            
            <div><c:out value="${ro.rol}" /></div>
            <div><c:out value="${ro.privilegio}" /></div>
            
        </c:forEach>
        <c:forEach var="per" begin="0" items="${persona}">
            
            <div><c:out value="${per.nombres}" /></div>
            <div><c:out value="${per.apellidos}" /></div>
            
        </c:forEach>    
    </div>      
        <script src="<c:url value="resources/js/bootstrap.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="resources/js/bootstrap.js"/>" type="text/javascript"></script>
        <script src="<c:url value="resources/js/materialize.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="resources/js/materialize.js"/>" type="text/javascript"></script>
    </body>
</html>
