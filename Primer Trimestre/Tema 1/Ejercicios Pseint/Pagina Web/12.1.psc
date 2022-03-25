Algoritmo TextoCentrado
	
	Escribir "Introduce el texto a centrar"
	Leer text
	EscribirCentrado(text)
	
FinAlgoritmo

SubProceso EscribirCentrado(textoacentrar)
	
	espacios = 40-Longitud(textoacentrar) / 2
	
	Para x<-1 Hasta espacios Hacer
		Escribir Sin Saltar " "
	FinPara
	
	Escribir Sin Saltar textoacentrar
	Escribir ""
	
FinSubProceso
