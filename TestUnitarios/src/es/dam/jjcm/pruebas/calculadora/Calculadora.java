package es.dam.jjcm.pruebas.calculadora;

public class Calculadora {

	private int num1;
	private int num2;
	
	public Calculadora(int a, int b) {
		this.num1 = a;
		this.num2 = b;
	}
	
	public int suma() {
		int resultado=num1+num2;
		return resultado;
	}
	
	public int resta() {
		int resultado=num1-num2;
		return resultado;
	}
	
	public int multiplica() {
		int resultado=num1*num2;
		return resultado;
	}
	
	public int divide() {
		int resultado=num1/num2;
		return resultado;
	}
}
