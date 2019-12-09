<%-- 
    Document   : envio-opciones
    Created on : Sep 8, 2019, 6:07:49 PM
    Author     : Cristhian Forero
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="assets/css/ejercicio4.css" rel="stylesheet" type="text/css"/>
        <title>JSP Lista opciones</title>
    </head>
    <body>
        <div class="main">
            <h1> Esta es la página de inicio</h1>
            <h2> Aquí se piden los datos </h2>
            
            <form action="recepcion-opciones.jsp" method="POST">
                <div class="control">
                    <label for="idioma">Idioma natal: </label>
                    <select name="idioma">
                        <option selected disabled>Seleccione idioma</option>
                        <option>Español</option>
                        <option>Inglés</option>
                        <option>Francés</option>
                        <option>Alemán</option>
                    </select>                    
                </div>
                
                <div class="control">                    
                    <label for="lenguajes">Lenguaje de programación: </label>
                    <select name="lenguajes" multiple>
                        <option>Java</option>
                        <option>C/C++</option>
                        <option>Basic</option>
                        <option>Python</option>
                        <option>Pascal</option>
                    </select>
                    <br>
                    <span style="color: crimson">
                        (ctrl-clic para elegir varias opciones)
                    </span>
                    
                </div>
                
                <div class="buttons">                    
                    <input type="submit" value="Enviar">
                </div>               
            </form> 
        </div>
        
         <a href="index.jsp">Inicio</a>
         
    </body>
</html>
