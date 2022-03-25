Algoritmo media_cinco_datos
	
	Dimension datos[5]
	
	Para x = 1 Hasta 5 Con Paso 1
		Escribir "Introduce un dato para la " x "º variable"
		Leer datos[x]
		
	FinPara
	
	Para x = 1 Hasta 5 Con Paso 1 Hacer
		resultado_suma = datos[x] + resultado_suma
	FinPara
	
	resultado = resultado_suma / 5
	
	Escribir "La media de los numeros introducidos es " resultado
	
	Para x = 1 Hasta 5 Con Paso 1 Hacer
		
		Si datos[x] > resultado Entonces
			Escribir "El " x "º valor introducido es mayor a la media (" datos[x] ")"
		FinSi
		
	FinPara
	
FinAlgoritmo
