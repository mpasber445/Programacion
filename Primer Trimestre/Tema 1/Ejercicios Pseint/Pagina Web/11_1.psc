Algoritmo nombre_al_reves	
	
	Definir nombre Como Caracter
	Definir tamano Como Entero
	
	Escribir "Dime tu nombre"
	Leer nombre
	
	tamano = longitud(nombre)
	
	Escribir "Tu nombre al revés sería:"

	Mientras tamano <> 0 Hacer
		Escribir Sin Saltar Subcadena(nombre, tamano, tamano)
		tamano = tamano - 1
	FinMientras
	Escribir ""
FinAlgoritmo
