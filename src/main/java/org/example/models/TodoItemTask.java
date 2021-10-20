package org.example.models;

public class TodoItemTask {
    private int id;
    private boolean assigned;
    private TodoItem todoitem;
    private Person assignee;

    public TodoItemTask(int id, boolean assigned, TodoItem todoitem, Person assignee) {
        if(todoitem == null){
            throw new RuntimeException("todoItem was null");
        }
        this.id = id;
        this.assigned = assigned;
        this.todoitem = todoitem;
        this.assignee = assignee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoitem;
    }

    public void setTodoItem(TodoItem todoitem) {
        this.todoitem = todoitem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
        setAssigned(this.assignee == null);
    }

    public  String getSummary() {
        return "{id: " + id + ", assigned: " + assigned + ", todo item: " + todoitem + ", assignee: " + assignee  + "}";
    }
}
