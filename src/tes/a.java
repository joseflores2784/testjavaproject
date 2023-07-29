package tes;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("digite el valor de a");
		float a= s.nextFloat();
		
		System.out.println("digite el valor de b");
		float b= s.nextFloat();
		
		System.out.println("digite el valor de c");
		float c= s.nextFloat();
		
		System.out.println("digite la altura");
		float altura= s.nextFloat();
		
		
		
		if (a==b && b==c) {
			
			System.out.println("es un triangulo equilatero");
			
			float cosA=((a*a)-(b*b)-(c*c))/(-2*b*c);
			double anguloA= Math.acos(cosA);
			System.out.println("El angulo de A es "+anguloA);
			
			float cosB=((b*b)-(a*a)-(c*c))/(-2*a*c);
			double anguloB= Math.acos(cosB);
			System.out.println("El angulo de B es"+anguloB);
			
			float cosC= ((c*c)-(a*a)-(b*b))/(-2*a*b);
			double anguloC= Math.acos(cosC);
			System.out.println("El angulo de C es"+anguloC);
			
		} else if (a==b || a==c || b==c) {
			
			System.out.println("es un triangulo isosceles");
			
			float cosA=((a*a)-(b*b)-(c*c))/(-2*b*c);
			double anguloA= Math.acos(cosA);
			System.out.println("El angulo de A es "+anguloA);
			
			float cosB=((b*b)-(a*a)-(c*c))/(-2*a*c);
			double anguloB= Math.acos(cosB);
			System.out.println("El angulo de B es"+anguloB);
			
			float cosC= ((c*c)-(a*a)-(b*b))/(-2*a*b);
			double anguloC= Math.acos(cosC);
			System.out.println("El angulo de C es"+anguloC);
			
		} else if (a!=b && b!=c) {
			
			System.out.println("es un triangulo escaleno");
			
			float cosA=((a*a)-(b*b)-(c*c))/(-2*b*c);
			double anguloA= Math.acos(cosA);
			System.out.println("El angulo de A es "+anguloA);
			
			float cosB=((b*b)-(a*a)-(c*c))/(-2*a*c);
			double anguloB= Math.acos(cosB);
			System.out.println("El angulo de B es"+anguloB);
			
			float cosC= ((c*c)-(a*a)-(b*b))/(-2*a*b);
			double anguloC= Math.acos(cosC);
			System.out.println("El angulo de C es"+anguloC);
			
		}
		
		double p= a+b+c;	
		double f= (p*(p-a)*(p-b)*(p-c));
		double area= Math.sqrt(f);
		System.out.println("El area del trinagulo es "+area);
	}
	
	
}
