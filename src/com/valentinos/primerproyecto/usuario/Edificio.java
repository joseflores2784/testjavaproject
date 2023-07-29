package com.valentinos.primerproyecto.usuario;

public class Edificio {

	private	String	nombre;
	private	int		numPisos;
	private	int		estrato;
	private boolean	esConElevador;
	private  Administrador admin;
	private  Estudiante std;

	public Edificio() {	
	}

	public Edificio(String nombre, int numPisos, int estrato, boolean esConElevador, Administrador admin, Estudiante estudiante) {
		this.nombre = nombre;
		this.numPisos = numPisos;
		this.estrato = estrato;
		this.esConElevador = esConElevador;
		this.admin = admin;
		this.std = estudiante; 
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumPisos() {
		return numPisos;
	}

	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}

	public int getEstrato() {
		return estrato;
	}

	public void setEstrato(int estrato) {
		this.estrato = estrato;
	}

	public boolean isEsConElevador() {
		return esConElevador;
	}

	public void setEsConElevador(boolean esConElevador) {
		this.esConElevador = esConElevador;
	}

	public Administrador getAdmin() {
		return admin;
	}

	public void setAdmin(Administrador admin) {
		this.admin = admin;
	}

	public Estudiante getStd() {
		return std;
	}

	public void setStd(Estudiante std) {
		this.std = std;
	}	 
	
	
}
 

