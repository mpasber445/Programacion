Algoritmo textoconespaciado
	
	Escribir "Introduce un texto"
	Leer text
	EscribirEspaciado(text)
	
FinAlgoritmo

SubAlgoritmo EscribirEspaciado(textoaespaciar)
	
	Para x<-1 Hasta Longitud(textoaespaciar) Hacer
		
		Escribir Sin Saltar Subcadena(textoaespaciar,x,x) + " "
		
	FinPara
	Escribir " "
	
FinSubAlgoritmo
	