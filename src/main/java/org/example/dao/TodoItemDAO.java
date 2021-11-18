package org.example.dao;

import org.example.models.AppUser;
import org.example.models.TodoItem;

import java.time.LocalDate;
import java.util.List;

public interface TodoItemDAO {
    TodoItem persist(TodoItem todoItem);
    List<TodoItem> findAll();
    List<TodoItem> findAllByDoneStatus(Boolean done);
    List<TodoItem> findByTitleContains(String title);
    List<TodoItem> findByPersonId(int personId);
    List<TodoItem> findByDeadlineBefore(LocalDate date);
    List<TodoItem> findByDeadlineAfter(LocalDate date);
    void remove(int id);
}
