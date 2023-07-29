package tes;

public class Paciente {

		private int   numeroDeDocumento;
		private byte  edad;
		private int   sueldo;
		private float altura;
		private byte  peso;
		private boolean genero;
		
		public Paciente() {
			
		}
		
		public Paciente(int numeroDeDocumento, byte edad, int sueldo, float altura, byte peso, boolean genero) {
			
			this.numeroDeDocumento = numeroDeDocumento;
			this.edad = edad;
			this.sueldo = sueldo;
			this.altura = altura;
			this.peso = peso;
			this.genero = genero;
		}

		public int getNumeroDeDocumento() {
			return numeroDeDocumento;
		}

		public void setNumeroDeDocumento(int numeroDeDocumento) {
			this.numeroDeDocumento = numeroDeDocumento;
		}

		public byte getEdad() {
			return edad;
		}

		public void setEdad(byte edad) {
			this.edad = edad;
		}

		public int getSueldo() {
			return sueldo;
		}

		public void setSueldo(int sueldo) {
			this.sueldo = sueldo;
		}

		public float getAltura() {
			return altura;
		}

		public void setAltura(float altura) {
			this.altura = altura;
		}

		public byte getPeso() {
			return peso;
		}

		public void setPeso(byte peso) {
			this.peso = peso;
		}

		public boolean isGenero() {
			return genero;
		}

		public void setGenero(boolean genero) {
			this.genero = genero;
		}
}
