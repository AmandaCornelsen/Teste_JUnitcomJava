public class Calculadora {

	private int num1, num2;
	private int soma = 0;
	private int subtracao = 0;
	private int multiplicacao = 1;
	private double divisao = 0;
	
	
	
	public Calculadora(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int soma() {
		soma = num1 + num2;
		return soma;
	}
	
	public int subtracao() {
			subtracao = num1 - num2;
		return subtracao;
	}
	
	public int multiplicacao() {
		multiplicacao = num1 * num2;
		return multiplicacao;
	}
	
	public double divisao() { 
		return (double)num2 / num1;
	}
	

	
}
