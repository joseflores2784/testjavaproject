package tes;

public class test4 {

	public static void main(String[] args) {
		
		int paso= 1000;
		boolean estaCansado= false;
		String resultado= "100";
		
		int edad= 20;
		
		if(edad<18) { // 15 es menor que 18?
			
			System.out.println("no puede ingresar a la pagina porque es menor de edad ");
			
		} else {
		
			System.out.println("bienvenido a la pagina ");
			
		}
		
		String resultadoSuma = realizarSuma(9998, 1); 
		System.out.println(resultadoSuma);
		
		String resultadoResta = realizarResta(100, 70);
		System.out.println(resultadoResta);
		
		String resultadoMultiplicar = realizarMultiplicar(1000, 10);
		System.out.println(resultadoMultiplicar);
		
		String resultadoDividir = realizarDividir(200, 3);
		System.out.println(resultadoDividir);
		
		String resultadoModulo= realizarModulo(200, 3);
		System.out.println(resultadoModulo);
			
	}
	
	public static String realizarSuma(int num1, int num2) {
		int suma= num1+num2;
		String y= "";
		if (suma<10000) {
			 y= "el resultado de la suma es: "+suma;
		} else {
			y= "la suma no se imprime porque dio un resultado mayor a 10000";
		}
	
		
		return y;
		
		}
	 
	public static String realizarResta(int num3, int num4) {
		int resta= num3-num4;
		String x= "";
		if (resta<100) {
			x="el resultado de la resta es:"+resta;
			
		} else {
			x="la resta no se imprime porque dio un resultado mayor a 100";
		}
		return x;
	}
	
	public static String  realizarMultiplicar(int num5, int num6) {
		int multiplicar= num5*num6;
		String z="";
			if (multiplicar<5000) {
				z="el resultado de la multiplicacion es:"+multiplicar;
			}	else {
				z="la multiplicacion no se imprime porque dio un resultado mayor a 5000";
			}
		return z;
		
	}
	public static String realizarDividir(int num7, int num8) {
		int dividir= num7/num8;
		String s="";
			if (dividir<70) {
				s="el resultado de la divicion es: "+dividir;
			}	else {
				s="la divicion no se imprime porque dio un resultado mayor a 70";
			}
		return s;
	}
	
	public static String realizarModulo(int num9, int num10) {
		int modulo= num9%num10;
		String o="";
			if (modulo<1){
				o="el resultado del sobrante de la divicion es:"+modulo;
			}	else {
				o="el sobrante de la divicion no se imprime porque dio un resultado mayor a 1";
			}
				
		return o;
	}


	

}

