package saluda;

import java.util.Scanner;

public class Saluda {
	
	private static String _nombre;
	
	public void set_Nombre(String nombre) {
		_nombre = nombre;
	}
	
	public String get_Nombre() {
		return _nombre;
	}
	
	public void pideNombre() {
		System.out.println("¿Cómo te llamas?");
		System.out.println("Hola " + _nombre);
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);		
		System.out.println("¿Cómo te llamas?");		
		String nombre = teclado.nextLine();		
		System.out.println("Hola " + nombre);
		teclado.close();
		
	}

}
