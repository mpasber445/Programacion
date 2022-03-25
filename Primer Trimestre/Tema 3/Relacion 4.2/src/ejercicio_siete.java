import java.util.Scanner;
public class ejercicio_siete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//**********************Declaracion e iniciación de variables******************
		String[][] celdas = new String[4][5];
		int coordMinX = 0;
		int coordMinY = 0;
		int coordDinX = 0;
		int coordDinY = 0;
		int coord_x = 0;
		int coord_y = 0;
		boolean encontrado = false;
		Scanner sn = new Scanner(System.in);
	
		coordMinX = (int)Math.floor(Math.random()*(5-1)+1);
		coordMinY = (int)Math.floor(Math.random()*(4-1)+1);
		coordDinX = (int)Math.floor(Math.random()*(5-1)+1);
		coordDinY = (int)Math.floor(Math.random()*(4-1)+1);
		//**********************************************************************
		//Asignar valores a la matriz
		for (int h = 0 ; h<=3; h++) {
			
			for(int i = 0 ; i<=4; i++) {
				
				celdas[h][i] = " ";
				
			}
			
		}
		
		// Creacion del panel
		
		for(int al = 3; al>=0;al--) {
			
			System.out.print(al + "|");
			for(int an = 0; an<=4;an++) {
				
				System.out.print(celdas[al][an]);
				
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
		
		for(int an = 0; an<=4;an++) {
			
			System.out.print("-");
			
		}
		System.out.println(" ");
		System.out.print("");
		for(int an = 0; an<=4;an++) {
			
			System.out.print(an);
			
		}
		System.out.println(" ");
		System.out.println(" ");
		//Fin Creacion Panel
		//Hacer que dinero y mina no coincidan nunca
		while (coordMinX == coordDinX && coordMinY == coordDinY) {
			coordDinX = (int)Math.floor(Math.random()*(5-1)+1);
			coordDinY = (int)Math.floor(Math.random()*(4-1)+1);
		}
		
		//Fin Hacer que dinero y mina no coincidan nunca
		
		while(encontrado == false) {
			
			System.out.println("Coordenada x");
			coord_x = sn.nextInt();
			System.out.println("Coordenada y");
			coord_y = sn.nextInt();
			
			if (coord_x > 5 || coord_x < 0 ||coord_y > 4 || coord_y < 0) {
				
				System.out.println("Has introducido un valor erroneo");
				
			}else if(coord_x == coordMinX && coord_y == coordMinY) {
				
				celdas[coordMinY][coordMinX] = "*";
				celdas[coordDinY][coordDinX] = "$";
				for(int al = 3; al>=0;al--) {
					
					System.out.print(al + "|");
					for(int an = 0; an<=4;an++) {
						
						System.out.print(celdas[al][an]);
						
					}
					System.out.println(" ");
				}
				
				System.out.println(" ");
				
				for(int an = 0; an<=4;an++) {
					
					System.out.print("-");
					
				}
				System.out.println(" ");
				for(int an = 0; an<=4;an++) {
					
					System.out.print(an);
					
				}
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("El juego ha acabado, has caido en la mina");
				encontrado = true;
				
			}else if (coord_x == coordDinX && coord_y == coordDinY) {
				celdas[coordMinY][coordMinX] = "*";
				celdas[coordDinY][coordDinX] = "$";
				for(int al = 3; al>=0;al--) {
					
					System.out.print(al + "|");
					for(int an = 0; an<=4;an++) {
						
						System.out.print(celdas[al][an]);
						
					}
					System.out.println(" ");
				}
				
				System.out.println(" ");
				
				for(int an = 0; an<=4;an++) {
					
					System.out.print("-");
					
				}
				System.out.println(" ");
				for(int an = 0; an<=4;an++) {
					
					System.out.print(an);
					
				}
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("El juego ha acabado, has ganado el dinero");
				encontrado = true;
				
			} else if ((coord_x == coordMinX-1 || coord_x == coordMinX+1) && (coord_y == coordMinY-1 || coord_y == coordMinY+1)) {
				
				celdas[coord_y][coord_x] = "X";
				for(int al = 3; al>=0;al--) {
					
					System.out.print(al + "|");
					for(int an = 0; an<=4;an++) {
						
						System.out.print(celdas[al][an]);
						
					}
					System.out.println(" ");
				}
				
				System.out.println(" ");
				
				for(int an = 0; an<=4;an++) {
					
					System.out.print("-");
					
				}
				System.out.println(" ");
				for(int an = 0; an<=4;an++) {
					
					System.out.print(an);
					
				}
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("¡Cuidado! Hay una mina cerca");
				
			} else {
				
				
				celdas[coord_y][coord_x] = "X";
				for(int al = 3; al>=0;al--) {
					
					System.out.print(al + "|");
					for(int an = 0; an<=4;an++) {
						
						System.out.print(celdas[al][an]);
						
					}
					System.out.println(" ");
				}
				
				System.out.println(" ");
				
				for(int an = 0; an<=4;an++) {
					
					System.out.print("-");
					
				}
				System.out.println(" ");
				for(int an = 0; an<=4;an++) {
					
					System.out.print(an);
					
				}
				System.out.println(" ");
				System.out.println(" ");
				
			}
			
	
		}
		sn.close();
	}
	

}
