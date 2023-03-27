/**
 * 
 */
package ejercicios_Operadores;

/**
 * Clase principal del programa de calculos
 * @author Alumno
 *
 */
public class Calculos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Utilizando constructor por defecto o constructor vacio
		AreaRectangulo areaRectangulo = new AreaRectangulo();
		areaRectangulo.areaRectangulo(0, 0);
		

		
		//Utilizando constructor con parametros
		AreaRectangulo areaRectangulo2 = new AreaRectangulo(4.65 ,4.56);
		areaRectangulo2.arearectangulo();
		
		
		
		
		AreaCuadrado areaCuadrado = new AreaCuadrado();
		areaCuadrado.areaCuadrado(5);
		
		AreaCuadrado areaCuadrado2 = new AreaCuadrado(6);
		areaCuadrado2.areaCuadrado();

	}

}
