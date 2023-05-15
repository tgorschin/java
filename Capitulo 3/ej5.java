package tp3;
import java.util.*;
public class ej5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,i=100, i2=200;
		
		do {
		System.out.println("Ingrese un numero entre 100 y 200");
		num=sc.nextInt();	
		}while(num<i || num>i2);
		
		System.out.println("Ingresaste un numero dentro del rango");

	}

}
