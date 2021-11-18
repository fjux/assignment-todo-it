package org.example.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PersonTest {
    public static final int ID = 1;
    public static final String FIRST_NAME = "Erik";
    public static final String LAST_NAME = "Alfredsson";
    public static final String EMAIL = "erik@erik.nu";
    public static final AppUser APP_USER = new AppUser("erikalf", "12sre567yt", AppRole.ROLE_APP_USER);
    Person testObject;

    @Before
    public void setUp() {
        testObject = new Person(FIRST_NAME, LAST_NAME, EMAIL, APP_USER);
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
        new Person(null, LAST_NAME, EMAIL, APP_USER);
    }

    @Test(expected = RuntimeException.class)
    public void constructor_throws_exception_on_null_lastName(){
        new Person(FIRST_NAME, null, EMAIL, APP_USER);
    }

    @Test(expected = RuntimeException.class)
    public void constructor_throws_exception_on_null_email(){
        new Person(FIRST_NAME, LAST_NAME, null, APP_USER);
    }

    @Test
    public void test_toString(){
        assertNotNull(testObject.toString());
    }

}
