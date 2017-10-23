<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Main Profile | MiMotor</title>
		
		<script src="scripts/myScripts.js" type="text/javascript"></script>
		<link href="styles/normalize.css" rel="stylesheet" type="text/css"/>
		<link href="styles/style.css" rel="stylesheet" type="text/css"/>
	</head>
	<body>			
		<header>
		</header>
		<nav>
			<button onclick="main()">Inicio</button>
			<button onclick="addNewMotorbike()">Nueva Moto</button>
			<button onclick="addNewEmployee()">Nuevo Usuario</button>
			<button onclick="catalog()">Ir al catálogo</button>
			<button onclick="logout()">Logout!</button>
		</nav>
		<section>
			<div id="central">
				<h1>BIENVENIDO A MIMOTOR!</h1>
			</div>
		</section>
			
		<footer>
			This web was created by: Jose Álvarez Vivar.
		</footer>
	</body>
</html>