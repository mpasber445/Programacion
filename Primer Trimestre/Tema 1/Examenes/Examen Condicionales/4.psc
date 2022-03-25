Algoritmo coordenadas
	
	Definir x Como Real  //Se definen dos variables x y e como reales, ya que las coordenadas pueden tener decimales
	Definir e Como Real
	
	Escribir "Introduce las coordenadas" //Se muestra por pantalla un mensaje donde se pide al usuario que introduzca el eje x de sus coordenadas
	Escribir "Introduce el eje x"
	Leer x //Se guarda el valor introducido por el usuario en la variable x
	Escribir "Introduce el eje y" //Se muestra por pantalla un mensaje donde se pide al usuario que introduzca el eje y de sus coordenadas
	Leer e // Se guarda el valor introducido por el usuario en la variable e
	
	Si x = 0 o e = 0 Entonces //Si ambos ejes son cero, la coordenada estara ubicada en el centro, por lo que no pertenecerá a ningun cuadrante
		Escribir "Tu coordenada no pertenece a ningun cuadrante." // Se muestra un mensaje informando de que su coordenada no esta en ningun cuadrante
	SiNo 
		Si x > 0 y e > 0 Entonces // Si el eje horizontal es mayor que cero y el eje vertical es mayor que cero, entonces se ubicará en el primer cuadrante
			Escribir "La coordenada se encuentra en el 1º cuadrante" // Se muestra un mensaje informando de que su coordenada esta en el primer cuadrante
		SiNo
			Si x < 0 y e > 0 Entonces // Si el eje horizontal es menor que cero y el eje vertical es mayor que cero, entonces se ubicará en el segundo cuadrante
				Escribir "La coordenada se encuentra en el 2º cuadrante" // Se muestra un mensaje informando de que su coordenada esta en el segundo cuadrante
			SiNo
				Si x < 0 y e < 0 Entonces  // Si el eje horizontal es menor que cero y el eje vertical es menor que cero, entonces se ubicará en el segundo cuadrante
					Escribir "La coordenada se encuentra en el 3º cuadrante"  // Se muestra un mensaje informando de que su coordenada esta en el tercer cuadrante
				SiNo
					Si x > 0 y e < 0 Entonces // Si el eje horizontal es mayor que cero y el eje vertical es menor que cero, entonces se ubicará en el segundo cuadrante
						Escribir "La coordenada se encuentra en el 4º cuadrante"  // Se muestra un mensaje informando de que su coordenada esta en el cuarto cuadrante
					FinSi
				FinSi
				
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
