package Herencia;


public class Test{
	public static void main(String[] args) {
		
		Alumno alumn1 = new Alumno();
		Sasi sasi1= new Sasi();
		
		alumn1.quienSoy();
		sasi1.quienSoy();
		
	}
}


class Alumno {
	
	String nombre= "Felipe";
	int telefono;
	int numEscalafon;
	
	public void quienSoy () {
		System.out.println("Soy el Sargento Alumno: " +this.nombre);
	}

}


class Sasi extends Alumno {
	
	String nombre;
	int telefono;
	int numEscalafon;
	int numServicio;
	
	public void quienSoy () {
		System.out.println("Soy el Sasi: " + super.nombre);
	}
}
