package saluda;

import java.util.Scanner;

public class Saluda {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);		
		System.out.println("¿Cómo te llamas?");		
		String nombre = teclado.nextLine();		
		System.out.println("Hola " + nombre);
		teclado.close();
		
	}

}
