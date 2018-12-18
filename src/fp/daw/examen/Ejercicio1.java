package fp.daw.examen;

public class Ejercicio1 {

	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, un método llamado 'mostrarVector' que
	 * reciba mediante un parámetro formal un vector de números enteros y lo muestre por
	 * pantalla en una única línea con el formato siguiente:
	 * 
	 * 				[num1, num2, num3, ...., numN]
	 * 
	 * donde num1, num2, num3, ..., numN son los números almacenados en el vector.
	 */
	
	public static void mostrarVector (int [] v) {
		System.out.print("[");
		for (int i=0;i<v.length;i++) {
			System.out.print(v[i]);
			if (i != v.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	
	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, la versión sobrecargada del método anterior que
	 * muestre por pantalla un vector de caracteres con el formato siguiente:
	 * 
	 * 				['c1', 'c2', 'c3', ...., 'cN']
	 * 
	 * donde 'c1', 'c2', 'c3', ...., 'cN' son los caracteres almacenados en el vector.
	 */

	public static void mostrarVector (char [] v) {
		System.out.print("[");
		for (int i=0;i<v.length;i++) {
			System.out.print("'"+ v[i] +"'");
			if (i != v.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
