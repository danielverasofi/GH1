package test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, numAux;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserta un número: ");
		num1= sc.nextInt();
		System.out.println("Inserta otro número");
		num2= sc.nextInt();
		
		numAux = num1;
		num1 = num2;
		num2 = numAux;
		System.out.println("El primer número introducido es "+num2 + "el segundo número es "+num1);
		
		System.out.println("la suma de "+num2+"+"+num1+"="+(num1+num2));
	}

}
