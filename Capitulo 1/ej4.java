package tp;
import java.util.Scanner;
public class ej4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		short min, max;
		min= -32768; max= 32767;
		min=(short) (min-1); max=(short) (max+1); 
		System.out.println(" El tipo short permite almacenar valores comprendidos entre -32 768 y 32 767. ");
		System.out.println(min);
		System.out.println(max);
	}
}
