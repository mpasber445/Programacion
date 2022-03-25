Algoritmo dieznumerosenteros
	
	Definir num,num1,num2,num3,num4,num5,num6,num7,num8,num9 Como Entero
	
	//Escribir "Introduce 10 numeros"
	//Leer num,num1,num2,num3,num4,num5,num6,num7,num8,num9
	
//	Si num >0 Entonces
//		suma = num
//	FinSi
//	
//	Si num1>0 Entonces
//		suma = suma+num1
//	FinSi
//	
//	Si num2 >0 Entonces
//		suma = suma+num2
//	FinSi
//	
//	Si num3>0 Entonces
//		suma = suma+num3
//	FinSi
//	Si num4 >0 Entonces
//		suma = suma+num4
//	FinSi
//	
//	Si num5>0 Entonces
//		suma = suma+num5
//	FinSi
//	Si num6 >0 Entonces
//		suma = suma+num6
//	FinSi
//	
//	Si num7>0 Entonces
//		suma = suma+num7
//	FinSi
//	Si num8 >0 Entonces
//		suma = suma+num8
//	FinSi
//	
//	Si num9>0 Entonces
//		suma = suma+num9
//	FinSi
//	
//	Escribir "La suma de todos los numeros positivos introducidos es " suma
//	
//	Si num=0 Entonces
//		cuenta = 1
//	FinSi
//	
//	Si num1=0 Entonces
//		cuenta = cuenta+1
//	FinSi
//	
//	Si num2 =0 Entonces
//		cuenta = cuenta+1
//	FinSi
//	
//	Si num3=0 Entonces
//		cuenta = cuenta+1
//	FinSi
//	Si num4=0 Entonces
//		cuenta = cuenta+1
//	FinSi
//	
//	Si num5=0 Entonces
//		cuenta = cuenta+1
//	FinSi
//	Si num6 =0 Entonces
//		cuenta = cuenta+1
//	FinSi
//	
//	Si num7=0 Entonces
//		cuenta = cuenta+1
//	FinSi
//	Si num8 =0 Entonces
//		cuenta = cuenta+1
//	FinSi
//	
//	Si num9=0 Entonces
//		cuenta = cuenta+1
//	FinSi
//	
//	Escribir "La cantidad de ceros introducidos es " cuenta
//	
//	Si num<0 Entonces
//		cuenta2 = 1
//		sumanegativos = num
//	FinSi
//	
//	Si num1<0 Entonces
//		cuenta2 = cuenta2+1
//		sumanegativos = sumanegativos+ num1
//	FinSi
//	
//	Si num2<0 Entonces
//		cuenta2 = cuenta2+1
//		sumanegativos = sumanegativos+ num2
//	FinSi
//	
//	Si num3<0 Entonces
//		cuenta2 = cuenta2+1
//		sumanegativos = sumanegativos+ num3
//	FinSi
//	Si num4<0 Entonces
//		cuenta2 = cuenta2+1
//		sumanegativos = sumanegativos+ num4
//	FinSi
//	
//	Si num5<0 Entonces
//		cuenta2 = cuenta2+1
//		sumanegativos = sumanegativos+ num5
//	FinSi
//	Si num6 <0 Entonces
//		cuenta2 = cuenta2+1
//		sumanegativos = sumanegativos+ num6
//	FinSi
//	
//	Si num7<0 Entonces
//		cuenta2 = cuenta2+1
//		sumanegativos = sumanegativos+ num7
//	FinSi
//	Si num8 <0 Entonces
//		cuenta2 = cuenta2+1
//		sumanegativos = sumanegativos+ num8
//	FinSi
//	
//	Si num9<0 Entonces
//		cuenta2 = cuenta2+1
//		sumanegativos = sumanegativos+ num9
//	FinSi
//	
//	media = sumanegativos/cuenta2
//	Escribir "La media de los numeros negativos introducidos es " media
	//	
	
	Para x<-1 Hasta 10 Hacer
		Escribir "Introduce un numero"
		Leer num
		Si num > 0 Entonces
			suma = suma+num
		SiNo
			Si num = 0 Entonces
				cuenta= cuenta+1
			SiNo
				Si num < 0 Entonces
					cuenta2 = cuenta2+1
					sumanegativos = sumanegativos+num
				FinSi
			FinSi
		FinSi
	FinPara
	
	media = sumanegativos/cuenta2
	
	Escribir "La suma de todos los numeros positivos es " suma
	Escribir "La cantidad de ceros introducidos es " cuenta
	Escribir "La media de los numeros negativos introducidos es " media
	
FinAlgoritmo
