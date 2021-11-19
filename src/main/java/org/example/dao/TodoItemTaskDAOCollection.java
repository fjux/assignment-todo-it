package org.example.dao;

import org.example.models.TodoItemTask;

import java.util.List;
import java.util.stream.Collectors;

public class TodoItemTaskDAOCollection implements TodoItemTaskDAO{

    List<TodoItemTask> todoItemTasks;

    public TodoItemTaskDAOCollection(List<TodoItemTask> todoItemTasks) {
        this.todoItemTasks = todoItemTasks;
    }

    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        todoItemTasks.add(todoItemTask);
        return todoItemTask;
    }

    @Override
    public List<TodoItemTask> findAll() {
        return todoItemTasks;
    }

    @Override
    public List<TodoItemTask> findByAssigned(Boolean assigned) {
        return todoItemTasks.stream().filter(todoItemTask -> todoItemTask.isAssigned() == assigned).collect(Collectors.toList());
    }

    @Override
    public List<TodoItemTask> findByPersonId(int personId) {
        return todoItemTasks.stream().filter(todoItemTask -> todoItemTask.getAssignee().getId() == personId).collect(Collectors.toList());
    }

    @Override
    public void remove(int id) {
        todoItemTasks.removeIf(todoItemTask -> todoItemTask.getId() == id);

    }
}
