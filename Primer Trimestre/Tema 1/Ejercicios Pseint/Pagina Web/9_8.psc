Algoritmo mayor_dato
	
	Dimension num[10,2]
	Definir num_mayor como Entero
	
	
	
	Para x<-1 Hasta 10 Con paso 1 Hacer
		Escribir "Introduce un numero entero"
		Leer num[x,1]
	FinPara
	
	Para x<-1 Hasta 10 Con paso 1 Hacer
		Escribir "Introduce un numero entero"
		Leer num[x,2]
	FinPara
	
	num_mayor = num[1,1]
	
	Para x<-1 Hasta 10 con Paso 1 Hacer
		Si num_mayor < num[x,1] Entonces
			num_mayor = num[x,1]
		SiNo
		FinSi
	FinPara
	
	Para x<-1 Hasta 10 con Paso 1 Hacer
		Si num_mayor < num[x,2] Entonces
			num_mayor = num[x,2]
		SiNo
		FinSi
	FinPara
	
	Escribir "El numero mayor es " num_mayor
	
FinAlgoritmo
