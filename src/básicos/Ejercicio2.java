package básicos;

/*
 * Escribe un programa que muestre en la consola la división de 1234
 * entre 532, siendo ambos números reales. El resultado se mostrará con
 * un máximo de 15 dígitos, de los cuales dos se utilizarán para la
 * parte decimal.
 * 
 */

public class Ejercicio2 {
	
	public static void main(String[] args) {
		System.out.printf("1234 / 532 = %-15.2f\n", 1234f / 532f);
		System.out.printf("1234 / 532 = %.2f", 1234f / 532f);
	}

}
