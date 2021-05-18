package es.dam.jjcm.pruebas.calculadora;

public class Calculadora {

	private int numA;
	private int numB;
	
	public Calculadora(int a, int b) {
		this.numA = a;
		this.numB = b;
	}
	
	public int suma() {
		int resultado=numA+numB;
		return resultado;
	}
	
	public int resta() {
		int resultado=numA-numB;
		return resultado;
	}
	
	public int multiplica() {
		int resultado=numA*numB;
		return resultado;
	}
	
	public int divide() {
		int resultado=numA/numB;
		return resultado;
	}
}
