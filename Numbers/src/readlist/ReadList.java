package readlist;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadList {

	public static void readList() {		
		int compare ;
		String q = "S";
		ArrayList<Integer> nros = new ArrayList<Integer>();
		
		int num ;
		//int[] list = new int[5];
		//int[] nros = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nREAD LIST OF NUMBERS\n");
		
		System.out.println("Ingrese numero a comparar: ");
		compare = Integer.parseInt(sc.nextLine());

		System.out.println("Ingrese lista de numeros.");
		/*
		for(int i = 0 ; i<list.length;i++){
			System.out.println("Ingrese " + i + " numero: ");
			list[i] = sc.nextInt();
			if(list[i]>compare){
				nros[q++]=list[i];
			}
		}*/
		
		do {
			System.out.println("Ingrese un numero: ");
			num = Integer.parseInt(sc.nextLine());
			if(num>compare){
				nros.add(num);
			}
			System.out.println("Desea ingresar otro numero? S/N");
			q = sc.nextLine();
			
		}while(!q.equalsIgnoreCase("N"));
		
		
		System.out.println("Numeros mayores a " + compare);

		for(int i = 0; i<nros.size(); i++){
			System.out.println(nros.get(i));
		}

		sc.close();
	}
}


