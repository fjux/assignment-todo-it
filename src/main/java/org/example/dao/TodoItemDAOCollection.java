package org.example.dao;

import org.example.models.TodoItem;

import java.time.LocalDate;
import java.util.List;

public class TodoItemDAOCollection implements TodoItemDAO{
    @Override
    public TodoItem persist(TodoItem todoItem) {
        return null;
    }

    @Override
    public List<TodoItem> findAll() {
        return null;
    }

    @Override
    public List<TodoItem> findAllByDoneStatus(Boolean done) {
        return null;
    }

    @Override
    public List<TodoItem> findByTitleContains(String title) {
        return null;
    }

    @Override
    public List<TodoItem> findByPersonId(int personId) {
        return null;
    }

    @Override
    public List<TodoItem> findByDeadlineBefore(LocalDate date) {
        return null;
    }

    @Override
    public List<TodoItem> findByDeadlineAfter(LocalDate date) {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
