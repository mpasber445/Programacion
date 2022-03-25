Algoritmo sumanumerospositivos
	
	Definir num Como Entero
	Definir num2 Como Entero
	Definir num3 Como Entero
	Definir solucion Como Entero
	
	Escribir "Introduce dos numeros positivos"
	Leer num,num2
	solucion = num+num2
	cuenta = 1
	Mientras num>=0 y num2>=0 y num3>=0 Hacer
		solucion = solucion+num3
		cuenta = cuenta + 1
		Escribir "La suma de esos de esos dos numeros es " solucion
		Escribir "Introduce otro numero para sumarlo al resultado anterior"
		Leer num3

	FinMientras
	
	media = solucion/cuenta
	Escribir "Has introducido un numero negativo, la solucion de tu ultima suma fue " solucion
	Escribir "La cantidad total de numeros que has introducido es " cuenta
	Escribir "La media de los numeros que has introducido es " media
	
	
FinAlgoritmo
