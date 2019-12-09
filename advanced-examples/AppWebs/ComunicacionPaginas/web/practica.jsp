<%-- 
    Document   : practica
    Created on : Sep 8, 2019, 5:58:53 PM
    Author     : Cristhian Forero
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="assets/css/practica.css" rel="stylesheet" type="text/css"/>
        <title>JSP Practica</title>        
    </head>
    <body>
        <div class="main">
            <h1>Solicitud</h1>
            
            <p>
                Después de introducir los datos oprime el botón <i>"enviar".</i>
            </p>
            
            <form action="recepcion-practica.jsp" method="POST">
                <div class="control">
                    <label for="nombre">Nombre: </label>
                    <input type="text" name="nombre" placeholder="Ingrese nombre">
                </div>
                
                <div class="control">
                    <label for="apellido">Apellido: </label>
                    <input type="text" name="apellido" placeholder="Ingrese apellido">
                </div>
                
                <div class="control">
                    <label for="email">Email: </label>
                    <input type="email" name="email" placeholder="Ingrese email">
                </div>
                
                <div style="margin: 10px 0">
                    <span>Género: </span> &nbsp;
                    <span>Hombre</span> 
                    <input type="radio" name="genero"
                           value="masculino"> &nbsp;
                    <span>Mujer</span>
                    <input type="radio" name="genero"
                        value="femenino">
                </div>
                
                <div style="margin: 15px 0">
                    <span>Selecciona lo que sabes: </span> <br>
                    <span>Java</span> 
                    <input type="checkbox" name="java"
                           value="Java"> &nbsp;
                    <span>C/C++</span>
                    <input type="checkbox" name="c"
                        value="C/C++"> &nbsp;
                    <span>Javascript</span>
                    <input type="checkbox" name="js"
                        value="Javascript"> &nbsp;
                    <span>HTML</span>
                    <input type="checkbox" name="html"
                        value="HTML">
                </div>
                
                <div class="control">
                    <label for="idiomas">Idiomas que comprendes: </label>
                    <select name="idiomas" multiple>
                        <option>Español</option>
                        <option>Inglés</option>
                        <option>Francés</option>
                        <option>Alemán</option>
                    </select>                    
                </div>
                <br>
                <div class="control">
                    <span>Comentarios adicionales: </span> <br> <br>
                    <textarea name="comentario" rows="4" cols="60"></textarea>
                </div>
               
                <div class="buttons">
                    <input type="reset" value="Borrar"> &nbsp;
                    <input type="submit" value="Enviar">
                </div>               
            </form>
        </div>
    </body>
</html>
