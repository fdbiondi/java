import java.util.ArrayList;
import java.util.Scanner;

public class CalcSueldo {

	public static void main(String[] args) {
		
		String chargeAnother = "S";
		int resp;
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		Scanner sc = new Scanner(System.in);
		
		String dni, nombre, apellido, mail; 
		
		double sueldoBase, hsExtra, hsMes, totalVtas, porcenComision;
		
		//for (int i=0;i<cantEmp;i++){
		do {
			Empleado e;
			
			System.out.println("Administrativo[1] o Vendedor[2]?");
			resp = Integer.parseInt(sc.nextLine());
			
			if(resp == 1){
				System.out.println("Ingrese nombre");
				nombre= sc.nextLine();
				System.out.println("Ingrese apellido");
				apellido = sc.nextLine();
				System.out.println("Ingrese dni");
				dni = sc.nextLine();
				System.out.println("Ingrese mail");
				mail = sc.nextLine();
				System.out.println("Ingrese sueldo Base");
				sueldoBase = Double.parseDouble(sc.nextLine());
				System.out.println("Ingrese Horas extra");
				hsExtra = Double.parseDouble(sc.nextLine());
				System.out.println("Ingrese Horas mes");
				hsMes = Double.parseDouble(sc.nextLine());
				e = new Administrativo( dni,  nombre,  apellido,  mail, sueldoBase, hsExtra, hsMes); 
				empleados.add(e);
			}
			else{
				System.out.println("Ingrese nombre");
				nombre= sc.nextLine();
				System.out.println("Ingrese apellido");
				apellido = sc.nextLine();
				System.out.println("Ingrese dni");
				dni = sc.nextLine();
				System.out.println("Ingrese mail");
				mail = sc.nextLine();
				System.out.println("Ingrese sueldo Base");
				sueldoBase = Double.parseDouble(sc.nextLine());
				System.out.println("Ingrese porcentaje Comision");
				porcenComision = Double.parseDouble( sc.nextLine());
				System.out.println("Ingrese total de ventas");
				totalVtas = Double.parseDouble(sc.nextLine());
				e = new Vendedor( dni,  nombre,  apellido,  mail, sueldoBase, porcenComision, totalVtas); 
				empleados.add(e);
			}
			
			System.out.println("Quiere agregar otro empleado? S/N");
			chargeAnother = sc.nextLine();
			
		}while(!chargeAnother.equalsIgnoreCase("N"));
		sc.close();
		
		
		System.out.println("Listado Empleados");
		for(int i=0;i<empleados.size();i++){
			empleados.get(i).listarEmpleados();
			if (empleados.get(i) instanceof Administrativo)
				((Administrativo)empleados.get(i)).getSueldo();
			else
				((Vendedor)empleados.get(i)).getSueldo();
		}
	}
}