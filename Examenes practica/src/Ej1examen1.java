public class Ej1examen1 {

	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, un método llamado 'contiene' que
	 * reciba dos parámetros: un vector de cadenas de caracteres y una cadena.
	 * El método retornará true si la cadena recibida en el segundo parámetro
	 * se encuentra almacenada en el vector y false en caso contrario.
	 * El método incluirá una única sentencia 'return' y no está permitido el
	 * uso de variables booleanas.
	 */

	public static boolean contiene (String [] vector, String cadena) {
//		for (int i=0; i < vector.length ; i++) {
//			if(cadena.equals(vector[i])) {
//				return true;
//			}
//		}
//		return false;
		
		int i = 0;
		while(i<vector.length && !cadena.equals(vector[i])) {
			i++;
		}
		return i<vector.length;
	}
	
	
	
	/*
	 * 0,25 puntos
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba
	 * el método 'contiene' mostrando por pantalla el resultado de su ejecución. 
	 */
	public static void main(String[] args) {
		String [] vector = {"c1", "c2", "c3", "c4", "c5"};
		System.out.println(contiene(vector, "hola"));
		System.out.println(contiene(vector, "c4"));
	}
	
}
