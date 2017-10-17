<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="DAO.MotorbikeDAO" import="Models.Motorbike" import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Catálogo | MiMotor</title>
		<script src="scripts/myScripts.js" type="text/javascript"></script>
	</head>
	<body>
		
		<header>
			<button onclick="catalog()">Recargar</button>
			<button onclick="main()">Menú</button>
			<button onclick="logout()">Logout!</button>
		</header>
		<%
			ArrayList<Motorbike> catalog;
			MotorbikeDAO motorbikeDao;
			
			//STEP 1: Obtaining the datas of motorbikes of the DB
			motorbikeDao = new MotorbikeDAO();
			
			catalog = motorbikeDao.obtainingCalatog();
		
			
			//STEP 2: Creating the table dynamically with the datas obtained
			
			out.print("<table style='border:solid black'>");
			for(Motorbike moto: catalog){
				out.print("<tr>");				
					out.print("<td>"+moto.getType()+"</td>");
					out.print("<td>"+moto.getTrademark()+"</td>");
					out.print("<td>"+moto.getModel()+"</td>");
					out.print("<td>"+moto.getColor()+"</td>");
					out.print("<td>"+moto.getPrice()+"</td>");
				out.print("</tr>");
			}
			out.print("</table>");
		%>
	</body>
</html>