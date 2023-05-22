package tp3;
import java.util.*;
public class ej8 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 int n;
     double factorial = 1;
	
     System.out.println("Introduce un numero");
     n = sc.nextInt();

     for (int i = 1; i <= n; i++) {
         factorial = factorial * i;
     }
		
     System.out.printf("%d! = %.0f %n", n, factorial);
	}

}
