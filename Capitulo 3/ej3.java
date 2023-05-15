package tp3;
import java.util.*;
public class ej3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=(int) (Math.random()*100);
		int i=0;
		System.out.println(num);
		
		System.out.println("Intenta adivinar el numero entre 0 y 100");
		System.out.println("Para ganar tenes que encontrar el numero");
		System.out.println("Para rendirte ingresa 0 o un numero negativo");

		do {
			i=sc.nextInt();
			
			if (i>num) {
				System.out.println("Tu numero es mayor al incognito");
			}else {
				if (i<num) {
					System.out.println("Tu numero es menor al incognito");
				}else {
					System.out.println("Acertaste el numero");
				}
			}
		} while (i==num || i<0);
	}}

