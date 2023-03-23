package estructuraIFELSE;

public class EstructuraIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;
		int num1 = 1;
		
		if (num ==1) {
			System.out.println("num vale 1 y le sumo 2");
			num +=2;
		} else {
			System.out.println("num no vale 1 y le resto 2");
			num-=2;
		}
		
		System.out.println("Y el valor final de i es. "+num);
		num=num1;  //Reseteo la variable para repetir los ejemplos
		

		//Misma expresión de otra forma
		num = num==1 ? num+2 : num-2; 
		System.out.println("El valor final del número es "+num);
		num=num1;		//Reseteo la variable para repetir los ejemplos
		
		//De nuevo la misma expresión
		num += num ==1 ? 2 : -2;
		System.out.println("El valor final del número es "+num);
		num=num1;		//Reseteo la variable para repetir los ejemplos
		
	}
}
