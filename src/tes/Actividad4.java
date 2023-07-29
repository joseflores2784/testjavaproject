package tes;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("digite la cantidad de alumnos");
		int n= s.nextInt();
		
		System.out.println("digite el nombre de la materia");
		String materia= s.next();
		
		switch (materia) {
		
		case "matematicas": 
			float sumaMat= 0;
			
			for (int i=0; i<n; i++) {
				
				System.out.println("digite la nota de matematicas del alumno"+ (i+1));
				float nota= s.nextFloat();
				
				sumaMat= sumaMat + nota;
			}
			
			double promNotaMat= sumaMat/n;
			System.out.println("el promedio de nota de los alumnos en matematicas es "+promNotaMat);
			break;
			
		case "español":
			float sumaEsp= 0;
			
			System.out.println();
			int j= 0;
			
			while (j<n) {
				System.out.println("digite la nota de español del alumno "+ (j+1));
				float nota= s.nextFloat();
			
				sumaEsp= sumaEsp + nota;
				j++;
			}
			
			double promNotaEsp= sumaEsp/j;
			System.out.println("el promedio de nota de los alumnos en español es "+promNotaEsp);
			break;
			
		case "ingles":
			float sumaIng= 0;
			
			System.out.println();
			int l= 0;
			
			do {
				System.out.println("digite la nota de ingles del alumno "+ (l+1));
				float nota= s.nextFloat();
				
				sumaIng= sumaIng + nota;
				l++;
		    }while (l<n); 
		    
		    double promNotaIng= sumaIng/l;
			System.out.println("el promedio de nota de los alumnos en ingles es "+promNotaIng);
			
			
			
		}
		
		
		
		
		
		
		
		
	}
		
	
}
	
	
	
	
	
	

