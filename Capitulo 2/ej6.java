import java.util.*;
public class ej1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a, b;
		System.out.println("Ingrese dos	numeros");
		System.out.println("A:");
		a = sc.nextInt();
		System.out.println("B:");
		b = sc.nextInt();

		if(a>b){
		    System.out.print("el orden correcto es : "+a+"->"+b);
		}
		else
		    System.out.print("el orden de mayor a menor es : "+b+" -> "+a);
		}
	}
