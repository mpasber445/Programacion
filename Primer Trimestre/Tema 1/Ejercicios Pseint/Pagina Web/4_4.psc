Algoritmo cuantosnumerospositivos
	
	Escribir "Introduce dos numeros y te dire cuales son positivos"
	Escribir "Introduce el primer numero"
	Leer numerouno
	Escribir "Introduce el segundo numero"
	Leer numerodos
	Si numerouno > 0 y numerodos > 0
		Escribir "Ambos numeros son positivo"
	SiNo
		Si numerouno > 0 Entonces
			Escribir "Solo el primer numero es positivo"
		SiNo
			Si numerodos > 0 Entonces
				Escribir "Solo el segundo numero es positivo"
			SiNo
				Escribir "Ningun numero es positivo"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo