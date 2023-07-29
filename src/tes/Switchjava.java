
	package tes;

	import javax.swing.JOptionPane;

	public class Switchjava  {

		
		public static void main(String[] args) {
			
			JOptionPane.showMessageDialog(null, "hola como esta la vuelta socio");
		
			int dia = Integer.parseInt(JOptionPane.showInputDialog("hola ingrese un valor"));
			
			switch (dia) {
			
			
			case 1: 
				JOptionPane.showMessageDialog(null, "lunes");
				break;
				
			case 2: 	
				JOptionPane.showMessageDialog(null, "martes");
				break;
			
			default:
				JOptionPane.showMessageDialog(null, "no ha elegido un valor adecuado");
			
			}
		}	
	

	}
