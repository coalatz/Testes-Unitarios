package br.coala.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.coala.model.Person;
import br.coala.service.IPersonService;
import  br.coala.service.PersonService;

class PersonServiceTest {
	
	Person person;
	PersonService service;
	
	@BeforeEach
	void setup() {
		service = new PersonService();
		
		person =  new Person(
				"coala", "eduardo", "edugame330@gmail.com",
				"rua acula - BR", "masculino"
			);
	}

	@DisplayName("Quando criar uma pessoa deve retornar sucesso e retornar o obejto pessoa")
	@Test
	void testCreatePerson_whenSucess_ShouldReturnPersonObeject() {
		// Given / Arrange
		// When / Act
		
		Person actual = service.createPerson(person);
		// Then / Assert
		assertNotNull(actual, () -> "erro: Person return null");
//		assertEquals(person, actual, () -> "O expected: " + person +
//				" is different actual: " + actual);
		
	}
	@DisplayName("Verificar se Person contem firstName")
	@Test
	void testCreatePerson_whenSucessFirstName_ShouldDifferentNull() {
		// Given / Arrange
		// When /Act
		
		Person actual = service.createPerson(person);
		// Then / Assert
		assertNotNull(actual.getFirstName(), () -> "erro: Person return null");
		assertEquals(person.getFirstName(), actual.getFirstName(), () -> "The expected: " + person +
				" is different actual: " + actual);
		
	}
	
	@DisplayName("Verificar se Person contem email")
	@Test
	void testPerson_whenEmail_ShouldEmailNotNull() {
		// Given / Arrange
		// When / Act
		Person actual = service.createPerson(person);
		// Then / Assert
		assertNotNull(actual.getEmail());
		assertEquals(person, actual, () -> "The expected: " + person +
				" is different actual: " + actual);
	}
	
	@DisplayName("Verificar se Person contem endereco")
	@Test
	void testPerson_whenAddress_ShouldAddressNotNull() {
		// Given / Arrange
		// When / Act
		Person actual = service.createPerson(person);
		// Then / Assert
		assertNotNull(actual.getAddress());
		assertEquals(person, actual, () -> "The expected: " + person +
				" is different actual: " + actual);
	}
	
	@DisplayName("Verificar se Person contem genero")
	@Test
	void testPerson_whenGender_ShouldGenderNotNull() {
		// Given / Arrange
		// When / Act
		Person actual = service.createPerson(person);
		// Then / Assert
		assertNotNull(actual.getGender());
		assertEquals(person, actual, () -> "The expected: " + person +
				" is different actual: " + actual);
	}
	
	@DisplayName("Verificar se Person contem id")
	@Test
	void testPerson_whenId_ShouldIdNotNull() {
		// Given / Arrange
		// When / Act
		Person actual = service.createPerson(person);
		// Then / Assert
		assertNotNull(actual.getId());
	}
	
	
}
