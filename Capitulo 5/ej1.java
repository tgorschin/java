package tp4;
import java.util.*;
public class ej1 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int repetir;
	
	System.out.println("Cuantas veces queres que repita el eco");
	repetir=sc.nextInt();;
	for (int i=0;i<repetir;i++) { eco();}
	}
	
	static void eco(){
		System.out.println("Eco . • •");
	}

}
