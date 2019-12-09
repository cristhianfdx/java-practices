<%-- 
    Document   : envio-datos
    Created on : Sep 8, 2019, 4:10:00 PM
    Author     : Cristhian Forero
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="assets/css/ejercicio2.css" rel="stylesheet" type="text/css"/>
        <title>JSP Inicio</title>
    </head>
    <body>
        
        <div class="main">
            <h1>Página de inicio</h1>
            
            <h2>Aquí se piden los datos</h2>
            
            <p>
                Hola, por favor introduce la información.
            </p>
            
            <form action="recepcion-datos.jsp" method="POST">
                <div class="control">
                    <label for="nombre">Nombre: </label>
                    <input type="text" name="nombre" placeholder="Ingrese nombre">
                </div>
                
                <div class="control">
                    <label for="color">Color favorito: </label>
                    <input type="text" name="color" placeholder="Ingrese color favorito">
                </div>
                
                <div class="control">
                    <label for="email">Email: </label>
                    <input type="email" name="email" placeholder="Ingrese email">
                </div>
                
                <div class="buttons">
                    <input type="reset" value="Borrar"> &nbsp;
                    <input type="submit" value="Enviar">
                </div>               
            </form>      
            
        </div>
        
        <a href="index.jsp">Inicio</a>
        
    </body>
</html>
