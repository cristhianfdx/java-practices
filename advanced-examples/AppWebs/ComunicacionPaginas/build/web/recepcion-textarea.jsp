<%-- 
    Document   : recepcion-textarea
    Created on : Sep 8, 2019, 6:41:09 PM
    Author     : cristhian Forero
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="assets/css/ejercicio5.css" rel="stylesheet" type="text/css"/>
        <title>JSP Recepcion-textarea</title>
    </head>
    <body>
        
        <%
            // Extracción de los parámetros recibidos
            String areaTexto = request.getParameter("area2");
        %>
        
        <div class="main">
            <h1> Esta es la página destino</h1>
            <h2> Aquí se despliegan los datos que se recibieron</h2>
            
            <div class="texto">
                <span>El usuario escribió: </span> 
                <span style="color: crimson"> <b><%= areaTexto %></b> </span>
            </div>
            
        </div>
            
            <a href="envio-textarea.jsp">Regresar</a>
    </body>
</html>
