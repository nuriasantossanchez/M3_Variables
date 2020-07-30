package fase3;

public class Fase3App {
	
public static void main(String[] args) {
		int anioBisiesto = 1948;
		int anioNacimiento= 1979; 
		
		VisorAniosBisiestos visorBisiestos = new VisorAniosBisiestos(anioBisiesto);
		Persona persona1 = new Persona(anioNacimiento, visorBisiestos);
		
		visorBisiestos.printRangoBisiestos(visorBisiestos.getAnioBisiesto(), persona1.getAnioNacimiento());
		
		persona1.printInfoAnioNacimiento(visorBisiestos);
	}

}
