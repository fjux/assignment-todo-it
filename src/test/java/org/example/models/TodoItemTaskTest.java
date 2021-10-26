package org.example.models;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class TodoItemTaskTest {
    public static final int ID = 1;
    private Person testPerson;
    private TodoItem testItem;
    private TodoItemTask testObject;

    @Before
    public void setUp() {
        testPerson = new Person(ID, "Erik", "Alfredsson", "erik@erik.nu");
        testItem = new TodoItem(ID, "task", "do task", LocalDate.of(2021, 11, 01), testPerson);
        testObject = new TodoItemTask(ID, testItem, testPerson);
    }

    @Test
    public void testObject_successfully_instantiated() {
        assertEquals(ID, testObject.getId());
        assertEquals(testPerson, testObject.getAssignee());
        assertNotNull(testObject.getTodoItem());
        assertTrue(testObject.isAssigned());
    }

    @Test(expected = RuntimeException.class)
    public void constructor_throws_exception_on_null_testItem() {
        new TodoItemTask(ID, null, testPerson);
    }

    @Test
    public void test_getSummary(){
        assertNotNull(testObject.getSummary());
    }

}