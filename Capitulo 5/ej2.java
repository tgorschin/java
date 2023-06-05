package tp4;
import java.util.*;
public class ej2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Escriba dos numeros (de menor a mayor)");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		System.out.println(mostrar(num1,num2));
	}
	
	public static int mostrar(int num1, int num2) {
		for (num1=num1;num1<num2;num1++) {
			System.out.println(num1);
		}
		return num1;
	}
	
}
