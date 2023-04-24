package oppoi;
import java.util.Scanner;
public class ej12 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		int dia, mes, año;
		
		System.out.println("Introduce un dia");
		dia=sc.nextInt();
		System.out.println("Introduce un mes");
		mes=sc.nextInt();
		System.out.println("Introduce un año");
		año=sc.nextInt();

		if (dia==30 && mes==4 && mes==6 && mes==9 && mes==11){
		    mes=mes+1;
		    dia=1;}else {
		 
		if (dia==31 && mes==1 && mes==3 && mes==5 && mes==7 && mes==8 && mes==10){
			mes=mes+1;
			dia=1;}else {
		 
		if (dia==28 & mes==2) {
			mes=mes+1;
			dia=1;}else {
		 
		if (dia==31 && mes==12)
			año=año+1;
			dia=1; mes=1;
			} 
			
			}
			System.out.println("El dia siguiente es "+dia+"/"+mes+"/"+año);

	}}}
