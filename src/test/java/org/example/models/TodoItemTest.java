package org.example.models;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;


public class TodoItemTest {
    public static final String TITLE = "Prepare for bed";
    public static final String TASK_DESCRIPTION = "Brush teeth, rinse face, take medicine";
    public static final LocalDate DEADLINE = LocalDate.of(2021, 11,3);
    public static final LocalDate DEADLINE1 = LocalDate.of(2021, 10,3);
    public static final boolean DONE = false;
    private Person testPerson;
    private TodoItem testObject;
    private TodoItem testObject1;

    @Before
    public void setUp() throws Exception {
        testPerson = new Person(1, "Erik", "Alfredsson", "erik@erik.nu");
        testObject = new TodoItem(1, TITLE, TASK_DESCRIPTION, DEADLINE, DONE, testPerson);
        testObject1 = new TodoItem(2, TITLE, TASK_DESCRIPTION, DEADLINE1, DONE, testPerson);
    }

    @Test
    public void testObject_successfully_instantiated(){
      assertNotNull(testObject.getId());
      assertEquals(TITLE, testObject.getTitle());
      assertEquals(TASK_DESCRIPTION, testObject.getTaskDescription());
      assertEquals(DEADLINE, testObject.getDeadLine());
      assertEquals(DONE, testObject.isDone());
      assertNotNull(testObject.getCreator());
    }

    @Test
    public void isOverdue() {

    }

    @Test
    public void getSummary() {
    }
}