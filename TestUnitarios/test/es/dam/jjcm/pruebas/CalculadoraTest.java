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
		
     // Assert - Confirmación o comprobación	
		assertEquals(30, resultado);
	}	
		

	@Test
	void testResta() {

		 // Arrange- Organizar
			Calculadora calcu = new Calculadora(20,10);
	    
		 // Act - Actuar
			int resultado = calcu.resta();
			
	     // Assert - Confirmación o comprobación	
			assertEquals(10, resultado);
	}

	@Test
	void testMultiplica() {
//	 	AAA
		 // Arrange- Organizar
			Calculadora calcu = new Calculadora(20,10);
	    
		 // Act - Actuar
			int resultado = calcu.multiplica();
			
	     // Assert - Confirmación o comprobación	
			assertEquals(200, resultado);
	}

	@Test
	void testDivide() {
//	 	AAA
		 // Arrange- Organizar
			Calculadora calcu = new Calculadora(20,10);
	    
		 // Act - Actuar
			int resultado = calcu.divide();
			
	     // Assert - Confirmación o comprobación	
			assertEquals(2, resultado);
	}

}
