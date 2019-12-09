<%-- 
    Document   : envio-textarea
    Created on : Sep 8, 2019, 6:41:20 PM
    Author     : cristhian Forero
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="assets/css/ejercicio5.css" rel="stylesheet" type="text/css"/>
        <title>JSP Area de texto</title>
    </head>
    <body>
        <div class="main">
            <h1> Area de texto</h1>
            <p> Se puede desplegar texto por default </p>
            
            <form action="recepcion-textarea.jsp" method="POST">
                <div class="control">
                    <textarea name="area1" rows="3" cols="30"> 
                        Si la cantidad de palabras del texto es mayor a los tres renglones que se 
                        especificaron para esta area de texto, entonces se despliega automáticamente 
                        una barra de desplazamiento vertical.
                    </textarea>
                </div>
                
                <p> Ó puede ser un area en blanco para capturar texto </p>
                <div class="control">
                    <textarea name="area2" rows="4" cols="60"></textarea>
                </div>
                
                <div class="buttons">
                    <input type="submit" value="Enviar">
                </div>
            </form>           
            
        </div>
        
        <a href="index.jsp">Inicio</a>
    </body>
</html>
