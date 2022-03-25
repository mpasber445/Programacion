Algoritmo sumanumerospositivos
	
	Definir num Como Entero
	Definir num2 Como Entero
	Definir num3 Como Entero
	Definir solucion Como Entero
	
	Escribir "Introduce dos numeros positivos"
	Leer num,num2
	solucion = num+num2
	Mientras num>=0 y num2>=0 y num3>=0 Hacer
		
		Escribir "La suma de esos de esos dos numeros es " solucion
		Escribir "Introduce otro numero para sumarlo al resultado anterior"
		Leer num3
		solucion = solucion+num3
		Escribir "La suma de ese numero y el anterior es " solucion
	FinMientras
	
	
	Escribir "Has introducido un numero negativo, la solucion de tu ultima suma fue " solucion
	
FinAlgoritmo
