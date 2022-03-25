Algoritmo dias_transcurridos
	
	Escribir "Introduce una fecha"
	Escribir "Introduce el dia"
	Leer dia
	Escribir "Introduce el mes"
	Leer mes
	Escribir "Introduce el año"
	Leer año
	
	Si dia >30 o mes > 12 o dia <=0 o mes <=0 o año<=0 Entonces
		Escribir "Has introducido una fecha erronea."
	SiNo
		
		Si año = 2021 Entonces
			dia = dia + (mes*30) - 30
			
			Escribir "Han transcurrido " dia " dias"
		SiNo
			Si año > 2021 Entonces
				
				año = año-2021
				año = año*12
				mes = mes + año
				
				dia = dia + (mes*30) - 30
				
				Escribir "Han transcurrido " dia " dias"
			SiNo
				Si año < 2021 Entonces
					
					año = 2021-año
					año = año*12
					mes = mes + año
					
					dia = dia + (mes*30) - 30
					
					Escribir "Han transcurrido " dia " dias"
			FinSi
		FinSi
	FinSi
	

		
	FinSi
	
FinAlgoritmo
