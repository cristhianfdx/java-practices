<%-- 
    Document   : recepcion-datos
    Created on : Sep 8, 2019, 4:10:14 PM
    Author     : Cristhian Forero
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="assets/css/ejercicio2.css" rel="stylesheet" type="text/css"/>
        <title>JSP Destino</title>
    </head>
    <body>
        
        <%
            //Scriptlet
            String nombre = request.getParameter("nombre");
            String color = request.getParameter("color");
            String email = request.getParameter("email");
        %>
        
        <div class="main">
            <h1>Esta es la página de destino</h1>
            
            <h2>Aquí se muestran los datos recibidos</h2>
            
            <p>Tus datos son los siguientes:</p>
            
            <table>
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Color favorito</th>
                        <th>Email</th>
                    </tr>                    
                </thead>
                <tbody>
                    <tr>
                        <td><%= nombre %></td>
                        <td><%= color %></td>
                        <td><%= email %></td>
                    </tr>
                </tbody>
            </table>
            
            <a href="envio-datos.jsp">Regresar</a>
            
        </div>
    </body>
</html>
