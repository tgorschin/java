package practico;
import java.util.*;
public class ej11 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int nota;
		System.out.println("Ingrese una nota de 0 a 10");
		nota=sc.nextInt();
		
		switch (nota) {
		case 5:
			System.out.println("Suficiente");
			break;
			
		case 6:
			System.out.println("Bien");
			break;
		
		case 7:
			System.out.println("Suficiente");
			break;
			
		case 8:
			System.out.println("Suficiente");
			break;
			
		case 9:
			System.out.println("Sobresaliente");
			break;
			
		case 10:
			System.out.println("Sobresaliente");
			break;
		}
	}
}
