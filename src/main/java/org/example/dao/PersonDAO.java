package org.example.dao;

import org.example.models.AppUser;
import org.example.models.Person;

import java.util.List;

public interface PersonDAO {

    Person persist(Person person);
    List<Person> findAll();
    Person findById(int id);
    Person findByEmail(String email);
    void remove(int id);
}
