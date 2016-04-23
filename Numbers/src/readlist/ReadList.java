package readlist;

import java.util.Scanner;

public class ReadList {

	public void readList() {		
		int compare ,q =0;
		int[] list = new int[5];
		int[] nros = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nREAD LIST OF NUMBERS\n");
		
		System.out.println("Ingrese numero a comparar: ");
		compare = sc.nextInt();

		System.out.println("Ingrese lista de numeros.");
		
		for(int i = 0 ; i<list.length;i++){
			System.out.println("Ingrese " + i + " numero: ");
			list[i] = sc.nextInt();
			if(list[i]>compare){
				nros[q++]=list[i];
			}
		}
		
		System.out.println("Numeros mayores a " + compare);

		for(int i = 0; i<q; i++){
			System.out.println(list[i]);
		}

		sc.close();
	}
}


