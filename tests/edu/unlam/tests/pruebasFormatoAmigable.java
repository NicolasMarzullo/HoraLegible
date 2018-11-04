package edu.unlam.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.hora.FormatoAmigable;

public class pruebasFormatoAmigable {

	@Test
	public void testEnunciado() {
		System.out.println(FormatoAmigable.duracion(62));
		Assert.assertEquals("1 minuto y 2 segundos", FormatoAmigable.duracion(62));
	}

	@Test
	public void testEnunciado2() {
		System.out.println(FormatoAmigable.duracion(3662));
		Assert.assertEquals("1 hora, 1 minuto y 2 segundos", FormatoAmigable.duracion(3662));
	}

	@Test
	public void testTodosLoscomponentes0() {
		System.out.println(FormatoAmigable.duracion(98032253));
		Assert.assertEquals("3 años, 39 días, 15 horas, 10 minutos y 53 segundos", FormatoAmigable.duracion(98032253));
	}

	@Test
	public void testAñoUnicamente() {
		System.out.println(FormatoAmigable.duracion(31536000));
		Assert.assertEquals("1 año", FormatoAmigable.duracion(31536000));
	}

	@Test
	public void testAñosUnicamente() {
		System.out.println(FormatoAmigable.duracion(63072000));
		Assert.assertEquals("2 años", FormatoAmigable.duracion(63072000));
	}

	@Test
	public void testAñoYDia() {
		System.out.println(FormatoAmigable.duracion(31622400));
		Assert.assertEquals("1 año y 1 día", FormatoAmigable.duracion(31622400));
	}

	@Test
	public void testAñosYDia() {
		System.out.println(FormatoAmigable.duracion(94694400));
		Assert.assertEquals("3 años y 1 día", FormatoAmigable.duracion(94694400));
	}

	@Test
	public void testAñosYDias() {
		System.out.println(FormatoAmigable.duracion(94867200));
		Assert.assertEquals("3 años y 3 días", FormatoAmigable.duracion(94867200));
	}
	
	
}
