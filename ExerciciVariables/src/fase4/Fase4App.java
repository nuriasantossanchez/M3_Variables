package fase4;

import javax.swing.JOptionPane;

public class Fase4App {

	public static void main(String[] args) {
		
		String nombreApellidos = "Nuria Santos Sánchez";
		String fechaNacimiento_ddmmyyyy = "12/03/1979";
		
		Persona persona1 = new Persona(nombreApellidos, fechaNacimiento_ddmmyyyy);
		String cadena = persona1.printInfoPersona();
		
		JOptionPane.showMessageDialog(null, cadena);
		
	}
}
