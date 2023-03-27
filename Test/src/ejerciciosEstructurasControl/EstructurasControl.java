/**
 * 
 */
package ejerciciosEstructurasControl;

/**
 * @author Alumno
 *
 */

public class EstructurasControl {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		ifSimple();

		ifDouble();
		
		ifAnidado();

	}
	
	static int nota=4;

	// Método de uso del if...
	// El if evalua una condición boleana, si la cumple ejecuta la acción del
	// interior del parentesis
	// en caso contrario no ejecuta nada y continua bajando por el código
	static void ifSimple() {
		if (nota >= 5) {
			System.out.println("Aprobado!(ifSimple)");
		}
	}

	//En el método anterior si no entraba en la condición se salía de la función,
	//si añadimos un else recogemos cuando no entra en la condición y ejecutamos el else
	static void ifDouble() {
		if (nota >= 5) {
			System.out.println("Aprobado!(ifDouble)");
		} else {
			System.out.println("Suspenso!(ifDouble)");
		}
	}

	
	//Podemos ejecutar varios if, poniendo if else, recogiendo entonces
	//multiples posibilidades y realizando opciones diferentes para cada uno.
	static void ifAnidado() {
		if (nota == 5) {
System.out.println("Suficiente!(ifAnidado)");
		} else if(nota==6){
			System.out.println("Bien!(ifAnidado)");
		} else if(nota==7 ||nota==8){
			System.out.println("Notable(ifAnidado)");
		} else if(nota==9) {
			System.out.println("Sobresaliente(ifAnidado)");
		} else if(nota==10) {
			System.out.println("Matrícula!(ifAnidado)(ifAnidado)");
		} else {
			System.out.println("Suspenso!(ifAnidado)");
		}
	}
}
