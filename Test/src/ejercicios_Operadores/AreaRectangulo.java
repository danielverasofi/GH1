package ejercicios_Operadores;

// import java.util.Scanner;

public class AreaRectangulo {

	
	private double base=0;
	private double altura=0;
	
	
	//Constructor por defecto, necesitamos crearlo si creamos un constructor de clase pisamos el constructor por defecto.
	public AreaRectangulo() {
		super();
	}
	//Constructor con aprametros
	public AreaRectangulo (double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	//  Antiguo metodo main, en el que calculabamos el area de un rectangulo 
	// recogiendo los valores por consola
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		float base = 0f;
//		float altura = 0f;
//		float area = 0f;
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Introduce la base: ");
//		base = sc.nextFloat();
//		System.out.println("Introduce la altura: ");
//		altura = sc.nextFloat();
//		area = base * altura;
//		System.out.println("El area del rectangulo es :" + area);
//		sc.close();
//	}
	
	
	


	//Función usando los parametros que nos pasen
	public void areaRectangulo(float base, float altura) {
		System.out.println("El area  del rectangulo es: "+(base*altura));
	}
	
	//Función usando los parametros de la clase
	public void arearectangulo() {
		System.out.println("El area del rectangulo es: "+ (this.base*this.altura));
	}
}
