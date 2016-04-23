
public class Vendedor extends Empleado {
	private double porcenComision;
	private double totalVtas;
	
	public double getPorcenComision() {
		return porcenComision;
	}
	public void setPorcenComision(double porcenComision) {
		this.porcenComision = porcenComision;
	}
	
	public double getTotalVtas() {
		return totalVtas;
	}
	public void setTotalVtas(double totalVtas) {
		this.totalVtas = totalVtas;
	}
	public Vendedor(String dni, String nombre, String apellido, String mail, double sueldoBase,
			double porcenComision, double totalVtas) {
		super(dni, nombre, apellido, mail, sueldoBase);
		this.porcenComision = porcenComision;
		this.totalVtas = totalVtas;
	}
	
	public void getSueldo(){
		
		double sueldo = super.getSueldoBase()+(this.porcenComision*this.totalVtas/100);
		
		System.out.println(sueldo);
	}
}
