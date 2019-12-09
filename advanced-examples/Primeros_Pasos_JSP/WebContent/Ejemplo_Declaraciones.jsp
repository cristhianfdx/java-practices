<html>

<body>

<h1 style = "text-align:center">

Ejemplo declaraciones

</h1>

<%!

private int resultado;

public int metodoSuma(int n1, int n2){
	
	return resultado = n1+n2;	
}

public int metodoResta(int n1, int n2){
	
	return resultado = n1-n2;	
}

public int metodoMult(int n1, int n2){
	
	return resultado = n1*n2;	
}

%>

La suma es : <%= metodoSuma(7, 5) %>

<br>

La resta es : <%= metodoResta(7, 5) %>

<br>

La multiplicacion es : <%= metodoMult(7, 5) %>

</body>


</html>