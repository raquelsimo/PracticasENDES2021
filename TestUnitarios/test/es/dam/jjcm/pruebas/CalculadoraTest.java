package es.dam.jjcm.pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import es.dam.jjcm.pruebas.calculadora.Calculadora;

class CalculadoraTest {

	
	
	@Test
	void testSuma() {
	 // 	AAA
	 // Arrange- Organizar
		Calculadora calcu = new Calculadora(20,10);
    
	 // Act - Actuar
		int resultado = calcu.suma();
		
     // Assert - Confirmaci�n o comprobaci�n	
		assertEquals(30, resultado);
	}	
		

	@Test
	void testResta() {

		 // Arrange- Organizar
			Calculadora calcu = new Calculadora(20,10);
	    
		 // Act - Actuar
			int resultado = calcu.resta();
			
	     // Assert - Confirmaci�n o comprobaci�n	
			assertEquals(10, resultado);
	}

	@Test
	void testMultiplica() {
//	 	AAA
		 // Arrange- Organizar
			Calculadora calcu = new Calculadora(20,10);
	    
		 // Act - Actuar
			int resultado = calcu.multiplica();
			
	     // Assert - Confirmaci�n o comprobaci�n	
			assertEquals(200, resultado);
	}

	@Test
	void testDivide() {
//	 	AAA
		 // Arrange- Organizar
			Calculadora calcu = new Calculadora(20,10);
	    
		 // Act - Actuar
			int resultado = calcu.divide();
			
	     // Assert - Confirmaci�n o comprobaci�n	
			assertEquals(2, resultado);
	}

}
