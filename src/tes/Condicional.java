package tes;

public class Condicional {

	public static void main(String[] args) {
		int edad= 8;
		int otraEdad= 16;
		if(edad==otraEdad) { // Entonces
			System.out.println("la primera variable es igual a la segunda ");
		} else { // Si no
			System.out.println("la primera variable es diferente a la segunda ");
		}
		
		if(edad!=otraEdad) { // Entonces
			System.out.println("la primera variable es diferente a la segunda");
		} else { // Si no
			System.out.println("la primera variable es igual a la segunda ");
		}
		
		if(edad>otraEdad) { // Entonces
			System.out.println("la primera variable no es mayor a la segunda");
		} else { // Si no
			System.out.println("la primera variable es mayor a la segunda ");
		}
		if(edad<otraEdad) { // Entonces
			System.out.println("la primera variable es menor a la segunda");
		} else { // Si no
			System.out.println("la primera variable no es menor que la segunda ");
		}
		if(edad>=otraEdad) { // Entonces
			System.out.println("la primera variable es mayor o igual a la segunda");
		} else { // Si no
			System.out.println("la primera variable no es mayor ni igual a la segunda ");
		}
		if(edad<=otraEdad) { // Entonces
			System.out.println("la primera variable es menor o igual a la segunda");
		} else { // Si no
			System.out.println("la primera variable no es menor ni igual que la segunda ");
		}
	}
	
	
	
	
	/*
	 
	 Condicionales
	 == Permite preguntar si una variable es igual a otra (equals para String)
	 != Permite preguntar si una variable es diferente de otra
	 > Permite preguntar si una variable es mayor que otra
	 < Permite preguntar si una variable es menor que otra
	 >= Permite preguntar si una variable es mayor o igual que otra
	 <= Permite preguntar si una variable es menor o igual que otra
	 */
}
