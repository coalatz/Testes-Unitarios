package br.coala.service;

import java.util.concurrent.atomic.AtomicLong;

import br.coala.model.Person;

public class PersonService implements IPersonService {

	@Override
	public Person createPerson(Person person) {
		if(person.getEmail() == null || person.getEmail().isBlank()) {
			throw new IllegalArgumentException("The email not null");
		}
		var id = new AtomicLong().incrementAndGet();
		person.setId(id);
		return person;
	}

}
