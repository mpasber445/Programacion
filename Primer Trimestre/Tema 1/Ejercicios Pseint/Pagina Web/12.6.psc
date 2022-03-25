Algoritmo numerospares
	
	Escribir "Introduce un numero"
	Leer num
	
	Si EsPar(num) = Verdadero Entonces
		Escribir "El numero es par"
	SiNo
		Escribir "El numero no es par"
	FinSi
	
	
	
FinAlgoritmo


Funcion resultado <- EsPar(numeroacomprobar)
	
	Si numeroacomprobar % 2 = 0 Entonces
		resultado = Verdadero
	SiNo
		resultado = Falso
	FinSi
	
FinFuncion
	