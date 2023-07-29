package com.valentinos.primerproyecto.usuario;

public class Estudiante {

	private String 	carrera;
	private int 	legajo;
		
	public Estudiante() {	
	}

	public Estudiante(String carrera, int legajo) {
		
		this.carrera = carrera;
		this.legajo = legajo;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}	
	
	
	
}
