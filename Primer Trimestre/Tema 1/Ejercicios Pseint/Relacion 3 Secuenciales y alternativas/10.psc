
Algoritmo piedrapapeltijera
	
	Escribir "Jugador 1: Introduce Piedra Papel o Tijera"
	Leer jugadoruno
	Escribir "Jugador 2: Introduce Piedra Papel o Tijera"
	Leer jugadordos
	
	Si jugadoruno == jugadordos Entonces
		Escribir "Empate, los dos habeis escogido " jugadoruno 
	SiNo
		Si jugadoruno == "Piedra" y jugadordos == "Tijera" o jugadoruno == "Tijera" y jugadordos == "Papel" o jugadoruno == "Papel" y jugadordos == "Piedra" Entonces
			Escribir "El Jugador 1 ha ganado, el escogio " jugadoruno " mientras que el Jugador 2 escogio " jugadordos
		SiNo
			Si jugadordos == "Piedra" y jugadoruno == "Tijera" o jugadordos == "Tijera" y jugadoruno == "Papel" o jugadordos == "Papel" y jugadoruno == "Piedra" Entonces
				Escribir "El Jugador 2 ha ganado, el escogio " jugadoruno " mientras que el Jugador 2 escogio " jugadordos
			FinSi
		FinSi
		
	FinSi
	
FinAlgoritmo
