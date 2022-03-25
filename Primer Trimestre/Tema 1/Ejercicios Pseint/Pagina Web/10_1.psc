Algoritmo adivinar_azar
	
	random_num = AZAR(100) + 1
	
	Escribir random_num
		
		Escribir "Intenta adivinar el numero, tienes 7 intentos"
		Leer num
		Para x<-1 Hasta 7 Con Paso 1 Hacer
			Si num = random_num Entonces
				Escribir "¡Has adivinado el numero!"		
				x = 7
		SiNo
			Si x = 7 Entonces
				Escribir "¡Te quedaste sin intentos!"
			SiNo
				Escribir "El numero no es correcto, vuelve a intentarlo"
				Leer num
			FinSi
		FinSi
		
		
		
	FinPara
	

FinAlgoritmo
