Algoritmo Ejercicio1
	
	Definir op Como Entero
	Definir num_uno,num_dos Como Entero
	op = 1  
	
	//Se definen las variables y se inicializa op (opcion) a 1 para que entre en el bucle
	Mientras op <> 0 Hacer
		
		Escribir "--- Menu de opciones ---"
		Escribir "1. Sumar dos numeros"
		Escribir "2. Restar dos numeros"
		Escribir "3. Multiplicar dos numeros"
		Escribir "4. Dividir dos numeros"
		Escribir "0. Salir"
		Leer op
		
		//Se muestra el menu y lee la opcion escogida, segun la opción ejecuta una funcion u otra.
		Segun op Hacer
			
			1:
				Escribir "Introduce el primer numero"
				Leer num_uno
				Escribir "Introduce el segundo numero"
				Leer num_dos
				Escribir "La suma de los dos numeros es ", Suma(num_uno,num_dos) //Se separan por comas ya que el + no funciona
				
			2:
				Escribir "Introduce el primer numero"
				Leer num_uno
				Escribir "Introduce el segundo numero"
				Leer num_dos
				Escribir "La resta de los dos numeros es ", Resta(num_uno,num_dos) //Se separan por comas ya que el + no funciona
				
			3: 
				Escribir "Introduce el primer numero"
				Leer num_uno
				Escribir "Introduce el segundo numero"
				Leer num_dos
				Escribir "La multiplicacion de los dos numeros es ", Mult(num_uno,num_dos) //Se separan por comas ya que el + no funciona
				
			4:
				Escribir "Introduce el primer numero"
				Leer num_uno
				Escribir "Introduce el segundo numero"
				Leer num_dos
				Escribir "La division de los dos numeros es ", Div(num_uno,num_dos) //Se separan por comas ya que el + no funciona
			De Otro Modo:
				Escribir "No has escogido una opcion valida"
		FinSegun
		
	FinMientras
	
	Escribir "Has introducido la opción 0 por lo que el programa se ha finalizado" //Si sale del bucle (El usuario ha introducido 0) se le muestra un mensaje anunciando que el programa ha terminado
	
	
FinAlgoritmo

Funcion resultado_suma <- Suma(primer_numero,segundo_numero) 
	
	resultado_suma = primer_numero + segundo_numero
	
FinFuncion

Funcion resultado_resta <- Resta(primer_numero,segundo_numero)
	
	resultado_resta = primer_numero - segundo_numero
	
FinFuncion

Funcion resultado_mult <- Mult(primer_numero,segundo_numero)
	
	resultado_mult = primer_numero * segundo_numero
	
FinFuncion

Funcion resultado_div <- Div(primer_numero,segundo_numero)
	
	resultado_div = primer_numero / segundo_numero
	
FinFuncion