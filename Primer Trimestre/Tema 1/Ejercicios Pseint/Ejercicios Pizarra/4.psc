Algoritmo fecha_nacimiento
	
	Escribir "Introduce la fecha de nacimiento"
	Escribir "Introduce el dia"
	Leer dia_nacimiento
	Escribir "Introduce el mes"
	Leer mes_nacimiento
	Escribir "Introduce el año"
	Leer año_nacimiento
	
	Escribir "Introduce la fecha actual"
	Escribir "Introduce el dia"
	Leer dia_actual
	Escribir "Introduce el mes"
	Leer mes_actual
	Escribir "Introduce el año"
	Leer año_actual
	
	
	Si dia_actual >30 o dia_nacimiento >30 o mes_actual > 12 o mes_nacimiento > 12 o dia_actual <=0 o dia_nacimiento <= 0 o mes_actual <=0 o mes_nacimiento <= 0 o año_actual <=0 o año_nacimiento <= 0 o año_nacimiento>año_actual  Entonces
		Escribir "Has introducido una fecha erronea."
	SiNo
		
		Si mes_nacimiento > mes_actual y año_actual <> año_nacimiento Entonces
			
			edad = (año_actual - año_nacimiento) - 1
			
			Escribir "Tu edad es " edad
			
		SiNo
			Si mes_nacimiento < mes_actual y año_actual <> año_nacimiento Entonces
				
				edad = (año_actual - año_nacimiento) 
				
				Escribir "Tu edad es " edad
			SiNo
				Si año_actual = año_nacimiento y mes_actual > mes_nacimiento Entonces
					
					edad = mes_actual-mes_nacimiento
					
					Escribir "Tienes " edad " meses"
				Sino
					Si año_actual = año_nacimiento y mes_actual = mes_nacimiento y dia_actual > dia_nacimiento Entonces
						
						edad = dia_actual - dia_nacimiento
						Escribir "Tienes " edad " dias"
					SiNo
						Escribir "Aun no has nacido"
						
					FinSi
					
				FinSi
			FinSi

			
		FinSi
		
	FinSi


	
FinAlgoritmo