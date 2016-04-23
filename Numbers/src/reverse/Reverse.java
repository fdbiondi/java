package reverse;
import java.util.Scanner;

public class Reverse {
	
	public void viewListReverse() {
		int[] n = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nREVERSE NUMBERS\n");
		
		for(int i = 0;i<10;i++){
			n[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 9;i>=0;i--){
			System.out.println(n[i]);
		}
	}

}
