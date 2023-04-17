package practico;
import java.util.*;
public class ej11 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int dia,mes,año;
		System.out.println("Ingrese una fecha");
		System.out.println("Dia:");
		dia=sc.nextInt();
		
		System.out.println("Mes");
		mes=sc.nextInt();
		
		System.out.println("Año");
		año=sc.nextInt();

		
		if(mes>=13 || dia>=32) {
			System.out.println("La fecha es incorrecta");
			}else {
		
		if(mes==4 | mes==6 | mes==9 | mes==11 && dia>=31) {
			System.out.println("La fecha es incorrecta");
		}else {
			if (mes==2 && dia>=29) {
				System.out.println("La fecha es incorrecta");
			}else {
				System.out.println("La fecha es correcta");
			}}
		}}
	}
