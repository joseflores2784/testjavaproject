package com.valentinos.primerproyecto.usuario;

public class Profesor {

	private String 	materia;
	private String 	cargo;
	
	public Profesor() {
	}

	public Profesor(String materia, String cargo) {
		
		this.materia = materia;
		this.cargo = cargo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
		
}
