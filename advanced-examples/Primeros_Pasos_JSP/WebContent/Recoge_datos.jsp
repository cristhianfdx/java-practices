<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 

String nombre = request.getParameter("nombre");

String apellido = request.getParameter("apellido");

String usuario = request.getParameter("usuario" );

String contra = request.getParameter("contra");

String pais = request.getParameter("pais");

String tecnologia = request.getParameter("tecnologias");

Class.forName("com.mysql.jdbc.Driver");
try{
java.sql.Connection mi_conex = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/protecto_jsp", "root", "");

java.sql.Statement objeto_statement = mi_conex.createStatement();

String instruccionSql="INSERT INTO USUARIO(Nombre, Apellido, Usuario, Contrasena, Pais, Tecnologia) VALUES ('"+nombre+"','"+apellido+"','"+usuario+"','"+contra+"','"+pais+"','"+tecnologia+"')";

objeto_statement.executeUpdate(instruccionSql);

out.println("Registro Exitoso");
}catch(Exception e){
	out.println("Ha ocurrido un error");
}

%>

</body>
</html>