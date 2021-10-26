package org.example.models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;


public class TodoItemTest {
    public static final int ID = 1;
    public static final String TITLE = "Prepare for bed";
    public static final String TASK_DESCRIPTION = "Brush teeth, rinse face, take medicine";
    public static final LocalDate DEADLINE = LocalDate.of(2021, 11, 3);
    public static final boolean DONE = false;
    private Person testPerson;
    private TodoItem testObject;

    @Before
    public void setUp() {
        testPerson = new Person(1, "Erik", "Alfredsson", "erik@erik.nu");
        testObject = new TodoItem(ID, TITLE, TASK_DESCRIPTION, DEADLINE, testPerson);
    }

    @Test
    public void testObject_successfully_instantiated() {
        assertEquals(ID, testObject.getId());
        assertEquals(TITLE, testObject.getTitle());
        assertEquals(TASK_DESCRIPTION, testObject.getTaskDescription());
        assertEquals(DEADLINE, testObject.getDeadLine());
        assertEquals(DONE, testObject.isDone());
        assertNotNull(testObject.getCreator());
    }

    @Test(expected = RuntimeException.class)
    public void constructor_throws_exception_on_null_title() {
        new TodoItem(ID, null, TASK_DESCRIPTION, DEADLINE, testPerson);
    }

    @Test(expected = RuntimeException.class)
    public void constructor_throws_exception_on_null_deadLine() {
        new TodoItem(ID, TITLE, TASK_DESCRIPTION, null, testPerson);
    }

    @Test
    public void test_getSummary(){
        assertNotNull(testObject.getSummary());
    }

}