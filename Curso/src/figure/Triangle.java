package figure;

public class Triangle {

	public int side1;
	public int side2;
	public int side3;
	
	public void resizeSides(int howMuch){
		this.side1 *= howMuch;
		this.side2 *= howMuch;
		this.side3 *= howMuch;
	}
	
	public void displaySidesValues(){
		System.out.println("lado 1: "+ this.side1 +" - lado 2: "+ this.side2+" - lado 3: "+ this.side3);
	}
	
}
