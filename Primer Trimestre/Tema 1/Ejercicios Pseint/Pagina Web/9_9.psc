Algoritmo matriz_2x2
	
	Dimension datos[2,2]
	
	
	Para x<-1 Hasta 2 Con paso 1 Hacer
		Escribir "Introduce un numero"
		Leer datos[x,1]
	FinPara
	
	Para x<-1 Hasta 2 Con paso 1 Hacer
		Escribir "Introduce un numero"
		Leer datos[x,2]
	FinPara
	
	Escribir "La solucion es " (datos[1,1] * datos[2,2]) - (datos[2,1] * datos[1,2])
	
	
FinAlgoritmo
