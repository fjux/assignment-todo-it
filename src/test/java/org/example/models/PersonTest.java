package org.example.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    public static final int ID = 1;
    public static final String FIRST_NAME = "Erik";
    public static final String LAST_NAME = "Alfredsson";
    public static final String EMAIL = "erik@erik.nu";
    Person testObject;

    @Before
    public void setUp() {
        testObject = new Person(ID, FIRST_NAME, LAST_NAME, EMAIL);
    }

    @Test
    public void testObject_successfully_instantiated(){
            assertEquals(ID, testObject.getId());
            assertEquals(FIRST_NAME, testObject.getFirstName());
            assertEquals(LAST_NAME, testObject.getLastName());
            assertEquals(EMAIL, testObject.getEmail());
    }
    @Test(expected = RuntimeException.class)
    public void constructor_throws_exception_on_null_firstName(){
        new Person(ID, null, LAST_NAME, EMAIL);
    }

    @Test(expected = RuntimeException.class)
    public void constructor_throws_exception_on_null_lastName(){
        new Person(ID, FIRST_NAME, null, EMAIL);
    }

    @Test(expected = RuntimeException.class)
    public void constructor_throws_exception_on_null_email(){
        new Person(ID, FIRST_NAME, LAST_NAME, null);
    }
}
