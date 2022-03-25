Algoritmo numeros_al_azar
	
	num1=AZAR(101)
	num2=AZAR(101)
	
	Escribir "Introduce la suma de " num1 "+ " num2
	Leer solucion
	
	Mientras solucion <> num1+num2
		Escribir "La suma no es correcta, vuelve a intentarlo"
		Leer solucion
	FinMientras
	
	Escribir "El resultado es correcto, la suma de " num1 "+ " num2 " es " num1+num2
	
FinAlgoritmo
