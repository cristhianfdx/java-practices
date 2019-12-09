<%-- 
    Document   : index
    Created on : Sep 8, 2019, 3:26:09 PM
    Author     : Cristhian Forero
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="assets/css/main.css" rel="stylesheet" type="text/css"/>
        <title>JSP 1</title>
    </head>
    <body>
        <div class="main">
            <h1 style="color:blue">Página # 1</h1>
            
            <p>
                <i>Click</i> en uno de los enlaces para ir a otra página.
            </p>
            
            <ul>
                <li>
                    <a href="page2.jsp">Ir a la página 2</a>
                </li>
                <li>
                    <a href="page3.jsp">Ir a la página 3</a>
                </li>
            </ul>
        </div>
        
        <div class="menu">
            <ul>
                <li>
                    <a href="envio-datos.jsp">Envío de datos entre páginas</a>
                </li>
                <li>
                    <a href="envio-radio-check.jsp">Recepción de los valores de radio-button y checkbox</a>
                </li>
                 <li>
                     <a href="envio-opciones.jsp">
                        Recepción de valores en lista de opciones (combo box, list box)
                    </a>
                </li>
                <li>
                    <a href="envio-textarea.jsp">Recepción de un área de texto</a>
                </li>
                 <li>
                     <a href="practica.jsp">Práctica</a>
                </li> 
            </ul>
        </div>
    </body>
</html>

