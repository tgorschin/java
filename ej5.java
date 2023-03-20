package tp;
import java.util.Scanner;
public class ej5 {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	float nota1, nota2, prom;
	
	System.out.println("¿Cual fue tu primer nota?");
	nota1= sc.nextFloat();
	
	System.out.println("¿Cual fue tu segunda nota?");
	nota2= sc.nextFloat();
	
	prom=nota1+nota2;
	prom=prom/2;

	System.out.println("Tu promedio es de "+prom);

}
}
