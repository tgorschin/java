import java.util.*;
public class ej1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a, b;
		System.out.println("Ingrese dos numeros enteros");
		System.out.println("A:");
		a= sc.nextInt();
		System.out.println("B:");
		b= sc.nextInt();

		if (a==b){
			System.out.println("Tus numero son iguales");
		}else{
			System.out.println("Tus numeros no son iguales");
		}
}}
