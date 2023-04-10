package Ejercicio;
import java.util.Scanner;
public class calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		
		int x;
		double c;
		
		System.out.println("Ingrese el valor de los grados Farenheit");
		x = tc.nextInt();
		
		c = (x - 32)/1.8;
		
		System.out.println("La conversion de: "+x+"F° a grados C° es igual a: "+c+"C°");
	}

}
