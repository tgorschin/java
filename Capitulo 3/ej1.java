package chiramberro;
import java.util.*;
public class ej12 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
int num,cuadrado;

do {

 System.out.println("Ingrese Numero");
 num=sc.nextInt();

 if (num%2==0) {
	 System.out.println("Es par");
 }else {
	 System.out.println("No es par");}

  if (num>0) {
	System.out.println("Es positivo");
  }else {
		 System.out.println("Es negativo");
  }

  cuadrado=num*num;
  System.out.println("Cuadrado: "+ cuadrado);

}while(num!=0);

	}}
