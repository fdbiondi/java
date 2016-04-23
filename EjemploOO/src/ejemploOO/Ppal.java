package ejemploOO;

public class Ppal {
	
	public static void main(String[] args){
		Padre p = new Padre("Papa", "Es un objeto padre");
		
		System.out.println("p");
		//p.setNombre("Papa");
		p.setEdad(25);
		//p.setDescripcion("Padre del hijo");
		
		System.out.println(p.getDatos());
		//System.out.println(p.getCantDescYNom()); dont defined for the type Padre

		System.out.println(p.getTexto());
		//******************************************
		Hijo h = new Hijo();
		System.out.println("\n\nh");
		h.setNombre("Hijo");
		h.setDescripcion("Es un objeto hijo");
		
		System.out.println(h.getDatos());
		System.out.println(h.getCantDescYNom());
		

		System.out.println(h.getTexto());

		//*******************************************
		System.out.println("\n\nh2");
		Padre h2 = new Hijo(); //boxing
		h2.setNombre("Hijo2");
		h2.setDescripcion("Es un objeto hijo en una variable Padre");
		//System.out.println(h2.getCantDescYNom()); dont defined for the type Padre
		System.out.println(h2.getDatos());
		
		//force that h2 understand that in Hijo the method getCantDescYNom is defined
		System.out.println(((Hijo)h2).getCantDescYNom());
		

		System.out.println(h2.getTexto());

		
		System.out.println("\n\nh3");
		Hijo h3 = new Hijo();
		
		System.out.println(h3.getDatos());
		
	}
}
