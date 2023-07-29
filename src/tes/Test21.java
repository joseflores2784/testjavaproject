package tes;

public class Test21 {
 
	public static void main(String[] args) {
		boolean esEnorme= true;
		int numeroNuevo= 24;
		float valorProducto= 2000.01f;
		long cantidadProductos= 7850000l;
		String mensaje= "estoy copiando bien las variables";
		boolean esBueno= true;
		
		
		if (numeroNuevo>8) {
			System.out.println("soy niño");
		
		}
		else {
			System.out.println("no soy niño");
		}
			
		
		if (valorProducto<2000) {
			System.out.println("soy barato porque valgo "+valorProducto);
		}
		else {
			System.out.println("estoy caro");
		}
		if (cantidadProductos==7850000) {
			double total= valorProducto*cantidadProductos; 
			if (total>1000000000) {
				System.out.println("tenemos bastantica plata");
			}else {
				System.out.println("no tenemos mucha plata");
			}
		}
		
		
		if (esBueno==true) {
			System.out.println("soy bueno porque tengo"+valorProducto+"millones");
		}
		if (esBueno) {
			System.out.println("soy bueno porque tengo"+valorProducto+"millones");
		}
		
		
		if (esBueno==false) {
			System.out.println("soy bueno porque tengo"+valorProducto+"millones");
		}
		if (!esBueno) {
			System.out.println("soy bueno porque tengo"+valorProducto+"millones");
		}
		
		String passWord= "manuel123";
		
		if ( passWord.equals("manuel12345") )		{
		 System.out.println("bienvenido al sistema");	
		}
		if ( !passWord.equals("manuel12345") )		{
			 System.out.println("No es bienvenido al sistema");	
		}
		
	} 
}
