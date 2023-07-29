package tes;

import java.util.Scanner;


public class claseScanner {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int n;
		
		System.out.println("Ingrese el valor de tipo entero:");
			
		
		n = sc.nextInt();
	
		
		System.out.println("El valor ingresado es: "+ n);
		
		System.out.println("Ingrese el valor de tipo double:");
	
		double a;
		
		a = sc.nextDouble();
		
		System.out.println("El valor ingresado es: "+ a);
		
	
	
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese su nombre");
		
		String nombre = entrada.nextLine();
		
		
		System.out.println("el usuario ingreso: "+ nombre);
	
	}
	
	
	
	
	
}
