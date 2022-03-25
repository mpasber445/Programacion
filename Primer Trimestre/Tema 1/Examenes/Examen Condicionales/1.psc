Algoritmo Fecha_Navidad
	
	Definir dia Como Entero //Definimos la variable dia como entero, ya que usaremos un numero sin decimales
	Definir mes Como Entero //Definimos la variable mes como entero, ya que usaremos un numero sin decimales
	Definir a�o Como Entero //Definimos la variable a�o como entero, ya que usaremos un numero sin decimales
	
	Escribir "Introduce el d�a, mes y a�o" //Escribimos por pantalla el texto "Introduce el dia mes y a�o"
	Leer dia,mes,a�o //Leemos los datos introducidos por el usuario y los guardamos en las variables definidas enteriormente
	
	Si dia > 31 o dia <= 0 o mes > 12 o mes <= 0 o a�o <= 0 Entonces //Hacemos la comprobaci�n de que el d�a va a ser mayor a 31 o menor que 0, el mes mayor que 12 o menor que 0 y el a�o menor que 0
		Escribir "La fecha introducida no es correcta" // En caso que el usuario introduzca alguno de estos datos, le devolver� el mensaje diciendo que es erroneo, ya que ning�n dia del mes puede ser mayor a 31 o menor que 0, ningun mes puede ser mayor a 12 o menor que 0 y ningun a�o puede ser menor que 0
	SiNo // En caso de que el usuario no introduzca los datos comprobados anteriormente se ejecutara lo siguiente
		Si dia = 25 y mes = 12 Entonces //Realizamos la comprobaci�n de si el dia es 25 y el mes 12 (Fecha de navidad) 
			Escribir "La fecha introducida es navidad" //Si es correcto, le introducirael mensaje de que la fecha que ha introducido es navidad
		Sino //Si no introduce la fecha de navidad
			Escribir "La fecha introducida no es navidad" //Se introducira un mensaje diciendo que la fecha no es navidad
		FinSi
	FinSi
	
FinAlgoritmo
