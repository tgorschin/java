import java.util.*;
public class ej1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		
		System.out.println("Ingrese un numero de 3 cifras");
		n=sc.nextInt();
		
		System.out.println("Cifra Principal de " + n + " -> " + (n/100));
		System.out.println("Cifra Central de " + n + " -> " + (n/10)%10);
		System.out.println("Cifra Ultima de " + n + " -> " + (n%10));
	}
}
