Algoritmo nombre_corregido
	
	Escribir "Escribe tu nombre y apellidos"
	Leer nombre
	
	nombre = Minusculas(nombre)

	
	
	Para x<-1 Hasta Longitud(nombre) Con Paso 1 Hacer
		
		
		letra=Subcadena(nombre,x,x)
		letra_anterior= Subcadena(nombre,x-1,x-1)
		
		Si x = 1 Entonces
			Escribir Sin Saltar Mayusculas(Subcadena(nombre,x,x))
		SiNo
			Si (letra_anterior = " " y letra <> " ") Entonces
				Escribir sin saltar Mayusculas(letra)
			SiNo
			Escribir Sin Saltar Minusculas(Subcadena(nombre,x,x))
		FinSi
		FinSi
	FinPara
	Escribir ""	
	
	
FinAlgoritmo
