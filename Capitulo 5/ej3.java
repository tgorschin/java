package tp4;
import java.util.*;
public class ej3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int preg, radio, altura;
		
		System.out.println("¿Queres averiguar Area o Volumen?");
		System.out.println("1. Area");
		System.out.println("2. Volumen");
		preg=sc.nextInt();

		System.out.println("Ingrese el Radio");
		radio=sc.nextInt();
		System.out.println("Ingrese la Altura");
		altura=sc.nextInt();
		
		switch(preg){
		case 1:
			System.out.println(MetodoArea(altura, radio));
			break;
		case 2:
			System.out.println(MetodoVolumen(altura, radio));
			break;}
	}
	
		public static int MetodoArea(int altura, int radio) {
			int area=(int) (2*Math.PI*radio*(altura+radio));
			System.out.println("El area es de ");
			return area;} 
		
		public static int MetodoVolumen(int altura, int radio) {
			int volumen=(int) (Math.PI*(radio*radio)*altura);
			System.out.println("El volumen es de ");
			return volumen;
		}
}
