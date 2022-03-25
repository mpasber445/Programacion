Algoritmo numero_dos_cifras_en_letras
	//Hacer Sin TRUNC
	
	
	Escribir "Introduce un numero positivo de dos cifras"
	Leer num
	
	d = TRUNC(num/10)
	d_r = (num-(n*100))/10
	u = TRUNC((d_r-d)*10)
	
	Si num > 99 o num <= 0 Entonces
		
		Escribir "Tu numero tiene más de dos cifras, es negativo, o es cero."
	SiNo
		
		Segun num Hacer
			
			1:
				Escribir "Uno"
				
			2:
				Escribir "Dos"
				
			3:
				Escribir "Tres"
				
			4:
				Escribir "Cuatro"
				
			5:
				Escribir "Cinco"
				
			6:
				Escribir "Seis"
				
			7:
				Escribir "Ocho"
				
			9:
				Escribir "Nueve"
				
			10:
				Escribir "Diez"
				
			11:
				Escribir "Once"
				
			12:
				Escribir "Doce"
				
			13: 
				Escribir "Trece"
				
			14:
				Escribir "Catorce"
				
			15:
				Escribir "Quince"
				
			16:
				Escribir "Dieciseis"
				
			17:
				Escribir "Diecisiete"
				
			18:
				Escribir "Dieciocho"
				
			19:
				Escribir "Diecinueve"
				
			20:
				Escribir "Veinte"
				
			21:
				Escribir "Veintiuno"
				
			22:
				Escribir "Veintidos"
				
			23:
				Escribir "Ventitres"
				
			24:
				Escribir "Veinticuatro"
				
			25:
				Escribir "Veinticinco"
				
			26:
				
				Escribir "Ventiseis"
				
			27:
				Escribir "Ventisiete"
				
			28:
				Escribir "Veintiocho"
				
			29:
				Escribir "Veintinueve"
				
		FinSegun
		
		
		Si d = 3 Entonces
			Escribir Sin Saltar "Treinta "
			Segun u Hacer
				1:
					Escribir "y uno"
				2:
					Escribir "y dos"
				3:
					Escribir "y tres"
				4:
					Escribir "y cuatro"
				5:
					Escribir "y cinco"
				6:
					Escribir "y seis"
				7:
					Escribir "y siete"
				8:
					Escribir "y ocho"
				9:
					Escribir "y nueve"
			FinSegun
		SiNo
			Si d = 4 Entonces
				Escribir Sin Saltar "Cuarenta "
				Segun u Hacer
					1:
						Escribir "y uno"
					2:
						Escribir "y dos"
					3:
						Escribir "y tres"
					4:
						Escribir "y cuatro"
					5:
						Escribir "y cinco"
					6:
						Escribir "y seis"
					7:
						Escribir "y siete"
					8:
						Escribir "y ocho"
					9:
						Escribir "y nueve"
				FinSegun
			SiNo
				Si d = 5 Entonces
					Escribir Sin Saltar "Cincuenta "
					Segun u Hacer
						1:
							Escribir "y uno"
						2:
							Escribir "y dos"
						3:
							Escribir "y tres"
						4:
							Escribir "y cuatro"
						5:
							Escribir "y cinco"
						6:
							Escribir "y seis"
						7:
							Escribir "y siete"
						8:
							Escribir "y ocho"
						9:
							Escribir "y nueve"
					FinSegun
				SiNo
					Si d = 6 Entonces
						Escribir Sin Saltar "Sesenta "
						Segun u Hacer
							1:
								Escribir "y uno"
							2:
								Escribir "y dos"
							3:
								Escribir "y tres"
							4:
								Escribir "y cuatro"
							5:
								Escribir "y cinco"
							6:
								Escribir "y seis"
							7:
								Escribir "y siete"
							8:
								Escribir "y ocho"
							9:
								Escribir "y nueve"
						FinSegun
					SiNo
						Si d = 7 Entonces
							Escribir Sin Saltar "Setenta "
							Segun u Hacer
								1:
									Escribir "y uno"
								2:
									Escribir "y dos"
								3:
									Escribir "y tres"
								4:
									Escribir "y cuatro"
								5:
									Escribir "y cinco"
								6:
									Escribir "y seis"
								7:
									Escribir "y siete"
								8:
									Escribir "y ocho"
								9:
									Escribir "y nueve"
							FinSegun
						SiNo
							Si d = 8 Entonces
								Escribir Sin Saltar "Ochenta "
								Segun u Hacer
									1:
										Escribir "y uno"
									2:
										Escribir "y dos"
									3:
										Escribir "y tres"
									4:
										Escribir "y cuatro"
									5:
										Escribir "y cinco"
									6:
										Escribir "y seis"
									7:
										Escribir "y siete"
									8:
										Escribir "y ocho"
									9:
										Escribir "y nueve"
								FinSegun
							SiNo
								Si d = 9 Entonces
									Escribir Sin Saltar "Noventa "
									Segun u Hacer
										1:
											Escribir "y uno"
										2:
											Escribir "y dos"
										3:
											Escribir "y tres"
										4:
											Escribir "y cuatro"
										5:
											Escribir "y cinco"
										6:
											Escribir "y seis"
										7:
											Escribir "y siete"
										8:
											Escribir "y ocho"
										9:
											Escribir "y nueve"
									FinSegun
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
			
		FinSi
		
	FinSi
	
FinAlgoritmo
