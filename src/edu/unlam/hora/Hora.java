package edu.unlam.hora;

import java.util.ArrayList;
import java.util.List;

public class Hora {

	public static String FormatoAmigable(int seg) {
		int años, restoAños, dias, restoDias, horas, restoHoras, minutos, segundos, cantComponentes =0, ultComponente = -1;
		String retorno = "";
		int[] componentes = new int[5];

		if (seg < 0)
			return "Error";
		if (seg == 0)
			return "Ahora";

		años = seg / 31536000;
		restoAños = seg % 31536000; // segundos que tiene 1 año
		dias = restoAños / 86400; // segundos que tiene un 1 dia
		restoDias = restoAños % 86400;
		horas = restoDias / 3600;
		restoHoras = restoDias % 3600;
		minutos = restoHoras / 60;
		segundos = restoHoras % 60;

		// agrego un 1 si va en singular, un 2 si va va en plural.
		// La posición 0 corresponde a los años, la 1 a los días y asi sucesivamente
		if (años == 1)
			componentes[0] = 1;
		if (años > 1)
			componentes[0] = 2;
		if (dias == 1)
			componentes[1] = 1;
		if (dias > 1)
			componentes[1] = 2;
		if (horas == 1)
			componentes[2] = 1;
		if (horas > 1)
			componentes[2] = 2;
		if (minutos == 1)
			componentes[3] = 1;
		if (minutos > 1)
			componentes[3] = 2;
		if (segundos == 1)
			componentes[4] = 1;
		if (segundos > 1)
			componentes[4] = 2;

		/* Verifico cual es el ultimo componente, pues necesito saber donde poner el
		 * "y". Aparte cuento cuantos componentes hay.
		 */
		
		for (int i = 0; i < componentes.length; i++) {
			if (componentes[i] != 0) {
				ultComponente = i;
				cantComponentes++;
			}
		}

		
		for (int i = 0; i < componentes.length; i++) {
			if (componentes[i] != 0) {

				if (i == 0) { //años
					if(componentes[i] ==1)
						retorno += años + " año";
					else
						retorno += años + " años";
				}
				else if (i == 1) { //dias

					if(!retorno.equals(""))
						if(ultComponente == 1)
							retorno += " y ";
						else
							retorno += ", ";
						
					if(componentes[i]==1)
						retorno += dias + " día";
					else
						retorno += dias + " días";
				}
				else if (i == 2) { //horas
					
					if(!retorno.equals(""))
						if(ultComponente == 2)
							retorno += " y ";
						else
							retorno += ", ";
					
					if(componentes[i]==1)
						retorno += horas + " hora";
					else
						retorno += horas + " horas";
				}

				else if (i == 3) { //minutos
					
					if(!retorno.equals(""))
						if(ultComponente == 3)
							retorno += " y ";
						else
							retorno += ", ";
						
					if(componentes[i]==1)
						retorno += minutos + " minuto";
					else
						retorno += minutos + " minutos";

				} else { //segundos
					
					if(!retorno.equals(""))
						if(ultComponente == 4)
							retorno += " y ";
						else
							retorno += ", ";
						
					if(componentes[i]==1)
						retorno += segundos + " segundo";
					else
						retorno += segundos + " segundos";
				}
			}
			
		}
		return retorno;
	}

}
