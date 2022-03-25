Algoritmo dos_cifras
	
	Escribir "Introduce un numero positivo de hasta dos cifras"
	Leer num
	
	Si num > 99 o num <= 0 Entonces
		Escribir "El numero es negativo,cero o tiene mas de dos cifras"
	SiNo
		Si num < 10 Entonces
			Escribir "Te quedan " 10-num " unidades para llegar a un numero de dos cifras"
		SiNo
			Si num < 100 Entonces
			Escribir "Te quedan " 100-num " unidades para llegar a un numero de dos cifras"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
