Algoritmo vocales_sin_saltar
	
	
	//Esta ordenado segun el nombre, no según A E I O U
	
		Escribir "Dime tu nombre"
		Leer nombre
		
		cuentaa = 0
		cuentae = 0
		cuentai = 0
		cuentao = 0
		cuentau = 0
		
		Para x<-1 Hasta Longitud(nombre) Con Paso 1 Hacer
			
			letra=Subcadena(nombre,x,x)
			
			Si (letra = "a" o letra = "A") y cuentaa = 0 Entonces
				texto_uno = Concatenar(texto_uno, Minusculas(letra))
				cuentaa = cuentaa + 1
			SiNo
				Si (letra = "e" o letra = "E") y cuentae = 0 Entonces
					texto_uno = Concatenar(texto_uno, Minusculas(letra))
					cuentae = cuentae +1
				SiNo
					Si (letra = "i" o letra = "I") y cuentae = 0 Entonces
						texto_uno = Concatenar(texto_uno, Minusculas(letra))
						cuentai = cuentai +1
					SiNo
						Si (letra = "o" o letra = "O") y cuentao = 0 Entonces
							texto_uno = Concatenar(texto_uno, Minusculas(letra))
							cuentao = cuentao +1
						SiNo
							Si (letra = "u" o letra = "U") y cuentau = 0 Entonces
								texto_uno = Concatenar(texto_uno, Minusculas(letra))
								cuentau = cuentau +1
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
			
	

		FinPara
		
		Para x<-1 Hasta Longitud(texto_uno) Con Paso 1 Hacer
			
			letra_dos=Subcadena(texto_uno,x,x)
			
			Si (letra_dos = "a" o letra_dos = "A") Entonces
				texto_final = Concatenar(texto_final, Minusculas(letra_dos))
			FinSi
			
			
		FinPara
		
		Para x<-1 Hasta Longitud(texto_uno) Con Paso 1 Hacer
			
			letra_dos=Subcadena(texto_uno,x,x)
			
			Si (letra_dos = "e" o letra_dos = "E")  Entonces
				texto_final = Concatenar(texto_final, Minusculas(letra_dos))
			FinSi
			
			
		FinPara
		
		Para x<-1 Hasta Longitud(texto_uno) Con Paso 1 Hacer
			
			letra_dos=Subcadena(texto_uno,x,x)
			
			Si (letra_dos = "i" o letra_dos = "I")  Entonces
				texto_final = Concatenar(texto_final, Minusculas(letra_dos))
			FinSi
			
			
		FinPara
		
		Para x<-1 Hasta Longitud(texto_uno) Con Paso 1 Hacer
			
			letra_dos=Subcadena(texto_uno,x,x)
			
			Si (letra_dos = "o" o letra_dos = "O") Entonces
				texto_final = Concatenar(texto_final, Minusculas(letra_dos))
			FinSi
			
			
		FinPara
		
		Para x<-1 Hasta Longitud(texto_uno) Con Paso 1 Hacer
			
			letra_dos=Subcadena(texto_uno,x,x)
			
			Si (letra_dos = "u" o letra_dos = "U") Entonces
				texto_final = Concatenar(texto_final, Minusculas(letra_dos))
			FinSi
			
			
			
		FinPara
		
		Escribir texto_final

FinAlgoritmo

