Algoritmo CuentaDivisores
	
	Escribir "Introduce un numero y te diré cuantos divisores tiene"
	Leer numerointroducido
	Escribir Divisores(numerointroducido)
	
FinAlgoritmo

Funcion resultado <- Divisores(num)
	
	Para contador <- 1 Hasta num Con Paso 1 Hacer
        Si num % contador = 0 Entonces
            resultado <- resultado + 1
        FinSi
    FinPara
	

FinFuncion
