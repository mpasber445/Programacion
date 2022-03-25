Algoritmo busca_el_tesoro
	//**********************Declaracion e iniciación de variables******************
	Dimension celdas[4,5]
	Definir coordMinX Como Entero
	Definir coordMinY Como Entero
	Definir coordDinX Como Entero
	Definir coordDinY Como Entero
	Definir coord_x Como Entero
	Definir coord_y Como Entero
	Definir encontrado Como Logico
	//Variable que define si el usuario ha encontrado la mina o el dinero
	encontrado = Falso
	//Coordenadas aleatorias para el dinero y la mina
	coordMinX = AZAR(5) + 1
	coordMinY = Azar(4) + 1
	coordDinX = AZAR(5) + 1
	coordDinY = AZAR(4) + 1

	//**********************************************************************
	//Asignar valores a la matriz
	Para h = 1 Hasta 4 Hacer
		Para i = 1 Hasta 5 Hacer
			celdas[h,i] = " "
		FinPara
	FinPara
	// Creacion del panel
	Para alto=4 Hasta 1 Con paso -1 Hacer
		Escribir Sin Saltar alto, "|"
		Para ancho = 1 Hasta 5 Hacer
			Escribir Sin Saltar celdas[alto,ancho]
		FinPara
		Escribir ""
	FinPara
	Escribir Sin Saltar " "
	Para ancho = 1 Hasta 5 Hacer
		Escribir Sin Saltar "-"
	FinPara
	Escribir ""
	Escribir Sin Saltar " "
	Para ancho = 1 Hasta 5 Hacer
		Escribir Sin Saltar ancho
	FinPara
	Escribir ""
	Escribir ""
	Escribir coordMinX,coordMinY,coordDinX,coordDinY
	//Fin Creacion del panel
	//Hacer que mina y dinero no coincidan nunca
	Mientras coordMinX = coordDinX y coordMinY = coordMinY Hacer
		coordDinX = AZAR(5) + 1
		coordDinY = AZAR(4) + 1
	FinMientras
	//Fin hacer que mina y dinero no coincidan nunca
		Mientras Encontrado = falso Hacer 
			Escribir "Coordenada x"
			Leer coord_x
			Escribir "Coordenada y"
			Leer coord_y		
			Si coord_x > 5 o coord_x < 1 o coord_y > 4 o coord_y < 1 Entonces
				Escribir "Has introducido un valor erroneo"
			SiNo
				Si coord_x = coordMinX y coord_y = CoordMinY Entonces 
					celdas[coordMinY,coordMinX] = "*"
					celdas[coordDinY,coordDinX] = "$"
					Para alto=4 Hasta 1 Con paso -1 Hacer
					Escribir Sin Saltar alto, "|"
					Para ancho = 1 Hasta 5 Hacer
						Escribir Sin Saltar celdas[alto,ancho]
					FinPara
					Escribir ""
				FinPara
				Escribir Sin Saltar " "
				Para ancho = 1 Hasta 5 Hacer
					Escribir Sin Saltar "-"
				FinPara
				Escribir ""
				Escribir Sin Saltar " "
				Para ancho = 1 Hasta 5 Hacer
					Escribir Sin Saltar ancho
				FinPara
				Escribir ""
				Escribir ""
				Escribir "El juego ha acabado, has caido en la mina"
				encontrado = Verdadero
			SiNo
				Si coord_x = coordDinX y coord_y = CoordDinY Entonces
					celdas[coordMinY,coordMinX] = "*"
					celdas[coordDinY,coordDinX] = "$"
					Para alto=4 Hasta 1 Con paso -1 Hacer
						Escribir Sin Saltar alto, "|"
						Para ancho = 1 Hasta 5 Hacer
							Escribir Sin Saltar celdas[alto,ancho]
						FinPara
						Escribir ""
					FinPara					
					Escribir Sin Saltar " "					
					Para ancho = 1 Hasta 5 Hacer
						Escribir Sin Saltar "-"
					FinPara										
					Escribir ""
					Escribir Sin Saltar " "
					Para ancho = 1 Hasta 5 Hacer
						Escribir Sin Saltar ancho
					FinPara					
					Escribir ""
					Escribir ""					
					Escribir "El juego ha acabado, has ganado el dinero"
					encontrado = verdadero
				SiNo
					celdas[coord_y,coord_x] = "X"
						Para alto=4 Hasta 1 Con paso -1 Hacer
						Escribir Sin Saltar alto, "|"
						Para ancho = 1 Hasta 5 Hacer
							Escribir Sin Saltar celdas[alto,ancho]
						FinPara						
						Escribir ""						
					FinPara					
					Escribir Sin Saltar " "					
					Para ancho = 1 Hasta 5 Hacer
						Escribir Sin Saltar "-"
					FinPara										
					Escribir ""
					Escribir Sin Saltar " "
					Para ancho = 1 Hasta 5 Hacer
						Escribir Sin Saltar ancho
					FinPara
					Escribir ""
					Escribir ""
				FinSi
			FinSi
			FinSi
		FinMientras
FinAlgoritmo