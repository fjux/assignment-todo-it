package org.example.models;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {
    Person testObject;

    @Before
    public void setUp() throws Exception {
    testObject = new Person(1, "Erik", "Alfredsson", "erik@mail.com");

    }
    @Test
    public void test_getSummary(){

    }
}
