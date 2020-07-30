package fase2;

import javax.swing.JOptionPane;

public class Fase2App {

	public static void main(String[] args) {
		
		int anioNacimiento= 1979;
		
		Persona persona1 = new Persona(anioNacimiento);
		ContadorAniosBisiestos cuentaBisiestos = new ContadorAniosBisiestos();
		
		String cadena = cuentaBisiestos.printTotalAniosBisiestos(persona1.getAnioNacimiento());

		JOptionPane.showMessageDialog(null, cadena);
	}
}
