
public class ejercicio_diez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	for (int x = 1; x<=99999;x++) {
			
			if(esCapicua(x) == true) {
				System.out.println("El numero " + x + " es capicua");
			}
				
		}
			
	}

	public static boolean esCapicua(int num) {
		
		int num2=num;
		int num3 = 0;
		for(int x=String.valueOf(num).length();x>0;x--) {
			
			num3 *= 10;
			num3 += num2%10;
			num2 /= 10;
			
		}
		
		if (num==num3) {
			return true;
		}else {
			return false;
		}
		
	}
	
	}

