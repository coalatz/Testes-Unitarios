package br.coala;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
//@Order(1)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MethodOrdererByOrderTest {

	@Test
	@Order(2)
	void testA() {
		System.out.println("teste a");
	}
	
	@Test
	@Order(3)
	void testB() {
		System.out.println("teste b");
	}
	
	@Test
	@Order(1)
	void testC() {
		System.out.println("teste c");
	}
	@Test
	@Order(4)
	void testD() {
		System.out.println("teste d");
	}

}
