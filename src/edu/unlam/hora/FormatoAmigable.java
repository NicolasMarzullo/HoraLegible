package edu.unlam.hora;

public class FormatoAmigable {
	public static final int SEG_DE_UN_AÑO = 31536000;
	public static final int SEG_DE_UN_DIA = 86400;
	public static final int SEG_DE_UNA_HORA = 3600;
	public static final int SEG_DE_UN_MINUTO = 60;

	public static String duracion(int seg) {
		int años, resto, dias, horas, minutos, segundos, cantComponentes = 0, ultComponente = -1;
		String retorno = "";
		int[] componentes = new int[5];

		if (seg < 0)
			return "Error";
		if (seg == 0)
			return "Ahora";

		años = seg / SEG_DE_UN_AÑO;
		resto = seg % SEG_DE_UN_AÑO;
		dias = resto / SEG_DE_UN_DIA;
		resto = resto % SEG_DE_UN_DIA;
		horas = resto / SEG_DE_UNA_HORA;
		resto = resto % SEG_DE_UNA_HORA;
		minutos = resto / SEG_DE_UN_MINUTO;
		segundos = resto % SEG_DE_UN_MINUTO;

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

		/*
		 * Verifico cual es el ultimo componente, pues necesito saber donde poner el
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
				switch (i) {
				case 0:
					if (componentes[i] == 1)
						retorno += años + " año";
					else
						retorno += años + " años";
					break;

				case 1:
					if (!retorno.equals(""))
						if (ultComponente == 1)
							retorno += " y ";
						else
							retorno += ", ";

					if (componentes[i] == 1)
						retorno += dias + " día";
					else
						retorno += dias + " días";

					break;

				case 2:
					if (!retorno.equals(""))
						if (ultComponente == 2)
							retorno += " y ";
						else
							retorno += ", ";

					if (componentes[i] == 1)
						retorno += horas + " hora";
					else
						retorno += horas + " horas";
					break;
				case 3:
					if (!retorno.equals(""))
						if (ultComponente == 3)
							retorno += " y ";
						else
							retorno += ", ";

					if (componentes[i] == 1)
						retorno += minutos + " minuto";
					else
						retorno += minutos + " minutos";
					break;
				case 4:
					if (!retorno.equals(""))
						if (ultComponente == 4)
							retorno += " y ";
						else
							retorno += ", ";

					if (componentes[i] == 1)
						retorno += segundos + " segundo";
					else
						retorno += segundos + " segundos";
					break;

				}

			}

		}
		return retorno;
	}

}
