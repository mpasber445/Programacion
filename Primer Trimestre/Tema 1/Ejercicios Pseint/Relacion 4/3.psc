Algoritmo dados
	
	Definir tiradauno Como Caracter
	Definir tiradados Como Caracter
	
	Escribir "¿Cuanto has sacado en la primera tirada? (Escribelo con letras)"
	Leer tiradauno
	Escribir "¿Cuanto has sacado en la segunda tirada? (Escribelo con letras)"
	Leer tiradados
	

	
	Segun tiradauno Hacer
		"Uno":
			Definir tiradauno_uno Como Entero
			tiradauno_uno = 1
		"Dos":
			Definir tiradauno_uno Como Entero
			tiradauno_uno = 2
		"Tres":
			Definir tiradauno_uno Como Entero
			tiradauno_uno = 3
		"Cuatro":
			Definir tiradauno_uno Como Entero
			tiradauno_uno = 4
		"Cinco":
			Definir tiradauno_uno Como Entero
			tiradauno_uno = 5
		"Seis":
			Definir tiradauno_uno Como Entero
			tiradauno_uno = 6
		"uno":
			Definir tiradauno_uno Como Entero
			tiradauno_uno = 1
		"dos":
			Definir tiradauno_uno Como Entero
			tiradauno_uno = 2
		"tres":
			Definir tiradauno_uno Como Entero
			tiradauno_uno = 3
		"cuatro":
			Definir tiradauno_uno Como Entero
			tiradauno_uno = 4
		"cinco":
			Definir tiradauno_uno Como Entero
			tiradauno_uno = 5
		"seis":
			Definir tiradauno_uno Como Entero
			tiradauno_uno = 6
	FinSegun
	
	Segun tiradados Hacer
		"Uno":
			Definir tiradados_dos Como Entero
			tiradados_dos = 1
		"Dos":
			Definir tiradados_dos Como Entero
			tiradados_dos = 2
		"Tres":
			Definir tiradados_dos Como Entero
			tiradados_dos = 3
		"Cuatro":
			Definir tiradados_dos Como Entero
			tiradados_dos = 4
		"Cinco":
			Definir tiradados_dos Como Entero
			tiradados_dos = 5
		"Seis":
			Definir tiradados_dos Como Entero
			tiradados_dos = 6
		"uno":
			Definir tiradados_dos Como Entero
			tiradados_dos = 1
		"dos":
			Definir tiradados_dos Como Entero
			tiradados_dos = 2
		"tres":
			Definir tiradados_dos Como Entero
			tiradados_dos = 3
		"cuatro":
			Definir tiradados_dos Como Entero
			tiradados_dos = 4
		"cinco":
			Definir tiradados_dos Como Entero
			tiradados_dos = 5
		"seis":
			Definir tiradados_dos Como Entero
			tiradados_dos = 6
	FinSegun
	
	
	
	Si tiradauno_uno > 6 o tiradauno_uno < 1 o tiradados_dos > 6 o tiradados_dos < 1 Entonces
		Escribir "Los numeros deben estar entre el 1 y el 6"
	Sino 
		Escribir "La suma de las dos tiradas es " tiradauno_uno + tiradados_dos
	FinSi
	
FinAlgoritmo
