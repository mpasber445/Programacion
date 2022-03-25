Algoritmo numeromayor
	
	Escribir "Introduce tres numeros"
	Leer numuno,numdos,numtres
	
	Escribir MayorDeTres(numuno,numdos,numtres)	
FinAlgoritmo


Funcion resultado <- MayorDeTres(primernumero,segundonumero,tercernumero)
	
	Si primernumero > segundonumero y primernumero > tercernumero Entonces
		Escribir "El primer numero (" + primernumero + ") es el mayor"
	Sino
		Si segundonumero > primernumero y segundonumero> tercernumero Entonces
			Escribir "El segundo numero (" + segundonumero + ") es el mayor"
		Sino
			Escribir "El tercer numero (" + tercernumero + ") es el mayor"
		FinSi
	FinSi
	
FinFuncion
	