import java.util.*;
public class ej1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a, b, c, p;
		
		System.out.println("Ingrese los 3 lados de su triangulo");
		
		System.out.println("A:");
		a =sc.nextInt();
		System.out.println("B:");
		b =sc.nextInt();
		System.out.println("C:");
		c =sc.nextInt();
	
		p=(a+b+c)/2;
		double area= Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		System.out.println("El area del triangulo es de "+ area);
	}
}
