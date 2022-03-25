Algoritmo vocales
	
	Escribir "Dime tu nombre"
	Leer nombre
	
	cuenta = 0
	
	Para x<-1 Hasta Longitud(nombre) Con Paso 1 Hacer
		
		letra=Subcadena(nombre,x,x)
		
		Si letra = "a" o letra = "e" o letra = "i" o letra = "o" o letra = "u" o letra = "A" o letra = "E" o letra = "I" o letra = "O" o letra = "U" Entonces
			cuenta = cuenta + 1
		FinSi
		
	FinPara
	Escribir "El nombre introducido tiene " cuenta " vocales"	
	 
FinAlgoritmo
