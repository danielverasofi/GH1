/**
 * 
 */
package test2;

import java.util.Scanner;

/**
 * @author Alumno
 *
 */
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int numInt;
			long numLong, numNewLong;
			double numDou, numNewDou;

			System.out.println("Introduce un número entero");
			numInt = sc.nextInt();

			System.out.println("Introduce un número tipo long");
			numLong = sc.nextLong();

			System.out.println("Introduce un numero tipo Double");
			numDou = sc.nextDouble();

			System.out.println(
					"El número entero es " + numInt + ", num double es " + numDou + " y num Long es " + numLong);

			numNewLong = numInt;
			System.out.println("Asignación de int a long : " + numNewLong);

			numNewDou = numInt;
			System.out.println("Asignación de int a double : " + numNewDou);

			System.out.println("La suma del double y entero es " + (numInt + numNewDou));

			char character;
			System.out.println("Inserte un caracter: ");
			character = sc.next().charAt(0);

			System.out.println("El primer caracter del texto es: " + character);

			System.out.println("El valor númerico en unicode del char " + character + " es igual a " + (int) character);
		}
	}

}
