package edu.unlam.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.hora.Formato;

public class pruebasFormatoAmigable {

	@Test
	public void testEnunciado() {
		System.out.println(Formato.FormatoAmigable(62));
		Assert.assertEquals("1 minuto y 2 segundos", Formato.FormatoAmigable(62));
	}

	@Test
	public void testEnunciado2() {
		System.out.println(Formato.FormatoAmigable(3662));
		Assert.assertEquals("1 hora, 1 minuto y 2 segundos", Formato.FormatoAmigable(3662));
	}

	@Test
	public void testTodosLoscomponentes0() {
		System.out.println(Formato.FormatoAmigable(98032253));
		Assert.assertEquals("3 a�os, 39 d�as, 15 horas, 10 minutos y 53 segundos", Formato.FormatoAmigable(98032253));
	}

	@Test
	public void testA�oUnicamente() {
		System.out.println(Formato.FormatoAmigable(31536000));
		Assert.assertEquals("1 a�o", Formato.FormatoAmigable(31536000));
	}

	@Test
	public void testA�osUnicamente() {
		System.out.println(Formato.FormatoAmigable(63072000));
		Assert.assertEquals("2 a�os", Formato.FormatoAmigable(63072000));
	}

	@Test
	public void testA�oYDia() {
		System.out.println(Formato.FormatoAmigable(31622400));
		Assert.assertEquals("1 a�o y 1 d�a", Formato.FormatoAmigable(31622400));
	}

	@Test
	public void testA�osYDia() {
		System.out.println(Formato.FormatoAmigable(94694400));
		Assert.assertEquals("3 a�os y 1 d�a", Formato.FormatoAmigable(94694400));
	}

	@Test
	public void testA�osYDias() {
		System.out.println(Formato.FormatoAmigable(94867200));
		Assert.assertEquals("3 a�os y 3 d�as", Formato.FormatoAmigable(94867200));
	}
}
