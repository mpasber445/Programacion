Algoritmo producto_escalar
	
	Dimension vectores[3,2]
	
	
	
	Para x = 1 Hasta 3 Con Paso 1
		z = 1
		Escribir "Introduce la x del " x "º vector"
		Leer vectores[x,z]
		z = z + 1
		Escribir "Introduce la y del " x "º vector"
		Leer vectores[x,z]
	FinPara
	
	primercomponente = vectores[1,1] * vectores [1,2]
	segundocomponente = vectores[2,1] * vectores [2,2]
	tercercomponente = vectores[3,1] * vectores [3,2]
	sumacomponentes = primercomponente+segundocomponente+tercercomponente
	
	Escribir "Tu primer componente es " primercomponente
	Escribir "Tu segundo componente es " segundocomponente
	Escribir "Tu tercer componente es " tercercomponente
	
	Escribir "La suma de los tres componentes es " sumacomponentes
	
FinAlgoritmo

