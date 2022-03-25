Algoritmo numeros_mes
	
	Dimension dias_mes[12]
	
	Para x = 1 Hasta 8 Con Paso 2
		
		dias_mes[x] = 31
		
	FinPara
	
	Para x = 2 Hasta 8 Con Paso 2
		
		dias_mes[x] = 30
		
	FinPara
	
	
	Para x = 9 Hasta 12 Con Paso 2
		
		dias_mes[x] = 30
		
	FinPara
	
	Para x = 8 Hasta 12 Con Paso 2
		
		dias_mes[x] = 31
		
	FinPara
	
	
	dias_mes[2] = 28
	dias_mes[8] = 31
	
	Escribir "Introduce el numero de algun mes"
	Leer mes
	
	Si mes <= 0 o mes > 12 Entonces
		Escribir "El mes introducido no es valido"
	SiNo
		Escribir "El mes introducido tiene " dias_mes[mes] " dias"
	FinSi
	
FinAlgoritmo
