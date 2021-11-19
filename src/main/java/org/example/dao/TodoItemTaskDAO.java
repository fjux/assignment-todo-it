package org.example.dao;

import org.example.models.Person;
import org.example.models.TodoItemTask;

import java.util.List;

public interface TodoItemTaskDAO {

    TodoItemTask persist(TodoItemTask todoItemTask);
    List<TodoItemTask> findAll();
    List<TodoItemTask> findByAssigned(Boolean assigned);
    List<TodoItemTask> findByPersonId(int personId);
    void remove(int id);
}
