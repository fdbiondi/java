package suma;
import figure.Triangle;


public class Suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=45, b=33;
		//int c = a + b;
		//System.out.println("resultado: "+c);
		
		Triangle triangle = new Triangle();
		
		triangle.side1 = 15;
		triangle.side3 = 15;
		triangle.side2 = 15;
		
		triangle.resizeSides(3);
		
		triangle.displaySidesValues();
		
	}

}
