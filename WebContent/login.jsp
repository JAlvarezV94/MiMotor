<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login | MiMotor</title>
	</head>
	<body>
	<%@ page import="DAO.UserDAO" import="Models.User" %>
		<%
			User user;
			UserDAO userDao;
			
			//STEP 1: Obtaining the parameters from the form
			String name = request.getParameter("username");
			String pass = request.getParameter("pass");
		
			//STEP 2: Verifying the credentials 
			userDao = new UserDAO();
			
			user = userDao.readingUser(name, pass);
			
			if(user != null){
				response.sendRedirect("mainProfile.jsp");
			}else{
				out.println("Los datos introducidos no son correctos");
			}
		%>
	</body>
</html>