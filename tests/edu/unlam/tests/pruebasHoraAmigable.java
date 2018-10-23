package edu.unlam.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.hora.Hora;


public class pruebasHoraAmigable {

	@Test
	public void testEnunciado(){
	
		System.out.println(Hora.FormatoAmigable(62));
		Assert.assertEquals("1 minuto y 2 segundos", Hora.FormatoAmigable(62));
		
	}
}
