<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="DAO.MotorbikeDAO" import="Models.Motorbike" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Saving Motorbike</title>
	</head>
	<body>
		<%
			boolean exists;
			MotorbikeDAO motorbikeDao = new MotorbikeDAO();
			Motorbike motorbike;
		
			//STEP 1: Catching the datas of new motorbike
			String type = request.getParameter("type");
			out.println(type);
			String trademark = request.getParameter("trademark");
			String model = request.getParameter("model"); 
			String color = request.getParameter("color");
			String priceString = request.getParameter("price");
			float price = Float.parseFloat(priceString);
			
			motorbike = new Motorbike(type,trademark,model,color,price,null);
			
			//STEP 2: Verifying that the motorbike is not in the DB yet
			exists = motorbikeDao.verifyMotorbikeExists(motorbike);
			
			//STEP 3: If the motorbike is not in the de DB then saving it
			if(!exists){
				motorbikeDao.newMotorbike(motorbike);
				out.println("La moto ha sido guardada :)");
			}else{
				out.println("La moto ya existe :(");
			}
		%>
	</body>
</html>