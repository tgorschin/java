import java.util.*;
public class ej1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int dia, mes, año, numsuerte;
		
		System.out.println("Ingresa tu fecha de nacimiento");
		System.out.println("Dia:");
		dia=sc.nextInt(); 
		System.out.println("Mes:");
		mes=sc.nextInt();
		System.out.println("Año:");
		año=sc.nextInt();
		
		numsuerte=dia+mes+año;
		int d=Integer.toString(numsuerte).length();
		int t=0;
		
		for (int i=0;i<d;i++){
			String num= String.valueOf(Integer.toString(numsuerte).charAt(i));
			t +=Integer.parseInt(num);
		}
		 
		System.out.println("Tu numero de la suerte es " +t );

}
}
