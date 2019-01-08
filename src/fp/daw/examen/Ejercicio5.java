package fp.daw.examen;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	/* 
	 * 2 puntos
	 * 
	 * Crea en el método 'main' un juego que consista en generar de forma aleatoria
	 * un número entero comprendido entre 100 y 200 y pedirle al usuario que lo
	 * adivine. Para ello el programa le pedirá que introduzca por teclado un número.
	 * Si introduce el número correcto se mostrará un mensaje por pantalla indicando
	 * que ha acertado acompañado del número de intentos realizados y del tiempo
	 * empleado. A continuación, se le dará al usuario la opción de volver a jugar o
	 * de finalizar el juego.
	 * 
	 */

	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(101) + 100;
		String cadena;

		Scanner in = new Scanner (System.in);
		System.out.print("Introduce un número entre 100 y 200: ");
		int num = in.nextInt();
		do {
			do {
				int contador = 0;
				if(n == num) {
					contador++;
					System.out.println("Has acertado el número, los intentos que has realizado han sido: "+contador);

				}
				else{
					contador++;
					System.out.println("Vuelve a intentarlo, llevas "+contador+" intentos");
				}
				if (num>200 || num<100){
					System.out.println("Has introducido mal el numero");
				}
			}while (n != num);
			System.out.println("¿Desea volver a jugar? (s/n): "); 
			cadena = in.nextLine();
		} while(cadena.equalsIgnoreCase("s"));
		
	}

}
