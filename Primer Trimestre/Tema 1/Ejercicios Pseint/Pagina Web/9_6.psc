Algoritmo numero_mayor_en_matriz
	
	Dimension num[7]
	Definir num_mayor como Entero
	
	
	
	Para x<-1 Hasta 7 Con paso 1 Hacer
		Escribir "Introduce un numero entero"
		Leer num[x]
	FinPara
	
	num_mayor = num[1]
	
	Para x<-1 Hasta 7 con Paso 1 Hacer
			Si num_mayor < num[x] Entonces
				num_mayor = num[x]
			SiNo
			FinSi
	FinPara
	
	Escribir "El numero mayor es " num_mayor
	
FinAlgoritmo
