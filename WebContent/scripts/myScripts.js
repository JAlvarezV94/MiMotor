/**
 * 
 */

function addNewMotorbike(){
	document.getElementById("central").innerHTML="<h1>Nueva Moto</h1>"+
	"<form action='saveMotorbike.jsp'>"
		+"<select name='type' default='-Tipo de moto-'>" +
			"<option value='deportiva'>Deportiva</option>"+
			"<option value='super deportiva'>Super Deportiva</option>"+
			"<option value='custom'>Custom</option>"+
			"<option value='naked'>Naked</option>"+
		 "</select><br>"
		+"Marca: <input type='text' name='trademark'/><br>"
		+"Modelo: <input type='text' name='model'/><br>"
		+"Color: <input type='color' name='color'/><br>"
		+"Precio: <input type='number' name='price'/><br>"
		+"<input type='submit' value='Guardar'/><br>"
	+"</from>";
}

function logout(){
	location.href="index.html";
}

function addNewEmployee(){
	document.getElementById("central").innerHTML="<h1>Nuevo Empleado</h1>"+
	"<form action='newEmployee.jsp'>"
		+"<select name='level' default='-Nivel Empleado-'>" +
			"<option value='admin'>Administrador</option>"+
			"<option value='moder'>Moderador</option>"+
		 "</select><br>"
		+"Nombre: <input type='text' name='name'/><br>"
		+"Email: <input type='email' name='email'/><br>"
		+"Password: <input type='password' name='password'/><br>"
		+"<input type='submit' value='Guardar'/><br>"
	+"</from>";
}