<%@page import="java.sql.*"%>
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


	String usuario = request.getParameter("usuario" );

	String contra = request.getParameter("contra");

	Class.forName("com.mysql.jdbc.Driver");

	try{
	Connection mi_conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/protecto_jsp", "root", "");

	PreparedStatement c_preparada = mi_conex.prepareStatement("SELECT * FROM USUARIO WHERE USUARIO =? AND CONTRASENA =?");

	c_preparada.setString(1, usuario);
	c_preparada.setString(2, contra);

	ResultSet rs = c_preparada.executeQuery();
	
	if(rs.absolute(1))out.println("Usuario Autorizado");
	
	else out.println("No hay usuarios con esos datos");	

	}catch(Exception e){
		
	out.println("Ha ocurrido un error"+ e);
	}

%>

</body>
</html>