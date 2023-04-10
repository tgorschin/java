import java.util.*;
public class ej1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		
		System.out.println("Ingrese un numero de 5 cifras");
		n=sc.nextInt();
		
		System.out.println("Primera Cifra de " + n + " -> " + (n/10000));
		
		System.out.println("Segunda Cifra de " + n + " -> " + (n/1000));
		System.out.println("Tercera Cifra de " + n + " -> " + (n/100));
		System.out.println("Cuarta Cifra de " + n + " -> " + (n/10));
		System.out.println("Quinta Cifra de " + n + " -> " + (n));
	}
}
