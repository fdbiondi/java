import java.util.Scanner;

public class CalcSueldo {

	public static void main(String[] args) {

		
		int cantEmp = 2, resp;
		Empleado[] empleado = new Empleado[cantEmp];
		Scanner sc = new Scanner(System.in);
		
		String dni, nombre, apellido, mail; 
		
		double sueldoBase, hsExtra, hsMes, totalVtas, porcenComision;
		
		for (int i=0;i<cantEmp;i++){
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
				empleado[i] = e;
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
				empleado[i] = e;
			}
		}
		sc.close();
		
		
		System.out.println("Listado Empleados");
		for(int i=0;i<cantEmp;i++){
			empleado[i].listarEmpleados();
			if (empleado[i] instanceof Administrativo)
				((Administrativo)empleado[i]).getSueldo();
			else
				((Vendedor)empleado[i]).getSueldo();
		}
		
	}
}