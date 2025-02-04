package tareasJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Prueba {
	
	Calcular c;
	
	@BeforeEach
	void setUp() throws Exception {
		c = new Calcular();
	}

	@Test
	void testCalcular() {
		Assertions.assertNotNull(c);
		c = null;
		Assertions.assertNull(c);
		c = new Calcular();
		Assertions.assertNotNull(c);
	}

	@Test
	void testSumar() {
		assertTrue(15 == c.sumar(7, 8));
		assertTrue(1 == c.sumar(-7, 8));
		assertTrue(-15 == c.sumar(-7, -8));
		assertTrue(7 == c.sumar(7, 0));
		assertTrue(c.sumar(7, 0) == c.sumar(0, 7));
		assertTrue(0 == c.sumar(0, 0));
	}

	@Test
	void testRestar() {
		assertTrue(-1 == c.restar(7, 8));
		assertTrue(-15 == c.restar(-7, 8));
		assertTrue(1 == c.restar(-7, -8));
		assertTrue(7 == c.restar(7, 0));
		assertFalse(c.restar(7, 0) == c.restar(0, 7));
		assertTrue(0 == c.restar(0, 0));

	}

	@Test
	void testMultiplicar() {
		assertTrue(56 == c.multiplicar(7, 8));
		assertTrue(-56 == c.multiplicar(-7, 8));
		assertTrue(56 == c.multiplicar(-7, -8));
		assertTrue(0 == c.multiplicar(7, 0));
		assertTrue(c.multiplicar(7, 0) == c.multiplicar(0, 7));
		assertTrue(0 == c.multiplicar(0, 0));

	}

	@Test
	void testDividir() {
		assertTrue(0.875 == c.dividir(7, 8));
		assertTrue(-0.875 == c.dividir(-7, 8));
		assertTrue(0.875 == c.dividir(-7, -8));
		try {
			c.dividir(7, 0);
			fail("Deber�a haber lanzado una excepci�n");
		} catch (ArithmeticException e) {
			assertEquals("No est� permitida la divisi�n por cero", e.getMessage());
		}
	}

	@Test
	void testIsPrimo() {
		assertTrue(c.isPrimo(7));
		assertFalse(c.isPrimo(6));
		assertTrue(c.isPrimo(2));
		assertFalse(c.isPrimo(1));
	}

}
