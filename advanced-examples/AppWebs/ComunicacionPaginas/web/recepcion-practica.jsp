<%-- 
    Document   : recepcion-practica
    Created on : Sep 8, 2019, 7:16:51 PM
    Author     : Cristhian Forero
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="assets/css/practica.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            // Extracción de los parámetros recibidos
            String [] datosPrincipales = {
                request.getParameter("nombre"),
                request.getParameter("apellido"),
                request.getParameter("email"),
                request.getParameter("genero")                                
            };            
            
            String [] lenguajes = {
                        request.getParameter("java"),            
                        request.getParameter("c"),
                        request.getParameter("javascript"),
                        request.getParameter("html")
                    };
            String [] idiomas = request.getParameterValues("idiomas");
            
            String comentario = request.getParameter("comentario");
            
                       
            
        %>
        
        <div style="min-width: 900px">
            <h1>Solicitud recibida</h1>
            <h2>Tus datos son:</h2>
            
            <table>
                <thead>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Email</th>
                    <th>Género</th>
                    <th>Tecnologías que maneja</th>
                    <th>Idiomas</th>                    
                </thead>
                <tbody>
                    <tr>
                        <% for(int i = 0; i < datosPrincipales.length; i++) {%>
                            <% if (datosPrincipales[i] != null) {%>
                                <td><%= datosPrincipales[i] %></td>
                            <% } %>
                        <% } %>
                        
                        <td>
                            <% for(int j = 0; j < lenguajes.length; j++) {%>
                                <% if (lenguajes[j] != null) {%>
                                    <%= lenguajes[j] + " , " %>
                                <% } %>
                            <% } %>
                        </td>
                        <td>
                            <% for(int k = 0; k < idiomas.length; k++) {%>
                                <% if (idiomas[k] != null) {%>
                                    <%= idiomas[k] + " , "%>
                                <% } %>
                            <% } %>
                        </td>                        
                        
                    </tr>                    
                </tbody>
            </table>
            <br>
            
            <% if (comentario != null) {%>
                <span>Comentarios: </span>
                <%= comentario %>
            <% } %>
            
        </div>
        <a href="practica.jsp">Regresar</a>
    </body>
</html>
