package br.coala.math;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

@Order(3)
@DisplayName("test SimpleMath metodos")
class SimpleMathTests4 {

	SimpleMath math;

	@BeforeEach
	void beforeEachMethod() {
		math = new SimpleMath();
		System.out.println("beforeeach ");
	}


	@DisplayName("test inputs double")
	@ParameterizedTest
	//@MethodSource("testDivInputParameters")
	//@MethodSource
	@CsvSource({
		"6.2D, 2D, 3.1D",
		"71D, 14D, 5.07D",
		"18.3D, 3.1D, 5.90D"
		
	})
//	@CsvSource({
//		"Pele, football",
//		"Senna, F1",
//		"Keith Moon, ''"
//	})
	void testDiv(double firstNumber, double secondNumber, double expected) {
		System.out.println("teste divisao");
		// then

		// when
		double actual = math.division(firstNumber, secondNumber);
		// then
		assertEquals(expected, actual, 2D, () -> "testDiv() nao produziu resultado esperado");
	}
	
	//public static Stream<Arguments> testDivInputParameters() {
	public static Stream<Arguments> testDiv() {
		return Stream.of(
				Arguments.of(6.2D, 2D, 3.1D),
				Arguments.of(71D, 14D, 5.07D),
				Arguments.of(18.3D, 3.1D, 5.90D)
				);
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
	@DisplayName("test value source")
	@ParameterizedTest
	@ValueSource(strings = {"coala, xebiu, caminha"})
	void testValueSource(String firsName) {
		System.out.println(firsName);
		assertNotNull(firsName);
	}

}
