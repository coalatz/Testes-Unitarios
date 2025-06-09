package br.coala.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
class DemoRepeatedTest {
	
	SimpleMath math;
	
	

	@BeforeEach
	void beforeEachMethod() {
		math = new SimpleMath();
		System.out.println("beforeeach ");
	}
	
	@RepeatedTest(value = 3, name = "{displayName}. Repetition {currentRepetition}{totalRepetitions}!")
	@DisplayName("test 5 / 0 = exception")
	void testDivZero(RepetitionInfo repetitionInfo, TestInfo testInfo) {
		
		System.out.println(repetitionInfo.getCurrentRepetition() + " " + repetitionInfo.getTotalRepetitions());
		System.out.println(testInfo);
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

}
