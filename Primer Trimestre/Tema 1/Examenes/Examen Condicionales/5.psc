Algoritmo informe_operario
	
	Definir sueldo Como Entero //Se declaran dos variables sueldo y a�o como enteros, ya que no usaremos decimales
	Definir a�os Como Entero
	
	Escribir "Introduce el sueldo y los a�os de antig�edad" //Se muestra un mensaje por pantalla informando al usuario que introduzca su sueldo y sus a�os de antiguedad
	Escribir "Sueldo:"
	Leer sueldo
	Escribir "A�os de Antig�edad:"
	Leer a�os
	
	Si sueldo <= 0 o a�os <= 0 Entonces // Si el sueldo es menor o igual a cero o los a�os que lleva en la empresa son menores o iguales a cero, se mostrar� por pantalla que el sueldo o los a�os son incorrectos, ya que significa que no trabajar� en esa empresa
		Escribir "El sueldo o los a�os son incorrectos"
	SiNo
		Si sueldo < 500 y a�os >= 10 Entonces //Si el sueldo es menor a 500 y sus a�os en la empresa son mayores o iguales que 10, obtendr� un 20% de aumento en su sueldo (el 20% del sueldo + su sueldo actual)
			Escribir "Se te ha otorgado un aumento del 20% tu anterior sueldo era " sueldo " mientras que tu nuevo sueldo es " (sueldo*0.20)+sueldo //Se muestra un mensaje en pantalla con su nuevo sueldo y el porcentaje que le pertenece
		SiNo
			Si sueldo < 500 y a�os < 10 Entonces // Si el sueldo es menor a 500 y lleva menos de diez a�os en la empresa, le corresponder� un aumento de salario de 5% (El 5% del sueldo + su sueldo actual)
				Escribir "Se te ha otorgado un aumento del 5% tu anterior sueldo era " sueldo " mientras que tu nuevo sueldo es " (sueldo*0.05)+sueldo //Se muestra un mensaje en pantalla con su nuevo sueldo y el porcentaje que le pertenece
			SiNo
				Si sueldo >= 500 Entonces //Si el sueldo es mayor o igual a 500, no le pertenecer� ningun aumento, por lo que se quedar� teniendo el mismo sueldo
					Escribir "No has obtenido ningun aumento, tu sueldo seguir� siendo de " sueldo //Se muestra en pantalla que no le pertenece ningun aumento y que su sueldo seguir� como el actual
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
