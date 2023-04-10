package ejadicionales;
import java.util.*;
public class ej1 {
	public static void main(String[] args) {
		int gradosc, gradosf;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Ingrese grados Celcius para pasar a Fahrenheit");
		gradosc = sc.nextInt();
		
		gradosf=32+(9*gradosc/5);
		
		System.out.println(gradosc+"°C es igual a "+gradosf+"°F");
	}
}
