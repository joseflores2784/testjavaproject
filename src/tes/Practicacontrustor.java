package tes;

import com.valentinos.primerproyecto.usuario.Administrador;
import com.valentinos.primerproyecto.usuario.Edificio;
import com.valentinos.primerproyecto.usuario.Estudiante;
import com.valentinos.primerproyecto.usuario.Persona;
import com.valentinos.primerproyecto.usuario.Profesor;

public class Practicacontrustor {

	public static void main(String[] args) {
		String msg= "iniciando";
		int num= 70;
		
		
		Estudiante std = new Estudiante ("ingsistema", 5 );
		Estudiante std2 = new Estudiante();
		
		String nombreCarrera = std.getCarrera();
		System.out.println(nombreCarrera);
		std.setCarrera("ingmecanica");
		nombreCarrera = std.getCarrera();
		System.out.println(nombreCarrera);
		
		std2.setCarrera("derecho");
		System.out.println(std2.getCarrera());
		System.out.println(std.getCarrera());
		
		Administrador rm = new Administrador ("ramon");
		Administrador rm2 = new Administrador();
		
		Edificio ast = new Edificio (msg, 16, 4, true, rm, std);
		Edificio ast2 = new Edificio ();
		
		Estudiante igr = new Estudiante ("ingeniero", 5);
		Estudiante igr2 = new Estudiante();
			
		Persona jm = new Persona ("josemanuel", 21);
		Persona jm2 = new Persona();
		
		Profesor fsc = new Profesor ("fisica", "maestro");
		Profesor fsc2 = new Profesor();
	}
	
	
}
