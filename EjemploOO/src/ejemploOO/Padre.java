package ejemploOO;

public class Padre {
	//variables instancia/fields
	//variables clase/static
	
	//metodos instancia { ** Codigo Ejecutable ** }
	
	//metodos clase { ** Codigo Ejecutable ** }
	
	public static String texto; //class variable
	
	public static String getTexto() {
		return texto;
	}

	public static void setTexto(String texto) {
		Padre.texto = texto;
	}

	//method that it's executed when create the object
	public Padre(String nombre, String descripcion){
		this.setDescripcion(descripcion);
		this.setNombre(nombre);
		this.setTexto("Texto Estatico");
		
	}
	
	private String nombre;
	private String descripcion;
	private int edad;
	
	public String getNombre(){
		return this.nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getDatos(){
		return this.getNombre() + ": " + this.getDescripcion();
	}
}
