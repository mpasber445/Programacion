Algoritmo numeroparoimpar
	
	Definir num Como Entero
	Definir resto Como Entero
	
	Escribir "Introduce un numero"
	Leer num
	
	resto = num%2
	
Mientras num <> 0 
	Mientras resto = 0 y num <> 0
		Escribir "El numero " num " es par"
		Escribir "Introduce otro numero"
		Leer num
		resto = num%2
 	FinMientras
	
	Mientras resto <> 0 y num <> 0
		Escribir "El numero " num " es impar"
		Escribir "Introduce otro numero"
		Leer num
		resto = num%2
 	FinMientras
FinMientras

Escribir "Tu numero introducido es cero"

FinAlgoritmo
