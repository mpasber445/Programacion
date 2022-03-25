Algoritmo numeromayordelostres
	
	Escribir "Introduce tres numeros DISTINTOS para compararlos"
	Escribir "Introduce el primer numero"
	Leer numerouno
	Escribir "Introduce el segundo numero"
	Leer numerodos
	Escribir "Introduce el tercer numero"
	Leer numerotres
	
	Si numerouno > numerodos y numerouno > numerotres
		
		Escribir "El primer numero introducido es el mayor: " numerouno
		
	SiNo
		Si numerodos > numerouno y numerodos > numerotres Entonces
			
			Escribir "El segundo numero introducido es el mayor: " numerodos
			
		SiNo
			Si numerotres > numerouno y numerotres > numerodos Entonces
				Escribir "El tercer numero introducido es el mayor: " numerotres
				
			FinSi
			
		FinSi
		
	FinSi


FinAlgoritmo
