Algoritmo matriz_3x3
	
	
	Dimension datos[3,3]
	
	
	Para x<-1 Hasta 3 Con paso 1 Hacer
		Escribir "Introduce un numero"
		Leer datos[x,1]
	FinPara
	
	Para x<-1 Hasta 3 Con paso 1 Hacer
		Escribir "Introduce un numero"
		Leer datos[x,2]
	FinPara
	
	Para x<-1 Hasta 3 Con paso 1 Hacer
		Escribir "Introduce un numero"
		Leer datos[x,3]
	FinPara
	
	solucion = (datos[1,1] * datos [2,2] * datos [3,3]) + (datos[1,2] * datos [2,3] * datos [3,1]) + (datos[2,1] * datos [3,2] * datos [1,3]) - (datos[1,3] * datos [2,2] * datos [3,1]) - (datos[1,2] * datos [2,1] * datos [3,3]) - (datos[2,3] * datos[3,2] * datos [1,1])
	
	Escribir "La solucion es " solucion
	
	
FinAlgoritmo
