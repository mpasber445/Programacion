Algoritmo Ejercicio3
	
	Definir frase Como Caracter
	Definir frase_dos Como Caracter
	Definir frasealreves Como Caracter
	Definir palindroma Como Logico
	Definir tildes Como Logico
	
	palindroma = Falso
	tildes = Verdadero
	
	//Se crean y se inicializan las variables
	
		Escribir "Introduce una frase que no lleve tildes"
		Leer frase 
		
		frase = Minusculas(frase) //Le pide al usuario que introduzca la frase, acto seguido la pone en minuscula para poder realizar la comparativa posteriormente

	
	Para z<-0 Hasta Longitud(frase)
		
		Si Subcadena(frase,z, z) <> " "
			Si Subcadena(frase,z,z) = "á" Entonces
				frase_dos = frase_dos + "a"
			SiNo
				Si Subcadena(frase,z,z) = "é" Entonces
					frase_dos = frase_dos + "e"
				SiNo
					Si Subcadena(frase,z,z) = "í" Entonces
						frase_dos = frase_dos + "i"
					SiNo
						Si Subcadena(frase,z,z) = "ó" Entonces
							frase_dos = frase_dos + "o"
						SiNo
							Si Subcadena(frase,z,z) = "ú" Entonces
								frase_dos = frase_dos + "u"
							SiNo
								frase_dos = frase_dos + Subcadena(frase,z,z)
							FinSi
						FinSi
					FinSi
					
				FinSi
				FinSi
		FinSi
	FinPara  //Elimina los espacios en la frase introducida por el usuario y guarda la frase sin espacios y sin tildes en la variable frase_dos
	
	Para x<-0 Hasta Longitud(frase_dos)
		
		frasealreves = frasealreves + Subcadena(frase_dos,Longitud(frase_dos) - x , Longitud(frase_dos) - x )
	FinPara //Invierte la frase y la guarda sin espacios en la variable frasealreves
	
	Escribir frase
	Escribir frase_dos
	Escribir frasealreves
	
		Si frase_dos = frasealreves Entonces //Si la frase sin espacios, y la frase invertida sin espacios son iguales, será palíndroma, por lo cual pondremos la variable logica a verdadero (Aqui se podria poner directamente un Escribir, pero puede que en un futuro queramos usar esa información para algo)
			palindroma = Verdadero
			
		FinSi
		
		Si palindroma = Verdadero Entonces //Si es verdadero muestra en pantalla que la frase introducida es palíndroma, si no es verdadero, muestra que no es palíndroma
			Escribir "La frase es palíndroma"
		SiNo
			Escribir "La frase no es palindroma"
		FinSi
	
FinAlgoritmo
