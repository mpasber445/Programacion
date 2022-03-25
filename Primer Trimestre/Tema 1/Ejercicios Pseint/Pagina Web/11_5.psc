Algoritmo contar_palabras
	
	//Si pones espacio al principio y al final te  cuenta como una palabra mas
	
	Escribir "Introduce una frase"
	Leer frase
	
	cuenta = 1
	
	i = 1
	
	longitud_palabra = Longitud(frase)
	
	ultima_letra = Subcadena(frase, longitud_palabra, longitud_palabra)
	
	primera_letra = Subcadena(frase,i,i)
	
	Mientras primera_letra = " " Hacer
		i = i + 1
		primera_letra = Subcadena(frase,i,i)
	FinMientras
	
	Mientras ultima_letra= " " Hacer
		
		longitud_palabra = longitud_palabra -1
		ultima_letra = Subcadena(frase, longitud_palabra, longitud_palabra)
		
	FinMientras
	
	Para i=i Hasta longitud_palabra Con paso 1 Hacer
		
		letra=Subcadena(frase,i,i)
		letra_siguiente= Subcadena(frase,i+1,i+1)

		
		
		Si letra = " " y letra_siguiente <> " " Entonces
			Escribir sin saltar Minusculas(letra)
			cuenta = cuenta + 1
		FinSi
		
		
	FinPara
	
	Escribir "Tu frase tiene " cuenta " palabras"
	
FinAlgoritmo
