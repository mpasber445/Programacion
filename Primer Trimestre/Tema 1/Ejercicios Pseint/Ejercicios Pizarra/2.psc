Algoritmo dias_transcurridos
	
	Escribir "Introduce una fecha"
	Escribir "Introduce el dia"
	Leer dia
	Escribir "Introduce el mes"
	Leer mes
	Escribir "Introduce el a�o"
	Leer a�o
	
	Si dia >30 o mes > 12 o dia <=0 o mes <=0 o a�o<=0 Entonces
		Escribir "Has introducido una fecha erronea."
	SiNo
		
		Si a�o = 2021 Entonces
			dia = dia + (mes*30) - 30
			
			Escribir "Han transcurrido " dia " dias"
		SiNo
			Si a�o > 2021 Entonces
				
				a�o = a�o-2021
				a�o = a�o*12
				mes = mes + a�o
				
				dia = dia + (mes*30) - 30
				
				Escribir "Han transcurrido " dia " dias"
			SiNo
				Si a�o < 2021 Entonces
					
					a�o = 2021-a�o
					a�o = a�o*12
					mes = mes + a�o
					
					dia = dia + (mes*30) - 30
					
					Escribir "Han transcurrido " dia " dias"
			FinSi
		FinSi
	FinSi
	

		
	FinSi
	
FinAlgoritmo
