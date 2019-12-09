<%-- 
    Document   : envio-radio-check
    Created on : Sep 8, 2019, 5:14:12 PM
    Author     : Cristhian Forero
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="assets/css/ejercicio3.css" rel="stylesheet" type="text/css"/>
        <title>JSP Envio-Radio-Check</title>
    </head>
    <body>
        <div class="main">
            <h1>Página de inicio</h1>
            
            <h2>Aquí se piden los datos</h2>
            
            <p>
                Elige el transporte que prefieras:
            </p>
            
            <form action="recepcion-radio-check.jsp" method="POST">
                <div class="control">
                    <input type="radio" name="transporte" 
                           value="Automovil"> <span>Automóvil</span>
                </div>
                
                <div class="control">
                    <input type="radio" name="transporte" 
                           value="Avion"> <span>Avión</span>
                </div>
                
                <div class="control">
                    <input type="radio" name="transporte" 
                           value="Autobus"> <span>Autobús</span>
                </div>
                
                <span style="margin: 10px 0 10px 0">
                    ¿Cuáles son tus destinos favoritos?
                </span>
                
                <div class="control">
                    <input type="checkbox" name="ciudad" 
                           value="Ciudad"> <span>Ciudad</span>
                </div>
                
                <div class="control">
                    <input type="checkbox" name="bosque" 
                           value="Bosque"> <span>Bosque</span>
                </div>
                
                <div class="control">
                    <input type="checkbox" name="playa" 
                           value="Playa"> <span>Playa</span>
                </div>
                
                <div class="buttons">
                    <input type="submit" value="Enviar">
                </div>                
                
            </form>  
        </div>
        
        <a href="index.jsp">Inicio</a>
        
    </body>
</html>
