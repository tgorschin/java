import java.util.*;
public class ej1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double d,a,b,c,x1,x2;
		System.out.println("Ingrese tres coeficientes");
		System.out.println("A:");
		a = sc.nextInt();
		System.out.println("B:");
		b = sc.nextInt();
		System.out.println("C:");
		c = sc.nextInt();

	       d=((b*b)-4*a*c);
	       System.out.println("Resultado de la operacion "+d);
	if(d<0){
	           System.out.println("No tiene solución real");
	       }else{
	           x1=(-b+Math.sqrt(d)/(2*a));
	           x2=(-b-Math.sqrt(d)/(2*a));
	           System.out.println("Resultado"+x1);
	           System.out.println("Resultado"+x2);}
	}}
