package oppoi;
import java.util.Scanner;
public class ej12 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		int dia, mes, año;
		
		System.out.println("Introduce un numero del 1 al 7");
		dia=sc.nextInt();
	
		switch (dia) {
		case 1:
			System.out.println("Es el dia lunes");
			break;
		case 2:
			System.out.println("Es el dia martes");
			break;
		case 3:
			System.out.println("Es el dia miercoles");
			break;
		case 4:
			System.out.println("Es el dia jueves");
			break;
		case 5:
			System.out.println("Es el dia viernes");
			break;
		case 6:
			System.out.println("Es el dia sabado");
			break;
		case 7:
			System.out.println("Es el dia domingo");
			break;
		}
	}}
