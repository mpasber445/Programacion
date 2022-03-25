Algoritmo multiplos
	
	Escribir "Introduce el primer numero"
	Leer numuno
	Escribir "Introduce el segundo numero"
	Leer numdos
	
	Escribir EsMultiplo(numuno,numdos)
	
	
FinAlgoritmo

Funcion resultado <- EsMultiplo(primernumero,segundonumero)
	
	Para x<-1 Hasta primernumero Hacer
		Si segundonumero * x = primernumero
			multiplo = Verdadero
		FinSi
	FinPara
	
	Si multiplo = Verdadero Entonces
		Escribir "El primer numero es multiplo del segundo"
	SiNo
		Escribir "El primer numero no es multiplo del segundo"
	FinSi
	
FinFuncion
	