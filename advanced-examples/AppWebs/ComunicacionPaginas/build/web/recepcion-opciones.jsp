<%-- 
    Document   : recepcion-opciones
    Created on : Sep 8, 2019, 6:08:02 PM
    Author     : Cristhian Forero
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="assets/css/ejercicio4.css" rel="stylesheet" type="text/css"/>
        <title>JSP Destino opciones</title>
    </head>
    <body>
        
        <%
            // Extracción de los parámetros recibidos 
            String idioma = request.getParameter("idioma");
            String [] lenguajes = request.getParameterValues("lenguajes");
        %>
        
        <div class="main">
            <h1> Esta es la página destino</h1>
            <h2> Aquí se despliegan los datos que se recibieron</h2>
            
             <div class="idioma">
                <span>Tu idioma natal es: </span> 
                <span style="color: crimson"> <b><%= idioma %></b> </span>
            </div>
            
            <div class="lenguajes">
                <span>Manejas los siguientes lenguajes de programación: </span>
                <ul>
                <% for(int i = 0; i < lenguajes.length; i++){ %>                    
                    
                    <li><%= lenguajes[i] %></li>                    
                    
                <% } %>
                </ul>
        </div>
        
        <a href="envio-opciones.jsp">Regresar</a>
        
    </body>
</html>
