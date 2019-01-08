import java.util.Random;
import java.util.Scanner;

public class Ej5examen2 {

	/*
	 * 2 puntos
	 * 
	 * Crea en el mÈtodo 'main' un juego que consista en generar de forma aleatoria
	 * un n√∫mero entero comprendido entre 100 y 200 y pedirle al usuario que lo
	 * adivine. Para ello el programa le pedir· que introduzca por teclado un
	 * n√∫mero. Si introduce el n√∫mero correcto se mostrar· un mensaje por pantalla
	 * indicando que ha acertado acompa√±ado del n√∫mero de intentos realizados y
	 * del tiempo empleado. A continuaciÛn, se le dar· al usuario la opciÛn de
	 * volver a jugar o de finalizar el juego.
	 * 
	 */

	public static void main(String[] args) {
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		int x = r.nextInt(200 - 100 + 1) + 100;
		int numero;
		int intentos = 1;
		String respuesta;
		do {
			x = r.nextInt(200 - 100 + 1) + 100;
		do {
			do {
				System.out.println("Introduzca un numero entre el 100 y el 200: " + x);
				numero=in.nextInt();
			} while (numero < 100 || numero > 200);

			while (numero != x) {
				intentos++;
				do {
					System.out.println("Introduzca un numero entre el 100 y el 200: ");
					numero=in.nextInt();
				} while (numero < 100 || numero > 200);

			}
			if (numero == x) {
				System.out.println("Has acertado, el numero a adivinar era " + x + " lo has acertado en " + intentos + " intentos" );
			}
			System.out.println("øQuieres jugar de nuevo?  (s/n)");
			respuesta = in.nextLine();
			
		} while (respuesta.equalsIgnoreCase("s"));
		respuesta = in.nextLine();
		
		}while (respuesta.equalsIgnoreCase("s"));
		
		in.close();
	}
}
