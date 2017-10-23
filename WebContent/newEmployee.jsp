<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Models.User" import="DAO.UserDAO" import="Helpers.EncodeHelper"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Saving Employee</title>
	</head>
	<body>
		<%
			User user;
			boolean admin;
			boolean exists;
			String passEncoded;
			
			UserDAO userDao = new UserDAO();
			//STEP 1: Catchign the datas of new Employee and building the User object
			String name = request.getParameter("name_newuser");
			String email = request.getParameter("email_newuser");
			String pass = request.getParameter("password");
			
			if(name.equals("") || email.equals("") || pass.equals("")){
				response.setHeader("error", "empty_employee");
				response.sendRedirect("mainProfile.jsp");
			}
			
			if(request.getParameter("level").equals("admin")){
				admin = true;
			}
			else{
				admin = false;
			}
			
			//STEP 1.2: Encoding the password by SHA1
			passEncoded = EncodeHelper.toSHA1(pass);
			user = new User(name,email,passEncoded,admin);
			
			//STEP 2: Verifying that the user doesn't exist in the app already
			exists = userDao.userIsExist(user);
			
			if(!exists){
				userDao.creatingNewUser(user);
				out.println("usario creado :)");
			}else{
				out.println("El usuario ya existe :(");
			}
		%>
	</body>
</html>