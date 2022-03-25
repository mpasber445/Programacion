Algoritmo alternar_mayus_minus
	
	
	Escribir "Dime tu nombre"
	Leer nombre
	
	Para x<-1 Hasta Longitud(nombre) Con Paso 1 Hacer
		
		Si x % 2 = 0 Entonces
			Escribir Sin Saltar Minusculas(Subcadena(nombre,x,x))
		SiNo
			Escribir Sin Saltar Mayusculas(Subcadena(nombre,x,x))
		FinSi
	
	FinPara
	Escribir ""	
	
FinAlgoritmo
