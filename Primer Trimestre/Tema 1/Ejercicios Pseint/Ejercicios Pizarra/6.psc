Algoritmo unidad_centenas_decenas
	
	//Hacerlo sin TRUNC
	
	//Escribir "Introduce un numero positivo de tres cifras"
	//Leer num
	//n= TRUNC(num/100)
	//u = TRUNC((num-(n*100))/10)
	//u_s = (num-(n*100))/10
	//m = TRUNC((u_s-u)*10)
	
	
	//Si num < 100 o num > 999 Entonces
		//Escribir "Tu numero no es positivo o no tiene 3 cifras"
	//Sino
		//Escribir "Las centenas son " n " las decenas son " u " y las unidades son " m
	//FinSi
	
	
	Escribir "Introduce un numero positivo de tres cifras"
	Leer num

	

	
	Si num < 100 o num > 999 Entonces
		Escribir "Tu numero no es positivo o no tiene 3 cifras"
	Sino
		Escribir "Las centenas son " n " las decenas son " u " y las unidades son " m
	FinSi
	

	
FinAlgoritmo
