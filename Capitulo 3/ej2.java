package tp3;
import java.util.*;
public class ej2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sumaedad=0, edad, sumamedia=0, mayores=0;
		do {
			System.out.println("Ingrese un la edad de tus alumnos");
			System.out.println("Para finalizar ingresar 0");
			edad=sc.nextInt();
			
			if (edad>=18) {mayores=mayores+1;}
	
			sumaedad=sumaedad+edad;
			
			if (edad>0) { sumamedia=sumamedia+1;}
			
		}while(edad>0);
		
		sumamedia=sumaedad/sumamedia;
		
		System.out.println("La suma de las edades es "+sumaedad);
		System.out.println("La media de las edades es "+sumamedia);
		System.out.println("La cantidad de alumnos mayores es de "+mayores);
	}

}
