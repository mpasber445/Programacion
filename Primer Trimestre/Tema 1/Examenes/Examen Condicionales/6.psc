Algoritmo test_capacitación
	
	Definir preguntas_totales Como Entero  //Se define preguntas_correctas preguntas_totales y porcentaje_correctas como entero, ya que no usaremos decimales.
	Definir preguntas_correctas Como Entero
	Definir porcentaje_correctas Como Entero
	
	Escribir "¿Cuantas preguntas contestó?" //Se le pregunta al usuario cuantas preguntas contestó en total
	Leer preguntas_totales //Se guarda en una variable llamada preguntas_totales
	Escribir "¿Cuantas preguntas respondió correctamente?" //Se le pregunta al usuario cuantas preguntas respondió correctamente
	Leer preguntas_correctas //Se guarda en una variable llamada preguntas_correctas
	
	porcentaje_correctas = (preguntas_correctas*100)/preguntas_totales //Se hace una regla de 3 para calcular el porcentaje de preguntas correctas (Si preguntas_totales es el 100%, preguntas_correctas es X) y se guarda en la variable porcentaje_correctas
	
	Si preguntas_correctas < 0 o preguntas_totales <= 0 Entonces // Se comprueba la condicion si ha acertado menos de 0 preguntas, o se le han preguntado 0 o menos preguntas.
		Escribir "Alguno de los datos introducidos es incorrecto" //En caso verdadero, mostraría en pantalla un mensaje de error
	SiNo
		Si porcentaje_correctas >= 90 Entonces //Si el usuario obtuvo mas de 90% de preguntas correctas, se mostrara por pantalla que se clasifico en el nivel maximo
			Escribir "Usted se ha clasificado en el nivel maximo"
		Sino 
			Si porcentaje_correctas >= 75 y porcentaje_correctas < 90 Entonces //Si el usuario obtuvo mas o igual a 75% de preguntas correctas, y menos del 90% se mostrara por pantalla que se clasifico en el nivel medio
				Escribir "Usted se ha calsificado en el nivel medio"
			SiNo
				Si porcentaje_correctas >=50 y porcentaje_correctas < 75 Entonces //Si el usuario obtuvo mas o igual a 50% de preguntas correctas, y menos del 75% se mostrara por pantalla que se clasifico en el nivel regular
					Escribir "Usted se ha clasificado en el nivel regular"
				SiNo
					Si porcentaje_correctas < 50 Entonces //Si el usuario obtuvo menos de 50% de preguntas correctas, se mostrará por pantalla que ha quedado fuera de nivel
						Escribir "Usted no se ha clasificado, ha quedado fuera de nivel"
					SiNo
						Escribir "Datos Incorrectos" //En caso de que no se introduzca ninguno de estos datos, mostrará un mensaje de error (Este paso nunca debería ocurrir, ya que anteriormente comprobamos  Si preguntas_correctas < 0 o preguntas_totales <= 0, pero por si se nos pasa algun dato, es mejor ponerlo)
					FinSi
				FinSi
			FinSi
			
		FinSi
	FinSi
	
FinAlgoritmo
