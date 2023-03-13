import java.util.Scanner;
public class ej3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int añonacimiento, añoactual, fin;
		
		System.out.println("¿En que año naciste?");
		añonacimiento = sc.nextInt();
		
		System.out.println("¿En que año estamos?");
		añoactual = sc.nextInt();
		
		fin=añoactual-añonacimiento;
		
		System.out.println("Naciste en el año "+fin);
	}

}
