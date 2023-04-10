package ejadicionales;
import java.util.*;
public class ej2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double km, ms;
		
		System.out.println("Ingrese Km/hs a pasar a M/s");
		km= sc.nextInt();
		
		ms= km * 0.2778;
		
		System.out.println(km+"Km/hs es igual a "+ms+"M/s");
	}
