package fase2;

public class ContadorAniosBisiestos {
	
	final int ANIO_BISIESTO_1948 = 1948;
	int distanciaEntreBisiestos=4;
	Persona p = new Persona();
	
	public ContadorAniosBisiestos() {
	}
	
	public int getDistanciaEntreBisiestos() {
		return distanciaEntreBisiestos;
	}

	public void setDistanciaEntreBisiestos(int distanciaEntreBisiestos) {
		this.distanciaEntreBisiestos = distanciaEntreBisiestos;
	}
	
	public int cuentaAniosBisiestos(int anio) {
		p.setAnioNacimiento(anio);
		int result= Math.abs((p.getAnioNacimiento()-this.ANIO_BISIESTO_1948)/getDistanciaEntreBisiestos())+1;
		return result;
		
	}
	
	public String printTotalAniosBisiestos (int anio) {
		int totalAniosBisiestos = cuentaAniosBisiestos(anio);
		String cadena = "A�o bisiesto de referencia: " + this.ANIO_BISIESTO_1948 + "\nA�o de nacimiento: " + p.getAnioNacimiento() + "\nTotal a�os bisiestos entre las fechas: " + totalAniosBisiestos;
		return cadena;
	}
}
