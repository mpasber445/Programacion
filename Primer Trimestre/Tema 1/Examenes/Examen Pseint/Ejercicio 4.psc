Algoritmo Ejercicio4
	
	Definir longitud_serpiente Como Entero
	Definir inicio Como Entero
	Definir random Como Entero
	
	
	inicio = 13
	
	//Se crean e inicializan las variables. Se inicializa la variable "inicio" con el numero 13 ya que será la posicion del primer caracter (@)
	
	Escribir "Introduce la longitud de la seripiente" //Se le pide al usuario que introduzca la longitud de la serpiente
	Leer longitud_serpiente
	
	Para x<-1 Hasta 12 Hacer
		
		Escribir Sin Saltar " "
		
	FinPara
	
	Escribir Sin Saltar "@"
	Escribir "" //Introduce el @ en el espacio numero 13 y pone un salto de linea
	
	Para x<- 0 Hasta longitud_serpiente Hacer
		
		
		
		
		Mientras random <> inicio y random <> inicio+1 y random <> inicio-1 Hacer
			
			random = AZAR(inicio) + 2
			
		FinMientras // Se consigue que en la variable random haya un numero que sea uno mayor, uno menor o igual que el caracter anterior (En el primer ciclo, como el @ esta en la posicion 13, random valdra 12,13 o 14)
		
		inicio = random //Se iguala la variable inicio a random, para que al siguiente ciclo, en vez de comparase con el "@" se compare con el caracter anterior
		
		
		Para z<-0 Hasta random-1 Hacer
			
			Escribir Sin Saltar " "
			
		FinPara //Introduce espacios hasta justo antes del lugar donde va ubicado el nuevo caracter
		
		Escribir "*" //Introduce el nuevo caracter
		random = AZAR(inicio) + 2 //Restartea la variable random, para que se vuelva a generar otro numero aleatorio y vuelva a entrar en el mientras anterior, si no reiniciamos aqui la variable, el caracter (*) siempre estará en el mismo lugar
	FinPara

	
FinAlgoritmo
