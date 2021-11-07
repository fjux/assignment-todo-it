package org.example.models;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "TodoItemTask{" +
                "id=" + id +
                ", assigned=" + assigned +
                ", todoItem=" + todoItem +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItemTask that = (TodoItemTask) o;
        return id == that.id && assigned == that.assigned && Objects.equals(todoItem, that.todoItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, assigned, todoItem);
    }
}
