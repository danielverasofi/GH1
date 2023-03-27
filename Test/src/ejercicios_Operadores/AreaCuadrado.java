package ejercicios_Operadores;

public class AreaCuadrado {

	private double lado=0.0;
	
	
	public AreaCuadrado() {
		super();
	}
	public AreaCuadrado(double lado){
		this.lado=lado;
	}
	
	
	
	public void areaCuadrado() {
		System.out.println("El area del cuadrado es: "+lado*lado);
	}
	public void areaCuadrado(double lado) {
		System.out.println("El area del cuadrado es: "+lado*lado);
	}

}
