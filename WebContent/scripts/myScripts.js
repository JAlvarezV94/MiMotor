/**
 * 
 */

function addNewMotorbike(){
	document.getElementById("central").innerHTML="<h1>Nueva Moto</h1>"+
	"<form action='saveMotorbike.jsp'>"
		+"Tipo:<br><select name='type' default='-Tipo de moto-' required>" +
			"<option value='deportiva'>Deportiva</option>"+
			"<option value='super deportiva'>Super Deportiva</option>"+
			"<option value='custom'>Custom</option>"+
			"<option value='naked'>Naked</option>"+
		 "</select><br>"
		+"Marca:<br> <input type='text' name='trademark' required/><br>"
		+"Modelo:<br> <input type='text' name='model' required/><br>"
		+"Color:<br> <input type='color' name='color' required/><br>"
		+"Precio:<br> <input type='number' name='price' required/><br>"
		+"<input type='submit' value='Guardar'/><br>"
	+"</from>";
}

function logout(){
	location.href="index.html";
}

function addNewEmployee(){
	document.getElementById("central").innerHTML="<h1>Nuevo Empleado</h1>"+
	"<form action='newEmployee.jsp' autocomplete='off'>"
		+"<Nivel:<br> <select name='level' default='-Nivel Empleado-'>" +
			"<option value='admin'>Administrador</option>"+
			"<option value='moder'>Moderador</option>"+
		 "</select><br>"
		+"Nombre:<br> <input type='text' name='name_newuser' required/><br>"
		+"Email:<br> <input type='email' name='email_newuser' required/><br>"
		+"Password:<br> <input type='password' name='password' required/><br>"
		+"<input type='submit' value='Guardar'/><br>"
	+"</from>";
}

function catalog(){
	location.href="catalog.jsp";
}

function main(){
	location.href="mainProfile.jsp";
}


