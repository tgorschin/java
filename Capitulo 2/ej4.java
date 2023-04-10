import java.util.*;
public class ej1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a, b;
		System.out.println("Ingrese dos numeros distintos");
		System.out.println("A:");
		a= sc.nextInt();
		System.out.println("B:");
		b= sc.nextInt();

		if (a>b){
			System.out.println("El numero "+ a+" es mayor que "+b);
		}else{
			if (b>a){
			System.out.println("El numero "+ b+" es mayor que "+a);
		}else{
			System.out.println("Los numeros son iguales");
		}
}}}
