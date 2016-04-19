package ar.unlam.circulo;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {

	
	
	@Test
	public void crearUnCirculoConRadio2() {
		Circulo unCirculo = new Circulo (2.00);
		assertEquals (2.00, unCirculo.obtenerRadio(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Circulo unCirculo = new Circulo (3.7);
		assertEquals (3.7, unCirculo.obtenerRadio(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Circulo unCirculo = new Circulo (5.0);	
		assertEquals (5.0, unCirculo.obtenerRadio(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Circulo unCirculo = new Circulo (10.9);
		assertEquals (10.9, unCirculo.obtenerRadio(), 0.01);
	}
	
	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es615Punto73() {
		Circulo unCirculo = new Circulo (9.8);
		assertEquals (615.73, unCirculo.calcularArea(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio16Punto6Es865Punto67() {
		Circulo unCirculo = new Circulo (16.6);
		assertEquals (865.67, unCirculo.calcularPerimetro(), 0.01);
	}
	
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente método se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	
}
