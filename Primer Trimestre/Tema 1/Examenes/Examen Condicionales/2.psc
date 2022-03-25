Algoritmo numeros_menores_que_diez
	
	Definir num,num1,num2 como Entero // Se definen tres variables (num,num1 y num2) como enteros, ya que no usaremos decimales.
	
	Escribir "Introduce tres números" //Se muestra por pantalla que introduzca tres numeros
	Leer num,num1,num2 //Se guardan los respectivos numeros en las variables
	
	Si num < 10 y num1 < 10 y num2 < 10 Entonces //Se hace la comprobación de si todos los numeros son menores a diez
		Escribir "Todos los números son menores a diez" //Si es correcta, se escribe un mensaje en pantalla diciendo que todos los numeros son menores que diez
	SiNo // En caso de que no sea correcta
		Escribir "Algunos de los números introducidos es mayor que diez" //Se introducira un mensaje en pantalla diciendo que alguno de todos los numeros introducidos es mayor que diez
	FinSi
	
FinAlgoritmo
