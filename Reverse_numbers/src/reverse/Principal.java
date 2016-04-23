package reverse;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int[] numbers = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 9;i>0;i--){
			numbers[i] = sc.nextInt();
		}
		
		for(int i = 0;i<10;i++){
			System.out.println(numbers[i]);
		}
		sc.close();
		
	}

}
