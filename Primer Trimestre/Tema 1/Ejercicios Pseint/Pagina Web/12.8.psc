Algoritmo sacariniciales
	
	Escribir "Introduce un texto"
	Leer textoasacariniciales
	
	Escribir Iniciales(textoasacariniciales)
	
	
FinAlgoritmo

Funcion resultado <- Iniciales(text)
	
	Para x<-1 Hasta Longitud(text) Hacer
		Si x = 1 y Subcadena(text,x,x) <> " " Entonces
			resultado = resultado + Mayusculas(Subcadena(text,x,x))
		Sino
		Si Subcadena(text,x,x) = " " y Subcadena(text,x+1,x+1) <> " "
			resultado = resultado +  Mayusculas(Subcadena(text,x+1,x+1))
		FinSi
		FinSi
	FinPara
	
FinFuncion
