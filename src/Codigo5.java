/*
 * El programa recibe un número entero, y compará si es un numero con suerte (si el residuo de la división del numero entre diez es igual
 * a 3, 7, 8 o 9), entra a un ciclo while hasta que en numero sea igual o menor a 0, cada que se hace la comprobación ni se divide entre 10.
 * Después de cada comprobación se imprimirá en consola que el numero ingresado es un número con suerte o un número sin suerte.
 *	
 */
import java.util.Scanner;

public class Codigo5 {
	// Se creó el método main
	public static void main (String [] args) {
		// Se importó la clase de Scanner y se agrego el parametro "System.in"
	    Scanner s = new Scanner(System.in);
	    // Se cambió el uso de comillas simples por comillas dobles
	    System.out.println("Introduzca un número: ");
	    // Se cambió el tipo de dato que recibe por un entero
	    int ni = s.nextInt();
	    
	    int c = ni;
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni > 0) {
	    	int digito = (int)(ni % 10);
	    	if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
	    		afo++;
	    	} else {
	    		noAfo++;
	    	}
	    	// Se cerró el bloque else antes de que afectará el decremento de la variable ni
	    	ni /= 10;
	    	
	    	if (afo > noAfo) {
	    		// Se corrigió el error en la sintaxis del sysout
	    		System.out.println("El " + c + " es un número afortunado.");
	    	} else {
	    		System.out.println("El " + c + " no es un número afortunado.");
	    	}
	    }
	    // Se cerró el scanner
	    s.close();

	}
	  
}
