package tp;
import java.util.Scanner;
public class ej2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int edad;
		
		System.out.println("�Cual es tu edad?");
		edad = sc.nextInt();

		edad=edad+1;
		System.out.println("El a�o que viene tendras "+edad+ " a�os");
	}

}

