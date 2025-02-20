import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTeste {

	@Test
	public void testesoma10com9() {
		//Variavel com o valor esperado do teste
		int valorEsperado = 19;
		//Variavel para receber o valor real da simulação
		int valorReal ;
		
		//Execução do cálculo
		Calculadora calc = new Calculadora(10, 9);
		valorReal = calc.soma();
		
		//Validação do cálculo
		assertEquals(valorReal,valorEsperado);
	}
	
	@Test
	public void testesoma9com9() {
		int valorEsperado = 18;
		int valorReal ;
		
		Calculadora calc = new Calculadora(9, 9);
		valorReal = calc.soma();
		
		assertEquals(valorReal,valorEsperado);
	}
	
	@Test
	public void testesubtracao20com11() {
		int valorEsperado = 9;
		int valorReal;
		
		Calculadora calc = new Calculadora(20, 11);
		valorReal = calc.subtracao();
		
		assertEquals(valorReal, valorEsperado);
	}
	
	@Test
	public void testemultiplicacao50com10() {
		int valorEsperado = 500;
		int valorReal;
		
		Calculadora calc = new Calculadora(50, 10);
		valorReal = calc.multiplicacao();
		
		assertEquals(valorReal, valorEsperado);
	}
	
	@Test
	public void testedivisao3com2() {
		double valorEsperado = 1.5;
		double valorReal;
		
		Calculadora calc = new Calculadora(2, 3);
		valorReal = calc.divisao();
		
		assertEquals(valorReal, valorEsperado, 0.5);
	}

}
