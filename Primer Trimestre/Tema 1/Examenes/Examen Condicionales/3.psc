Algoritmo algun_numero_menor_a_diez
	
	Definir num,num1,num2 como Entero // Se definen tres variables (num,num1 y num2) como enteros, ya que no usaremos decimales.
	
	Escribir "Introduce tres números" //Se muestra por pantalla que introduzca tres numeros
	Leer num,num1,num2 //Se guardan los respectivos numeros en las variables
	
	Si  num < 10 o num1 < 10 o num2 < 10 Entonces //Se hace la comprobación de si algun numero es menor que diez
		Escribir "Alguno de los numeros introducidos es menor a diez" //Se muestra por pantalla que alguno de los tres numeros introducidos es menor que diez
	SiNo //En caso de que la condicion sea falsa
		Escribir "Todos los numeros son mayores a diez" //Se mostrará por pantalla que todos los numeros son mayores a diez
	FinSi
	
FinAlgoritmo
