package incrementodecremento;

public class IncrementoDecremento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=15;
		
		System.out.println("Valor de i: "+i);
		
		System.out.println("Valor de i++ "+i++);
		
		System.out.println("Valor de i al haber ejecutado la linea anterior "+i);
		
		System.out.println("Valor de ++i "+ ++i);
		
		System.out.println("Vemos como en el caso de i++ no se ejecuta el incremento hasta despues de ejecutar la linea");
		System.out.println(" Sin embargo con ++i el valor cambia de forma inmediata");
	}

}
