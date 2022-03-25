Algoritmo verificar_multiplos
	
	
	Escribir "Introduce el primer numero"
	Leer numerouno
	Escribir "Introduce el segundo numero"
	Leer numerodos
	
	
	Si numerouno%numerodos = 0 Entonces
		Escribir "El primer numero introducido es multiplo del segundo"
	SiNo
		Si numerodos%numerouno = 0 Entonces
			Escribir "El segundo numero introducido es multiplo del primero"
		SiNo
			Escribir "Ningun numero es multiplo del otro"
		FinSi
	FinSi
	
	
FinAlgoritmo
