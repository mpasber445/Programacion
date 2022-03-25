Algoritmo Ejercicio2
	
	Definir menu,num_uno,num_dos,op2,num_dia,numeros_a_sumar,numero_primo Como Entero
	Definir numero_invertir Como Caracter
	
	menu = 1
	
	//Se definen las variables y se inicializa menu a 1 para que entre en el bucle
	Mientras menu <> 0 Hacer
		
		Escribir "MENU PRINCIPAL"
		Escribir "--------------"
		Escribir "1. Operaciones Básicas"
		Escribir "2. Operaciones Variadas"
		Escribir "0. Salir"
		Escribir "--------------"
		Escribir "Introduce una opcion"
		Leer menu
		
		//Se lee el menu al que quiere entrar el usuario y segun el que escoja se le mostrará uno u otro
		Segun menu Hacer
			1: 
				Escribir "--- Menu de operaciones Básicas ---"
				Escribir "1. Sumar dos numeros"
				Escribir "2. Restar dos numeros"
				Escribir "3. Multiplicar dos numeros"
				Escribir "4. Dividir dos numeros"
				Escribir "0. Regresar"
				Leer op
				Segun op Hacer
					//Segun la opcion que escoja el usuario se ejecutara una funcion u otra
					1:
						Escribir "Introduce el primer numero"
						Leer num_uno
						Escribir "Introduce el segundo numero"
						Leer num_dos
						Escribir "La suma de los dos numeros es ", Suma(num_uno,num_dos)
						
					2:
						Escribir "Introduce el primer numero"
						Leer num_uno
						Escribir "Introduce el segundo numero"
						Leer num_dos
						Escribir "La resta de los dos numeros es ", Resta(num_uno,num_dos)
						
					3: 
						Escribir "Introduce el primer numero"
						Leer num_uno
						Escribir "Introduce el segundo numero"
						Leer num_dos
						Escribir "La multiplicacion de los dos numeros es ", Mult(num_uno,num_dos)
						
					4:
						Escribir "Introduce el primer numero"
						Leer num_uno
						Escribir "Introduce el segundo numero"
						Leer num_dos
						Escribir "La division de los dos numeros es ", Div(num_uno,num_dos)
					0:
						//Se deja vacio para que salga del según y vuelva al bucle mientras que le pide escojer menu
					De Otro Modo:
						Escribir "No has escogido una opcion valida" //Si el usuario introduce algun numero que no este en la lista como el 6, le mostrara un error y le volverá a mostrar el menu principal
				FinSegun
			2:
				
				Escribir "--- Menu de operaciones Variadas ---"
				Escribir "1. Numero y Dia"
				Escribir "2. Suma de los primeros n numeros naturales"
				Escribir "3. Numero Primos"
				Escribir "4. Invertir numero de 4 cifras"
				Escribir "0. Regresar"
				Leer op2
				Segun op2 Hacer
					
					1:
						Escribir "Introduce el numero y te dire a que dia de la semana corresponde"
						Leer num_dia
						Segun num_dia Hacer
							1:
								Escribir "El dia introducido es lunes"
							2:
								Escribir "El dia introducido es martes"
							3:
								Escribir "El dia introducido es miercoles"
							4:
								Escribir "El dia introducido es jueves"
							5:
								Escribir "El dia introducido es viernes"
							6:
								Escribir "El dia introducido es sabado"
							7:
								Escribir "El dia introducido es domingo"
							De Otro Modo:
								Escribir "El dia introducido no esta entre el 1 y el 7 (Dias de la semana)"
								
						FinSegun
					2:
						Escribir "Dime cuantos numeros quieres sumar"
						Leer numeros_a_sumar
						sumar_numeros_hasta(numeros_a_sumar)
						
					3:
						Escribir "Dime el numero y te dire si es primo"
						Leer numero_primo
						Si primo(numero_primo) = Verdadero Entonces
							Escribir "El numero es primo"
						SiNo
							Escribir "El numero no es primo"
						FinSi
						
					4:
						Escribir "Dime un numero a invertir"
						Leer numero_invertir
						invertirnumero(numero_invertir)
					0:
						//Se deja vacio para que salga del según y vuelva al bucle mientras que le pide escojer menu
					De Otro Modo:
						Escribir "No has escogido una opcion valida"//Si el usuario introduce algun numero que no este en la lista como el 6, le mostrara un error y le volverá a mostrar el menu principal
				FinSegun
		FinSegun
		
	FinMientras
	
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

SubAlgoritmo sumar_numeros_hasta(cant)
	
	Para x<-1 Hasta cant Hacer
		suma_total = suma_total + x
	FinPara
	
	Escribir "La suma de los primeros n numeros es = ", suma_total
	
FinSubAlgoritmo

Funcion resultado_primo <- primo(num)
	
	resultado_primo = Falso
	
	Para x<-1 Hasta num Hacer
		Si num%x = 0 Entonces
			contador = contador + 1
		FinSi
	FinPara
	
	Si contador = 2 Entonces
		resultado_primo = Verdadero
	SiNo
		resultado_primo = Falso
	FinSi
	
FinFuncion


SubAlgoritmo invertirnumero(num_invertir)
	
	
	Para x<-0 hasta Longitud(num_invertir) Hacer
		
		Escribir Sin Saltar Subcadena(num_invertir,Longitud(num_invertir) - x,Longitud(num_invertir) - x)
		
	FinPara
	
	Escribir " "
	
FinSubAlgoritmo
	