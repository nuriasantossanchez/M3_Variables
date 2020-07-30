package fase3;

public class VisorAniosBisiestos {
	
	int anioBisiesto;
	int distanciaEntreBisiestos=4;
	
	public VisorAniosBisiestos(int anio) {
		this.anioBisiesto = anio;
	}

	public int getAnioBisiesto() {
		return anioBisiesto;
	}

	public void setAnioBisiesto(int anioBisiesto) {
		this.anioBisiesto = anioBisiesto;
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
	
	public int dameBisietoMasCercano(int anio) {
		for (int i=1; i<=getDistanciaEntreBisiestos();i++) {
			if (!esBisiesto(anio)) {
				anio = anio+i;
			}
			else {
				break;
			}
		}
		return anio;
	}
	
	public int dameAnioMayorEnRango(int anioReferenciaInicio, int anioFin) {
		int varTemp=anioFin;
		if(anioFin < anioReferenciaInicio) {
			varTemp=Math.max(anioReferenciaInicio,anioFin);
		}
		return varTemp;
	}
	
	public int validaDatosEntrada(int anioReferenciaInicio, int anioFin) {
		
		int checkedAnio = 0;
		int anioMayor = dameAnioMayorEnRango(anioReferenciaInicio, anioFin);
		if (anioMayor != anioFin) {
			if (!esBisiesto(anioFin)) {
				checkedAnio=dameBisietoMasCercano(anioFin);
			}
			else {
				checkedAnio=anioFin;
			}
		}
		return checkedAnio;
	}
	
	public void printRangoBisiestos(int anioReferenciaInicio, int anioFin) {
		printCabecera(anioReferenciaInicio, anioFin);
		
		int checkedAnio=validaDatosEntrada(anioReferenciaInicio,anioFin);
		if (checkedAnio!=0) {
			anioFin=anioReferenciaInicio;
			anioReferenciaInicio = checkedAnio;
		}
		
		for (int i = anioReferenciaInicio; i <= anioFin; i+=getDistanciaEntreBisiestos()) {
			System.out.println(i);
		}
	}
	
	public void printCabecera (int anioReferenciaInicio, int anioFin) {
		System.out.println("-------------------------------------------------");
		System.out.println("Años bisiestos entre: " + anioReferenciaInicio + " y " + anioFin);
		System.out.println("-------------------------------------------------");
	}
	
}
