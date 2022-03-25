Algoritmo informe_operario
	
	Definir sueldo Como Entero //Se declaran dos variables sueldo y año como enteros, ya que no usaremos decimales
	Definir años Como Entero
	
	Escribir "Introduce el sueldo y los años de antigüedad" //Se muestra un mensaje por pantalla informando al usuario que introduzca su sueldo y sus años de antiguedad
	Escribir "Sueldo:"
	Leer sueldo
	Escribir "Años de Antigüedad:"
	Leer años
	
	Si sueldo <= 0 o años <= 0 Entonces // Si el sueldo es menor o igual a cero o los años que lleva en la empresa son menores o iguales a cero, se mostrará por pantalla que el sueldo o los años son incorrectos, ya que significa que no trabajará en esa empresa
		Escribir "El sueldo o los años son incorrectos"
	SiNo
		Si sueldo < 500 y años >= 10 Entonces //Si el sueldo es menor a 500 y sus años en la empresa son mayores o iguales que 10, obtendrá un 20% de aumento en su sueldo (el 20% del sueldo + su sueldo actual)
			Escribir "Se te ha otorgado un aumento del 20% tu anterior sueldo era " sueldo " mientras que tu nuevo sueldo es " (sueldo*0.20)+sueldo //Se muestra un mensaje en pantalla con su nuevo sueldo y el porcentaje que le pertenece
		SiNo
			Si sueldo < 500 y años < 10 Entonces // Si el sueldo es menor a 500 y lleva menos de diez años en la empresa, le corresponderá un aumento de salario de 5% (El 5% del sueldo + su sueldo actual)
				Escribir "Se te ha otorgado un aumento del 5% tu anterior sueldo era " sueldo " mientras que tu nuevo sueldo es " (sueldo*0.05)+sueldo //Se muestra un mensaje en pantalla con su nuevo sueldo y el porcentaje que le pertenece
			SiNo
				Si sueldo >= 500 Entonces //Si el sueldo es mayor o igual a 500, no le pertenecerá ningun aumento, por lo que se quedará teniendo el mismo sueldo
					Escribir "No has obtenido ningun aumento, tu sueldo seguirá siendo de " sueldo //Se muestra en pantalla que no le pertenece ningun aumento y que su sueldo seguirá como el actual
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
