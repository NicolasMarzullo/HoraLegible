package edu.unlam.hora;

public class Hora {
	
	public static String FormatoAmigable(int seg) {
		int años;
		int dias;
		int horas;
		int minutos;
		int segundos;
		
		if(seg < 0)
			return "Error";
		if(seg == 0)
			return "Ahora";
		
		segundos = seg % 60;
		minutos = seg /= 60;
		
		
		return "ff";
	}

}
