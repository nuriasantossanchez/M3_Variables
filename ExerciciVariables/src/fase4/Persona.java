package fase4;

public class Persona {
	
	String nombreApellidos;
	String fechaNacimiento_ddmmyyyy;
	ComprobadorAniosBisiestos comprobador = new ComprobadorAniosBisiestos();
	
	
	public Persona(String nombreApellidos, String fechaNacimiento) {
		this.nombreApellidos = nombreApellidos;
		this.fechaNacimiento_ddmmyyyy = fechaNacimiento;
	}

	public String getNombreApellidos() {
		return nombreApellidos;
	}

	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}

	public String getFechaNacimiento_ddmmyyyy() {
		return fechaNacimiento_ddmmyyyy;
	}

	public void setFechaNacimiento_ddmmyyyy(String fechaNacimiento_ddmmyyyy) {
		this.fechaNacimiento_ddmmyyyy = fechaNacimiento_ddmmyyyy;
	}
	
	public int getFormatterAnio(String fechaNacimiento_ddmmyyyy) {
		int lasIndex = fechaNacimiento_ddmmyyyy.lastIndexOf("/")+1;
		String anioNacimiento = fechaNacimiento_ddmmyyyy.substring(lasIndex, fechaNacimiento_ddmmyyyy.length());
		return Integer.parseInt(anioNacimiento);
	}
	
	public String printInfoPersona () {
		
		String bisiesto_ok = "\nMi año de nacimiento es bisiesto";
		String bisiesto_ko = "\nMi año de nacimiento no es bisiesto";
		
		String cadenaDatosPersonales = "Mi nombre es " + getNombreApellidos() + "\nNací el " + getFechaNacimiento_ddmmyyyy();
		
		if(comprobador.esBisiesto(getFormatterAnio(this.getFechaNacimiento_ddmmyyyy()))) {
			cadenaDatosPersonales = cadenaDatosPersonales.concat(bisiesto_ok);
		}
		else {
			cadenaDatosPersonales = cadenaDatosPersonales.concat(bisiesto_ko);
		}
		
		return cadenaDatosPersonales;
	}
}
	
	
	