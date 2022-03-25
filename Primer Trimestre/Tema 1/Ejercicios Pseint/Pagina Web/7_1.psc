Algoritmo contraseña
	
	Definir user Como Entero
	Definir pass Como Caracter
	
	Escribir "**********************************"
	Escribir "* Introduce tu Codigo de Usuario *"
	Escribir "**********************************"
	Leer user
	
	Escribir "***************************"
	Escribir "* Introduce tu contraseña *"
	Escribir "***************************"
	Leer pass
	
	Si !(user = 1 y pass = "1234") Entonces 
		Repetir
			
			Escribir " "
			Escribir "-----------------------------"
			Escribir "- ¡Error al iniciar sesion! -"
			Escribir "- Credenciales no validas.  -"
			Escribir "-----------------------------"
			Escribir " "
			Escribir "**********************************"
			Escribir "* Introduce tu Codigo de Usuario *"
			Escribir "**********************************"
			Leer user
			
			Escribir "***************************"
			Escribir "* Introduce tu contraseña *"
			Escribir "***************************"
			Leer pass
		Hasta Que user = 1 y pass = "1234"
	FinSi
	Escribir " "
	Escribir "-------------------------------"
	Escribir "- ¡Sesion iniciada con exito! -"
	Escribir "-        ¡Bienvenido!.         -"
	Escribir "-------------------------------"
	Escribir " "
	
FinAlgoritmo
