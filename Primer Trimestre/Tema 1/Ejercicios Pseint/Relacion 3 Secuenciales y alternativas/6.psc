Algoritmo contar_cifras
	Escribir "Introduce un numero entre el 0 y el 9999"
	Leer numerouno
	
	Si numerouno<10 y numerouno > -10 Entonces
		Escribir "Tu numero tiene una cifra"
	SiNo
		Si numerouno<100 y numerouno > -100 Entonces
			Escribir "Tu numero tiene dos cifras"
		SiNo
			Si numerouno<1000 y numerouno > -1000 Entonces
				Escribir "Tu numero tiene tres cifras"
			SiNo
				Si numerouno<10000 y numerouno > -10000 Entonces
					Escribir "Tu numero tiene cuatro cifras"
				SiNo
					Escribir "Te he pedido un numero entre el 0 y el 9999"
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
