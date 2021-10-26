package org.example.models;

public class TodoItemTask {
    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;


    public TodoItemTask(int id, TodoItem todoItem, Person assignee) {
        if(todoItem == null){
            throw new RuntimeException("todoItem was null");
        }
        this.id = id;
        this.todoItem = todoItem;
        this.assignee = assignee;
        /* The code is cleaner when written like setAssigned(this.assignee != null;
        But for now my version helps me stop my thought patterns of constantly finding a deeper level.
        When my understanding of Java is greater I will refactor my code to the cleaner variant.
         */
        if(this.assignee != null){
            setAssigned(true);
        }
    }

    public int getId() {
        return id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
        setAssigned(this.assignee != null);
    }

    public  String getSummary() {
        return "{id: " + id + ", assigned: " + assigned + ", todo item: " + todoItem + ", assignee: " + assignee.getFirstName() + " " + assignee.getLastName() + "}";
    }
}
