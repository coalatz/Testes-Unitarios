package br.coala.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleMathTest {

	@Test
	void testSum() {
		SimpleMath math = new SimpleMath();
		
		double firstNumber = 2D;
		Double actual = math.sum(firstNumber, firstNumber);
		
		double expected = 4D;
		Assertions.assertEquals(expected, actual, 
				() -> "testSum() nao produziu o resultado esperado");
		Assertions.assertNotEquals(5D, actual);
		assertNotNull(actual);
	}
	
	@Test
	void testSub() {
		SimpleMath math = new SimpleMath();
		
		double firstNumber = 5D;
		double secondNumber = 2D;
		
		double actual = math.subtraction(firstNumber, secondNumber);
		
		double expected = 3D;
		
		assertEquals(expected, actual, () -> "testSub() nao produziu resultado esperado");
	}
	
	@Test
	void testMul() {
		SimpleMath math = new SimpleMath();
		
		double firstNumber = 5D;
		double secondNumber = 2D;
		
		double actual = math.multiplication(firstNumber, secondNumber);
		
		double expected = 10D;
		
		assertEquals(expected, actual, () -> "testMul() nao produziu resultado esperado");
	}
	
	@Test
	void testDiv() {
		SimpleMath math = new SimpleMath();
		
		double firstNumber = 5D;
		double secondNumber = 2D;
		
		double actual = math.division(firstNumber, secondNumber);
		
		double expected = 2.5D;
		
		assertEquals(expected, actual, () -> "testDiv() nao produziu resultado esperado");
	}
	
	@Test
	void testMea() {
		SimpleMath math = new SimpleMath();
		
		double firstNumber = 5D;
		double secondNumber = 2D;
		
		double actual = math.mean(firstNumber, secondNumber);
		
		double expected = 3.5D;
		
		assertEquals(expected, actual, () -> "testMea() nao produziu resultado esperado");
	}
	
	@Test
	void testSqr() {
		SimpleMath math = new SimpleMath();
		
		double firstNumber = 25D;
		
		double actual = math.squareRoot(firstNumber);
		
		double expected = 5D;
		
		assertEquals(expected, actual, () -> "testSqr() nao produziu resultado esperado");
	}

}
