Algoritmo area_triangulo_circulo
	
	Escribir "Introduce la base del triangulo"
	Leer basetriangulo
	Escribir "Introduce la altura del triangulo"
	Leer alturatriangulo
	Escribir "Introduce el radio del circulo"
	Leer radiocirculo
	
	areatriangulo = (basetriangulo*alturatriangulo)/2
	areacirculo = PI*radiocirculo^2
	
	Escribir "El area del triangulo es " areatriangulo
	Escribir "El area del circulo es " areacirculo
	
	Si areatriangulo > areacirculo
		Escribir "El triangulo es mayor al circulo"
	SiNo
		Escribir "El circulo es mayor al triangulo"
	FinSi
	
FinAlgoritmo
