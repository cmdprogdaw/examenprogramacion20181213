package fp.daw.examen;

public class Ejercicio3 {

	/*
	 * 2 puntos
	 * 
	 *  Define, después de este comentario, un método llamado 'stringToArray2D' que
	 *  reciba como parámetro una cadena de caracteres y retorne un array de caracteres
	 *  de dos dimensiones que tendrá exactamente dos filas y el contenido siguiente en
	 *  cada una de ellas:
	 *  
	 *  	* Primera fila: caracteres de la cadena que ocupan posiciones pares (0, 2, 4, ...).
	 *  	* Segunda fila: caracteres de la cadena que ocupan posiciones impares (1, 3, 5, ...).
	 *  
	 *  El número de columnas en cada fila no excederá del estrictamente necesario para
	 *  almacenar los caracteres que se indican en cada caso.
	 *  
	 */
	
	public static char [][] stringToArray2D(String s){
		char [][] c = new char[2][];
		int l = s.length() / 2;
//		if (s.length() % 2 == 0)
//			c[0] = new char [l];
//		else 
//			c[0] = new char [l + 1];
		c[0] = new char [l + s.length() % 2]; //igual al if
		c[1] = new char [l];
//		int j=0;
//		int k=0;
//		for(int i=0;i<s.length();i++) {
//			if (i % 2 == 0) {
//				c[0][j++] = s.charAt(i);
//			}
//			else {
//				c[1][k++] = s.charAt(i);
//			}
//		}
//		return c;
		for(int i=0;i<s.length();i++) {
			if (i % 2 == 0) {
				c[0][i/2] = s.charAt(i);
			}
			else {
				c[1][i/2] = s.charAt(i);
			}
		}        
		return c;
	}
	/*
	 * 1 punto
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba
	 * el método 'stringToArray2D' mostrando por pantalla el resultado de su ejecución.
	 * Se mostrará en cada fila del array en una línea de la pantalla utilizando para
	 * ello el método definido en el ejercicio 1.
	 * 
	 */
	
	public static void main(String[] args) {
		char [][] c = stringToArray2D("Adios");
		Ejercicio1.mostrarVector(c[0]);
		System.out.println();
		Ejercicio1.mostrarVector(c[1]);
	}

}
