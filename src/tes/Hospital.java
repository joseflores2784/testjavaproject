package tes;

public class Hospital {
	
	private String 	nombre;
	private String 	dirrecion;
	private boolean aceptaPacienteConSisben;
	private int  numMaxPacientesPermitidos;
	
	public Hospital () {
	}
	
	public Hospital (String nombre, String dirrecion, boolean aceptaPacienteConSisben, int numMaxPacientesPermitidos){
	
		this.nombre = nombre;
		this.dirrecion = dirrecion;
		this.aceptaPacienteConSisben = aceptaPacienteConSisben;
		this.numMaxPacientesPermitidos = numMaxPacientesPermitidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirrecion() {
		return dirrecion;
	}

	public void setDirrecion(String dirrecion) {
		this.dirrecion = dirrecion;
	}

	public boolean isAceptaPacienteConSisben() {
		return aceptaPacienteConSisben;
	}

	public void setAceptaPacienteConSisben(boolean aceptaPacienteConSisben) {
		this.aceptaPacienteConSisben = aceptaPacienteConSisben;
	}

	public int getNumMaxPacientesPermitidos() {
		return numMaxPacientesPermitidos;
	}

	public void setNumMaxPacientesPermitidos(int numMaxPacientesPermitidos) {
		this.numMaxPacientesPermitidos = numMaxPacientesPermitidos;
	}

	}
