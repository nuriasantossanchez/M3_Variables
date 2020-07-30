package fase1;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Calendario {
	
	int dia;
	int mes;
	int anio;
	
	public Calendario() {
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		this.dia  = localDate.getDayOfMonth();
		this.mes = localDate.getMonthValue();
		this.anio   = localDate.getYear();
	}
	
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAnio() {
		return anio;
	}
	
	public String printFechaActual() {
		return getDia()+"/"+getMes()+"/"+getAnio();
	}

}
