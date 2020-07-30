package fase4;

public class ComprobadorAniosBisiestos {
	
	int distanciaEntreBisiestos=4;
	
	public ComprobadorAniosBisiestos() {
	}


	public int getDistanciaEntreBisiestos() {
		return distanciaEntreBisiestos;
	}

	public void setDistanciaEntreBisiestos(int distanciaEntreBisiestos) {
		this.distanciaEntreBisiestos = distanciaEntreBisiestos;
	}
	
	public boolean esBisiesto(int anio) {
		boolean esBisiesto = true;
		int divisiblePor4=anio%getDistanciaEntreBisiestos();
		if (divisiblePor4 != 0) {
			esBisiesto = false;
		}
		return esBisiesto;
	}
	
}
