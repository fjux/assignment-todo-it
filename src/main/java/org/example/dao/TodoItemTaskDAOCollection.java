package org.example.dao;

import org.example.models.TodoItemTask;

import java.util.List;

public class TodoItemTaskDAOCollection implements TodoItemTaskDAO{
    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        return null;
    }

    @Override
    public List<TodoItemTask> findAll() {
        return null;
    }

    @Override
    public TodoItemTask findByAssigned(Boolean assigned) {
        return null;
    }

    @Override
    public TodoItemTask findByPersonId(int personId) {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
