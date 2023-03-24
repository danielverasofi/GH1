package ejercicios_Operadores;

import java.util.Scanner;

public class AreaRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float base=0f;
		float altura = 0f;
		float area=0f;
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce la base: ");
		base=sc.nextFloat();
		System.out.println("Introduce la altura: ");
		altura=sc.nextFloat();
		area=base*altura;
		System.out.println("El area del rectangulo es :" +area);
		
	}

}
