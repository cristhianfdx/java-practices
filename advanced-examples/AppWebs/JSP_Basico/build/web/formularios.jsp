<%-- 
    Document   : formularios    
    Author     : Cristhian Alexander Forero Domínguez
    Subject    : Tecnología Aplicada(Aplicaciones Web)
    Group      : 30102
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formularios</title>
        <link href="assets/css/main.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Ejercicio de Formularios</h1>
        </br>
        
        <p>
            Despu&eacute;s de introducir los datos pulse el bot&oacute;n OK
        </p>
        
        <form action="">
            <div>
                <label>Nombre:</label>
                <input type="text" name="nombre">
            </div>
            <div>
                <label>Apellido 1:</label>
                <input type="text" name="apellido1">                
            </div>
            <div>
                <label>Apellido 2:</label>
                <input type="text" name="apellido2">                
            </div>
            <div>                
                <input type="submit" value="Ok">
            </div>
            <div>                
                <input type="reset" value="Borrar">
            </div>
        </form>
    </body>
</html>
