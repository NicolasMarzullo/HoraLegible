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
		Assert.assertEquals("3 años, 39 días, 15 horas, 10 minutos y 53 segundos", Formato.FormatoAmigable(98032253));
	}

	@Test
	public void testAñoUnicamente() {
		System.out.println(Formato.FormatoAmigable(31536000));
		Assert.assertEquals("1 año", Formato.FormatoAmigable(31536000));
	}

	@Test
	public void testAñosUnicamente() {
		System.out.println(Formato.FormatoAmigable(63072000));
		Assert.assertEquals("2 años", Formato.FormatoAmigable(63072000));
	}

	@Test
	public void testAñoYDia() {
		System.out.println(Formato.FormatoAmigable(31622400));
		Assert.assertEquals("1 año y 1 día", Formato.FormatoAmigable(31622400));
	}

	@Test
	public void testAñosYDia() {
		System.out.println(Formato.FormatoAmigable(94694400));
		Assert.assertEquals("3 años y 1 día", Formato.FormatoAmigable(94694400));
	}

	@Test
	public void testAñosYDias() {
		System.out.println(Formato.FormatoAmigable(94867200));
		Assert.assertEquals("3 años y 3 días", Formato.FormatoAmigable(94867200));
	}
}
