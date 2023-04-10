import java.util.*;
public class ej1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Ingrese un numero");
		System.out.println("A:");
		n= sc.nextInt();

		if (n%2==0){
			System.out.println("Tu numero es par");
		}else{
			System.out.println("Tu numero es impar");
		}
}}
