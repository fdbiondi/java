package ejemploOO;

public class Hijo extends Padre{
	
	public Hijo(){
		super("Default", "Default");
	}

	public String getDescripcion(){
		return "Descripcion: " + super.getDescripcion();
	}
	
	public String getDatos(){
		return "Nombre: " + this.getNombre() + "\nDescripcion: " + this.getDescripcion();
	}
	
	public int getCantDescYNom(){
		return getNombre().length() + super.getDescripcion().length();
	}
	
}
