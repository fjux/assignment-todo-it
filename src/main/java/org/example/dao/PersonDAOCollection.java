package org.example.dao;

import org.example.models.Person;

import java.util.List;

public class PersonDAOCollection implements PersonDAO{
    @Override
    public Person persist(Person person) {
        return null;
    }

    @Override
    public List<Person> findAll() {
        return null;
    }

    @Override
    public Person findById(int id) {
        return null;
    }

    @Override
    public Person findByEmail(String email) {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
