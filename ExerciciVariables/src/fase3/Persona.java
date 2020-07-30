package fase3;


public class Persona {
	
	int anioNacimiento;
	VisorAniosBisiestos visor;
	
	
	public Persona(int anioNacimiento, VisorAniosBisiestos visor) {
		this.anioNacimiento = anioNacimiento;
		this.visor=visor;
	}
	
	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}
	
	public void printInfoAnioNacimiento (VisorAniosBisiestos visor) {
		String bisiesto_ok = "Mi año de nacimiento SI es bisiesto";
		String bisiesto_ko = "Mi año de nacimiento NO es bisiesto";
		
		System.out.println("-------------------------------------------------");
		if(visor.esBisiesto(getAnioNacimiento())) {
			System.out.println(bisiesto_ok);
		}
		else {
			System.out.println(bisiesto_ko);
		}
		System.out.println("-------------------------------------------------");
	}
}
