package Principal;
import readlist.ReadList;
import reverse.Reverse;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("MENU\n1-Reverse Numbers\n2-Read 20 Numbers\n");
		
		System.out.println("Ingrese Opcion ");
		x = sc.nextInt();
		
		if (x==2){
			ReadList r = new ReadList();
			r.readList();
		}else{
			Reverse r = new Reverse();
			r.viewListReverse();	
		}
		sc.close();
		
	}

}
