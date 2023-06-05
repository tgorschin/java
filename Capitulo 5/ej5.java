package tp4;
import java.util.*;
public class ej5 {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int num1, num2, num3;

		System.out.println("Ingrese 3 numeros enteros");
		
		System.out.print("A:");
		num1=sc.nextInt();
		System.out.print("B:");
		num2=sc.nextInt();
		System.out.print("C:");
		num3=sc.nextInt();
		
		mayor(num1, num2, num3);
	}

	public static int mayor(int num1, int num2, int num3) {
		
		if (num1>num2) {
			System.out.println("El numero mayor es "+num1);
		}else {
		if (num2>num3) {
			System.out.println("El numero mayor es "+num2);
		}else{
			System.out.println("El numero mayor es "+num3);
		}
	}
		return num1;
	}
}
