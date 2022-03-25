Algoritmo Buscar_dato
	
	Dimension datos[10]
	Definir num Como Entero
	Definir num_usuario como Entero
	
	datos[1] <- 1
	datos[2] <- 9
	datos[3] <- 5
	datos[4] <- 5
	datos[5] <- 4
	datos[6] <- 1
	datos[7] <- 2
	datos[8] <- 2
	datos[9] <- 2
	datos[10] <- 3
	
	
	Escribir "Introduce que numero quieres buscar"
	Leer num_usuario
	
	Para x<-1 Hasta 10 con paso 1 Hacer
		
		Si datos[x] = num_usuario Entonces
			
			suma_total = suma_total + 1
			
		FinSi
	FinPara
	
	Escribir "Tu numero aparece " suma_total " veces"
	
FinAlgoritmo
