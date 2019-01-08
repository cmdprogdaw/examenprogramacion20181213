package fp.daw.examen;

import java.util.Random;

public class Ejercicio4 {

	/* 
	 * 2 puntos
	 * 
	 * Define, después de este comentario, un método llamado 'numSecuencias' que
	 * reciba en un parámetro formal un vector de números enteros y retorne el 
	 * número de secuencias de números repetidos. Ejemplo, si el contenido del vector es:
	 * 	
	 * 		[9,2,2,3,2,5,7,7,7,4]
	 * 		   * *       * * * 
	 * 
	 * el método retornará el valor 2 ya que contiene las dos secuencias de números
	 * repetidos que se han señalado con los asteriscos.
	 * 
	 */
	
	public static int numSecuencias (int [] vector) {
		int n=0;
		
		for(int i=0;i<vector.length;i++) {
			if (vector[i] == vector[i+1]) {
				n++;
			}
		}
		return n;
	}
	
	/*
	 * 1 punto
	 * 
	 * Escribe en el método main las sentencias necesarias para crear un vector de números
	 * enteros de un tamaño aleatorio entre 10 y 100 y llenarlo con números enteros
	 * aleatorios comprendidos entre -100 y 100. A continuación se mostrará su contenido por 
	 * pantalla invocando al método 'mostrarVector' definido en el ejercicio 1 y el número
	 * de secuencias de números repetidos que contiene invocando al método 'numSecuencias'.
	 *  
	 */
	
	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(100 - 10 + 1) + 10;
		int [] vector = new int[n];
		for (int i=0; i<vector.length;i++) {
			vector[i] = r.nextInt(100 - (-100) + 1) -(-100); 
		}
	}
}
