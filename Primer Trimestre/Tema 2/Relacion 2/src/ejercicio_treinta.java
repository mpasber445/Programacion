import java.util.Scanner;

public class ejercicio_treinta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		int diauno = 0;
		int diados = 0;
		int horauno = 0;
		int horados = 0;
		int diasdiferencia = 0;
		int horasdiferencia = 0;
		int horasrestantes = 0;
		boolean cumple = false;
		
		
		
		while (cumple == false) {
			
			System.out.println("Por favor introduzca la primera hora");
			System.out.println("Dia:");
			diauno = sn.nextInt();
			System.out.println("Hora:");
			horauno = sn.nextInt();
			System.out.println("Por favor introduzca la segunda hora");
			System.out.println("Dia:");
			diados = sn.nextInt();
			System.out.println("Hora:");
			horados = sn.nextInt();
			
			
			if (diauno < 8 && diauno > 0 && diados < 8 && diados > 0 && horauno >0 && horauno < 25 && horados >0 && horados < 25 && diauno<=diados){
				
				if (diauno == diados){
					
					if (horauno < horados) {
						cumple = true;
					}else {
						cumple = false;
					}
					
				}else {
					
					cumple = true;
					
				}
			}
			
		}
		
		if (diauno != diados) {
			
			diasdiferencia = Math.abs((diados-diauno-1)*24);
			
			horasrestantes = 24 - horauno;
			
			horasdiferencia = Math.abs((diasdiferencia+horasrestantes)+horados);
			
		} else {
			
			horasdiferencia = Math.abs((diasdiferencia-horauno)+horados);	
			
		}
		
		
		
		
		System.out.println("Hay " + (horasdiferencia) + " horas de diferencia");
	
		sn.close();
		
	}
	
	

}
