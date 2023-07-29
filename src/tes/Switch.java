package tes;

import javax.swing.JOptionPane;

public class Switch {

	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "hola como esta la vuelta socio");
		
		String el = JOptionPane.showInputDialog("hola ingrese un valor");
	
		int dia = Integer.parseInt(el);
		
		switch (dia) {
		
		
		case 1: 
			JOptionPane.showMessageDialog(null, "lunes");
			break;
			
		case 2: 	
			JOptionPane.showMessageDialog(null, "martes");
			break;
			
		case 3:
			JOptionPane.showMessageDialog(null, "miercoles");
			break;
			
		case 4:
			JOptionPane.showMessageDialog(null, "jueves");
			break;
		
		case 5:
			JOptionPane.showMessageDialog(null, "viernes");
			break;
			
		case 6:
			JOptionPane.showMessageDialog(null, "sabado");
			break;
			
		case 7:
			JOptionPane.showMessageDialog(null, "domingo");
			break;
		
			
		default:
			JOptionPane.showMessageDialog(null, "no ha elegido un valor adecuado");
		
		}
	}	
}
