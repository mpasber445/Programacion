package Herencia3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Comercial EMP1 = new Comercial("Juan",32,500,500);
		Comercial EMP2 = new Comercial("Pepe",30,200,20);
		Repartidor EMP3 = new Repartidor("Luis",19,200,"zona 3");
		Repartidor EMP4 = new Repartidor("Lucia",32,200,"zona 4");

		
		System.out.println(EMP1.plus());
		System.out.println(EMP2.plus());
		System.out.println(EMP3.plus());
		System.out.println(EMP4.plus());

		
	}

}
