import java.util.Scanner;
public class ejercicio_veintiseis {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner sn = new Scanner(System.in);
		 
		 System.out.println("Introduce un numero");
		 int num = sn.nextInt();
		 System.out.println("Introduce un digito");
		 int digito = sn.nextInt();
		 int num2 = num;
		 int resto = 0;
		 int contador = 0;
		 
		 
		 while (num2 > 0) {
			 
			 num2 = num2/10;
			 contador++;
			 
		 }
		 
	
		 while (contador>0){
			 
			 resto = num%10;
			 num = num/10;
			 if (resto == digito%10) {
				 System.out.println(digito%10 + " ocupa la posicion " + contador);
				 
				 
			 }
			 contador--;
		 }
		 
		 sn.close();
		 
	}

}
