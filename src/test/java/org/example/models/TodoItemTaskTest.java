package org.example.models;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class TodoItemTaskTest {
    private Person testPerson;
    private TodoItemTask testObject;

    @Before
    public void setUp() {
       testPerson = new Person("Erik", "Alfredsson", "erik@erik.nu");
        TodoItem testItem = new TodoItem("task", "do task", LocalDate.of(2021, 11, 1), testPerson);
        testObject = new TodoItemTask(testItem, testPerson);
    }

    @Test
    public void testObject_successfully_instantiated() {
        assertEquals(testPerson, testObject.getAssignee());
        assertNotNull(testObject.getTodoItem());
        assertTrue(testObject.isAssigned());
    }

    @Test(expected = RuntimeException.class)
    public void constructor_throws_exception_on_null_testItem() {
        new TodoItemTask(null, testPerson);
    }

   // @Test
    //public void test_getSummary(){
      //  assertNotNull(testObject.getSummary());
    //}

}