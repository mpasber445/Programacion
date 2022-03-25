Algoritmo dividir
	
	Definir num1 Como Entero
	Definir num2 Como Entero
	
	Escribir "Introduce dos numeros"
	Leer num1,num2
	
	Si num2 <= 0 Entonces
		Repetir
			Escribir "Introduce un numero que no sea cero."
			Escribir "Vuelve a introducirlos dos numeros"
			Leer num1,num2
		Hasta Que num2 > 0
	FinSi
	Escribir "La division de " num1 "/" num2 " es " num1/num2
	
FinAlgoritmo
