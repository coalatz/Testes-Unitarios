package br.coala.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("test SimpleMath metodos")
class SimpleMathTest {

	SimpleMath math;

	@BeforeAll
	static void setup() {
		System.out.println("os testes estao iniciando");
	}

	@AfterAll
	static void cleanup() {
		System.out.println("os testes estao encerrando");
	}

	@BeforeEach
	void beforeEachMethod() {
		math = new SimpleMath();
		System.out.println("beforeeach ");
	}
	@AfterEach
	void afterEachMethod() {
		System.out.println("aftereach");
	}

	@Test
	@DisplayName("test 2 + 2 = 4")

	void testSum() {
		System.out.println("teste soma");
		// given

		double firstNumber = 2D;
		double expected = 4D;
		// when
		double actual = math.sum(firstNumber, firstNumber);
		// then
		Assertions.assertEquals(expected, actual, () -> "testSum() nao produziu o resultado esperado");
		Assertions.assertNotEquals(5D, actual);
		assertNotNull(actual);
	}

	@Test
	@DisplayName("test 5 - 2 = 3")
	void testSub() {
		System.out.println("teste subtraçao");
		// given

		double firstNumber = 5D;
		double secondNumber = 2D;
		double expected = 3D;
		// when
		double actual = math.subtraction(firstNumber, secondNumber);
		// then
		assertEquals(expected, actual, () -> "testSub() nao produziu resultado esperado");
	}

	@Test
	@DisplayName("test 5 * 2 = 10")
	void testMul() {
		System.out.println("teste multiplicaçao");
		// given

		double firstNumber = 5D;
		double secondNumber = 2D;
		double expected = 10D;
		// when
		double actual = math.multiplication(firstNumber, secondNumber);
		// then
		assertEquals(expected, actual, () -> "testMul() nao produziu resultado esperado");
	}

	@Test
	@DisplayName("test 5 / 2 = 2.5")
	void testDiv() {
		System.out.println("teste divisao");
		// then

		double firstNumber = 5D;
		double secondNumber = 2D;
		double expected = 2.5D;
		// when
		double actual = math.division(firstNumber, secondNumber);
		// then
		assertEquals(expected, actual, () -> "testDiv() nao produziu resultado esperado");
	}

	@Test
	@DisplayName("test 5 / 0 = exception")
	void testDivZero() {
		//given
		double firstNumber = 5D;
		double secondNumber = 0D;
		var expectedMessage = "impossivel dividir por zero";
		
		ArithmeticException actual = Assertions.assertThrows(ArithmeticException.class, () -> {
			//when & then
			math.division(firstNumber, secondNumber);
		}, () -> "Division by zero should throw an ArithmeticException");
		
		assertEquals(expectedMessage, actual.getMessage(), () -> "esperado exeception message");

	}

	@Test
	@DisplayName("test (5 + 2)/2 = 3.5")
	void testMed() {
		System.out.println("teste media");
		// given
		double firstNumber = 5D;
		double secondNumber = 2D;
		double expected = 3.5D;
		// when
		double actual = math.mean(firstNumber, secondNumber);
		// then
		assertEquals(expected, actual, () -> "testMea() nao produziu resultado esperado");
	}

	@Test
	@DisplayName("test raiz 25 = 5")
	void testSqr() {
		System.out.println("teste raiz");
		// given
		double firstNumber = 25D;
		double expected = 5D;
		// when
		double actual = math.squareRoot(firstNumber);
		// then
		assertEquals(expected, actual, () -> "testSqr() nao produziu resultado esperado");
	}

}
