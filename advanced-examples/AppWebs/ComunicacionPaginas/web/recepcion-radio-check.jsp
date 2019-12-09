<%-- 
    Document   : recepcion-radio-check
    Created on : Sep 8, 2019, 5:14:27 PM
    Author     : Cristhian Forero
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="assets/css/ejercicio3.css" rel="stylesheet" type="text/css"/>
        <title>JSP Recepcion-Radio-Check</title>
    </head>
    <body>
        
        <%
            // Este es un scriptlet
            // Es código en Javaque captura los parámetros enviados
            // en el objeto "request"
            String transporte = request.getParameter("transporte");
            String [] destinos = {
                                  request.getParameter("ciudad"),
                                  request.getParameter("bosque"),
                                  request.getParameter("playa")
                                };                        
        %>
        
        <div class="main">
            <h1> Esta es la página destino</h1>
            
            <h2> Aquí se despliegan los datos que se recibieron</h2>
            
            <div class="transporte">
                <span>Tu transporte favorito es: </span> 
                <span style="color: crimson"> <b><%= transporte %></b> </span>
            </div>
            
            <div class="destinos">
                <span>Tus destinos favoritos son: </span>
                <ul>
                <% for(int i = 0; i < destinos.length; i++){ %>
                    
                    <% if(destinos[i] != null){ %>
                        <li><%= destinos[i] %></li>
                    <% } %>
                    
                <% } %>
                </ul>
            </div>
        </div>
        
        
        
        <a href="envio-radio-check.jsp">Regresar</a>
    </body>
</html>
