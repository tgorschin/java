package practico;
import java.util.*;
public class ej12 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int horas,minutos,segundos;
		
		System.out.println("La hora actual");
		System.out.println("Horas:");
		horas=sc.nextInt();

		System.out.println("Minutos");
		minutos=sc.nextInt();
		
		System.out.println("Segundos");
		segundos=sc.nextInt();
		
		segundos=segundos+1;
		
		
		if(horas>24 || minutos>60 || segundos>60) {
			System.out.println("Ingresaste mal los datos");
		}else {
		if(horas==24 && segundos==60) {
			System.out.println("No existe una hora 25");
			}else{
				if(minutos==59 && segundos==60){
					horas=horas+1;
					minutos=0; segundos=0;
					System.out.println("La hora actual es "+horas+"hs "+minutos+"min "+segundos+"seg");
				}else {
					if(segundos>60){
					minutos=minutos+1;
					System.out.println("La hora actual es "+horas+"hs "+minutos+"min "+segundos+"seg");
				}}}}}}
