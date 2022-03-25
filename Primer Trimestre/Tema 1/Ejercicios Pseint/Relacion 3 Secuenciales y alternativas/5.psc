Algoritmo ordenar_caracteres
	
	Escribir "Introduce el primer caracter"
	Leer caracteruno
	Escribir "Introduce el segundo caracter"
	Leer caracterdos
	Escribir "Introduce el tercer caracter"
	Leer caractertres
	
	Si caracteruno > caracterdos y caracteruno > caractertres Entonces
		Si caracterdos > caractertres Entonces
			Escribir caracteruno " > " caracterdos " > " caractertres
		SiNo
			Si caracterdos < caractertres Entonces
				Escribir caracteruno " > " caractertres " > " caracterdos
			FinSi
		FinSi
	SiNo
		Si caracterdos > caracteruno y caracterdos > caractertres Entonces
			Si caracteruno > caractertres Entonces
				Escribir caracterdos " > " caracteruno " > " caractertres
			SiNo
				Si caracteruno < caractertres Entonces
					Escribir caracterdos " > " caractertres " > " caracteruno
				FinSi
			FinSi
		SiNo
			Si caractertres > caracteruno y caractertres > caracterdos Entonces
				Si caracteruno > caracterdos Entonces
					Escribir caractertres " > " caracteruno " > " caracterdos
				SiNo
					Si caracteruno < caracterdos Entonces
						Escribir caractertres " > " caracterdos " > " caractertres
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
	
	
FinAlgoritmo
