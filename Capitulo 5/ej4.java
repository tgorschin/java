package tp4;
import java.util.*;
public class ej4 {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int num1, num2;

		System.out.println("Ingrese 2 numeros enteros");
		
		System.out.print("A:");
		num1=sc.nextInt();
		System.out.print("B:");
		num2=sc.nextInt();
		
		mayor(num1, num2);
	}

	public static int mayor(int num1, int num2) {
		
		if (num1>num2) {
			System.out.println("El numero mayor es "+num1);
		}else {
			System.out.println("El numero mayor es "+num2);
		}
		return num1;
	}
}
