//Algoritmo horas_minutos_segundos
	
 //Hacerlo sin TRUNC
	//Escribir "Introduce el numero de segundos"
	//Leer seg
	
	//Si seg <= 0 Entonces
		//Escribir "No puedes introducir un numero negativo o cero"
	//SiNo
		//minutos = TRUNC(seg/60)
		//Escribir minutos
		//horas = TRUNC(minutos/60)
		//Escribir horas
		//minutos= TRUNC(minutos%60)
		//Escribir minutos
		//seg = TRUNC(seg%60)
		//Escribir seg
		//Escribir "Serían " horas " horas " minutos " minutos " seg " segundos "
	//FinSi
	
//FinAlgoritmo


Algoritmo horas_minutos_segundos
	
	//Definir horas Como Entero
	//Definir seg Como Entero
	//Definir minutos Como Entero
	
	Escribir "Introduce el numero de segundos"
	Leer seg
	
	horas = seg/3600
	minutos = ((horas*3600)-seg)/60
	seg = (minutos*60)-seg
	
	Si seg <= 0 Entonces
		Escribir "No puedes introducir un numero negativo o cero"
	SiNo
			Escribir "Serían " horas " horas " minutos " minutos " seg " segundos "
	FinSi
	
FinAlgoritmo
