package fase1;

import javax.swing.JOptionPane;

public class Fase1App {

	public static void main(String[] args) {
		
		Persona p = new Persona("Nuria","Santos","Sanchez");
		Calendario hoy = new Calendario();
		
		JOptionPane.showMessageDialog(null, p.printDatosPersona(p) + "\n" + hoy.printFechaActual());

	}
}
