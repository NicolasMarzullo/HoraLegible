package edu.unlam.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.hora.Hora;

public class pruebasHoraAmigable {

	@Test
	public void testEnunciado() {
		System.out.println(Hora.FormatoAmigable(62));
		Assert.assertEquals("1 minuto y 2 segundos", Hora.FormatoAmigable(62));
	}

	@Test
	public void testEnunciado2() {
		System.out.println(Hora.FormatoAmigable(3662));
		Assert.assertEquals("1 hora, 1 minuto y 2 segundos", Hora.FormatoAmigable(3662));
	}

	@Test
	public void testTodosLoscomponentes0() {
		System.out.println(Hora.FormatoAmigable(98032253));
		Assert.assertEquals("3 a�os, 39 d�as, 15 horas, 10 minutos y 53 segundos", Hora.FormatoAmigable(98032253));
	}

	@Test
	public void testA�oUnicamente() {
		System.out.println(Hora.FormatoAmigable(31536000));
		Assert.assertEquals("1 a�o", Hora.FormatoAmigable(31536000));
	}

	@Test
	public void testA�osUnicamente() {
		System.out.println(Hora.FormatoAmigable(63072000));
		Assert.assertEquals("2 a�os", Hora.FormatoAmigable(63072000));
	}

	@Test
	public void testA�oYDia() {
		System.out.println(Hora.FormatoAmigable(31622400));
		Assert.assertEquals("1 a�o y 1 d�a", Hora.FormatoAmigable(31622400));
	}

	@Test
	public void testA�osYDia() {
		System.out.println(Hora.FormatoAmigable(94694400));
		Assert.assertEquals("3 a�os y 1 d�a", Hora.FormatoAmigable(94694400));
	}

	@Test
	public void testA�osYDias() {
		System.out.println(Hora.FormatoAmigable(94867200));
		Assert.assertEquals("3 a�os y 3 d�as", Hora.FormatoAmigable(94867200));
	}
}
