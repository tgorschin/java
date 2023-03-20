package tp;
import java.util.Scanner;
public class ej6 {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	float nota1, nota2, nota3; int prom;
	
	System.out.println("¿Cual fue tu primer nota?");
	nota1= sc.nextFloat();
	
	System.out.println("¿Cual fue tu segunda nota?");
	nota2= sc.nextFloat();
	
	System.out.println("¿Cual fue tu tercera nota?");
	nota3= sc.nextFloat();
	
	prom=(int) (nota1+nota2+nota3);
	prom=prom/3;

	System.out.println("Tu promedio es de "+prom);

}
}
