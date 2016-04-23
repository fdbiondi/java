
public class Administrativo extends Empleado{
	private double hsExtra;
	private double hsMes;
	
	public double getHsExtra() {
		return hsExtra;
	}
	public void setHsExtra(double hsExtra) {
		this.hsExtra = hsExtra;
	}
	
	public double getHsMes() {
		return hsMes;
	}
	public void setHsMes(double hsMes) {
		this.hsMes = hsMes;
	}
	public Administrativo(String dni, String nombre, String apellido, String mail, double sueldoBase, double hsExtra, double hsMes) {
		super(dni, nombre, apellido, mail, sueldoBase);
		this.hsExtra = hsExtra;
		this.hsMes = hsMes;
	}

	public void getSueldo(){
		double preHsExtra = (double)1.5;
		double sueldo = super.getSueldoBase()*(((this.hsExtra* preHsExtra)+this.hsMes)/this.hsMes);
		
		System.out.println(sueldo);
	}
}
