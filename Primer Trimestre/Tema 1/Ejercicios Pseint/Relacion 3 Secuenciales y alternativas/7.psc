Algoritmo notaalumno
    Escribir "Introduzca la nota"
    Leer nota
	Si nota < 0 Entonces
		Escribir "La nota minima es 0"
	SiNo
		Si nota < 5 Entonces
			Escribir "Tu resultado es INSUFICIENTE"
		SiNo
			Si nota > 4 y nota < 6 Entonces
				Escribir "Tu resultado es SUFICIENTE"
			SiNo
				Si nota > 5 y nota < 7 Entonces
					Escribir "Tu resultado es BIEN"
				SiNo
					Si nota > 6 y nota < 9 Entonces
						Escribir "Tu resultado es NOTABLE"
					SiNo
						Si nota > 8 y nota <= 10 Entonces
							Escribir "Tu resultado es SOBRESALIENTE"
						SiNo
							Si nota > 10 Entonces
								Escribir "La nota maxima es 10"
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo