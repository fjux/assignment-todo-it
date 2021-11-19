package org.example.dao;

import org.example.models.Person;

import java.util.List;

public class PersonDAOCollection implements PersonDAO{

    private List<Person> persons;

    public PersonDAOCollection(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public Person persist(Person person) {
        persons.add(person);
        return person;
    }

    @Override
    public List<Person> findAll() {
        return persons;
    }

    @Override
    public Person findById(int id) {
        for (Person person : persons)
            if (person.getId() == id) {
                return person;
            }
        throw new RuntimeException("Could not find a person with id" + id);
    }

    @Override
    public Person findByEmail(String email) {
        for (Person person : persons)
            if (person.getEmail().equals(email)) {
                return person;
            }
        throw new RuntimeException("Could not find a person with email" + email);
    }

    @Override
    public void remove(int id) {
        persons.removeIf(person -> person.getId() == id);
    }

    }

