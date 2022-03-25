Algoritmo tresnumeros
	
	Escribir "Introduce el primer numero"
	Leer numerouno
	Escribir "Introduce el segundo numero"
	Leer numerodos
	Escribir "Introduce el tercer numero"
	Leer numerotres
	
	Si numerouno + numerodos = numerotres Entonces
		Escribir "El primer numero (" numerouno ") mas el segundo numero (" numerodos ") es igual al tercer numero (" numerotres ")"
	SiNo
		Si numerouno + numerotres = numerodos Entonces
			Escribir "El primer numero (" numerouno ") mas el tercer numero (" numerotres ") es igual al tercer numero (" numerodos ")"
		SiNo
			Si numerodos + numerotres = numerouno Entonces
				Escribir "El segundo numero (" numerodos ") mas el tercer numero (" numerotres ") es igual al primer numero (" numerouno ")"
			SiNo
				Escribir "La suma de ninguno de esos dos numeros da como resultado un tercer numero"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
