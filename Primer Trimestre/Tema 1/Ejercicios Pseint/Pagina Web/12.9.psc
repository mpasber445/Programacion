Algoritmo buscarenpalabra
	
	Definir resultado = Falso
	
	Escribir "Introduce una palabra"
	Leer palabra
	Escribir "Introduce lo que quieres buscar en esa palabra"
	Leer busqueda
	
	Si Contiene(palabra,busqueda) = Verdadero Entonces
		Escribir "La palabra contiene la busqueda"
	SiNo
		Escribir "La palabra no contiene la busqueda"
	FinSi
	
FinAlgoritmo

Funcion resultado <- Contiene(text,text2)
	
	
	Para x<-1 Hasta Longitud(text) Hacer
		
			Si text2 = Subcadena(text,x,x+Longitud(text2)-1) Entonces
				resultado = Verdadero
			FinSi
			
	FinPara
	
FinFuncion
	