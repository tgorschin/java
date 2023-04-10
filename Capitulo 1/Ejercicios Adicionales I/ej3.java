package ejadicionales;
import java.util.*;
public class ej3 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int cat1, cat2, hipotenusa;
	
	
	System.out.println("Ingrese las medidas de 2 catetos en cm");
	System.out.println("A:");
	cat1= sc.nextInt();
	System.out.println("B:");
	cat2= sc.nextInt();
	hipotenusa= (int) Math.sqrt(cat1*cat1+cat2*cat2);
	System.out.println("Su hipotenusa es de: "+hipotenusa+"cm");
	}
}
