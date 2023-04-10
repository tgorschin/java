import java.util.*;
public class ej4 {

	public static void main(String[] args) {
		double v, r;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el radio de tu esfera");
		r= sc.nextInt();
		
		v=(4.0/3.0)*Math.PI*(Math.pow(r,3));
	
		System.out.println("El volumen de tu esfera es de "+v);
	}
}
