import java.util.Scanner;
public class ej3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a�onacimiento, a�oactual, fin;
		
		System.out.println("�En que a�o naciste?");
		a�onacimiento = sc.nextInt();
		
		System.out.println("�En que a�o estamos?");
		a�oactual = sc.nextInt();
		
		fin=a�oactual-a�onacimiento;
		
		System.out.println("Naciste en el a�o "+fin);
	}

}
