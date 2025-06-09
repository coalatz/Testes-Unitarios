package br.coala;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@Order(5)
@TestMethodOrder(MethodOrderer.MethodName.class)
class MethodOrdererByNomeTest {

	@Test
	void testA() {
		System.out.println("teste a");
	}
	
	@Test
	void testB() {
		System.out.println("teste b");
	}
	
	@Test
	void testC() {
		System.out.println("teste c");
	}
	@Test
	void testD() {
		System.out.println("teste d");
	}

}
