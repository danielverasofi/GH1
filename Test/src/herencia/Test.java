package herencia;


public class Test{
	public static void main(String[] args) {
		
		Alumno alumn1 = new Alumno(null, 0, 0);
		Sasi sasi1= new Sasi(null, 0, 0, null, 0, 0, 0);
		
		alumn1.quienSoy();
		sasi1.quienSoy();
		
	}
}
/* you */
// fail

class Alumno {
	
	
	public Alumno(String nombre, int telefono, int numEscalafon) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.numEscalafon = numEscalafon;
	}

	String nombre= "Felipe";
	int telefono;
	int numEscalafon;
	
	public void quienSoy () {
		System.out.println("Soy el Sargento Alumno: " +this.nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getNumEscalafon() {
		return numEscalafon;
	}

	public void setNumEscalafon(int numEscalafon) {
		this.numEscalafon = numEscalafon;
	}
	
	

}


class Sasi extends Alumno {
	
	
	public Sasi(String nombre, int telefono, int numEscalafon, String nombre2, int telefono2, int numEscalafon2,
			int numServicio) {
		super(nombre, telefono, numEscalafon);
		
		nombre = nombre2;
		telefono = telefono2;
		numEscalafon = numEscalafon2;
		this.numServicio = numServicio;
	}

	String nombre;
	int telefono;
	int numEscalafon;
	int numServicio;
	


	public void quienSoy () {
		System.out.println("Soy el Sasi: " + super.nombre);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getNumEscalafon() {
		return numEscalafon;
	}

	public void setNumEscalafon(int numEscalafon) {
		this.numEscalafon = numEscalafon;
	}

	public int getNumServicio() {
		return numServicio;
	}

	public void setNumServicio(int numServicio) {
		this.numServicio = numServicio;
	}
}
