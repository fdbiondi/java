
public class Empleado {
	private String dni;
	private String nombre;
	private String apellido;
	private String mail;
	private double sueldoBase;
	
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public Empleado(String dni, String nombre, String apellido, String mail, double sueldoBase) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.sueldoBase = sueldoBase;
	}
	
	public void listarEmpleados(){
		System.out.println("Nombre: "+ this.nombre + ", Apellido: "+this.apellido+", DNI: "+ this.dni +",Sueldo: "+this.sueldoBase);		
	}
}
