package org.example.dao;

import org.example.models.TodoItem;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TodoItemDAOCollection implements TodoItemDAO{

    List<TodoItem> todoItems;

    public TodoItemDAOCollection(List<TodoItem> todoItems) {
        this.todoItems = todoItems;
    }

    @Override
    public TodoItem persist(TodoItem todoItem) {
        todoItems.add(todoItem);
        return todoItem;
    }

    @Override
    public List<TodoItem> findAll() {
        return todoItems;
    }

    @Override
    public List<TodoItem> findAllByDoneStatus(Boolean done) {
        return todoItems.stream().filter(todoItem -> todoItem.isDone() == done).collect(Collectors.toList());
            }

    @Override
    public List<TodoItem> findByTitleContains(String title) {
        return todoItems.stream().filter(todoItem -> todoItem.getTitle().contains(title)).collect(Collectors.toList());
    }

    @Override
    public List<TodoItem> findByPersonId(int personId) {
        return todoItems.stream().filter(todoItem -> todoItem.getCreator().getId() == personId).collect(Collectors.toList());
    }

    @Override
    public List<TodoItem> findByDeadlineBefore(LocalDate date) {
        return todoItems.stream().filter(todoItem -> todoItem.getDeadLine().isBefore(date)).collect(Collectors.toList());
    }

    @Override
    public List<TodoItem> findByDeadlineAfter(LocalDate date) {
        return todoItems.stream().filter(todoItem -> todoItem.getDeadLine().isAfter(date)).collect(Collectors.toList());
    }

    @Override
    public void remove(int id) {
        todoItems.removeIf(todoItem -> todoItem.getId() == id);
    }
}
