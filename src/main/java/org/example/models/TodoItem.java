package org.example.models;

import java.time.LocalDate;

public class TodoItem {
    int id;
    String title;
    String taskDescription;
    LocalDate deadLine;
    boolean done;
    Person creator;

    public TodoItem(int id, String title, String taskDescription, LocalDate deadLine, boolean done, Person creator) {
        if((title == null) || (deadLine == null)){
            throw new RuntimeException("title or deadLine was null");
        }
        this.id = id;
        this.title = title;
        this.taskDescription = taskDescription;
        this.deadLine = deadLine;
        this.done = done;
        this.creator = creator;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public boolean isOverdue(){
        if (deadLine.isAfter(LocalDate.now())){
            return true;
        }
        return false;
    }

    public  String getSummary() {
        return "{id: " + id + ", title: " + title + ", description: " + taskDescription + ", deadline: " + deadLine + ", done: " + done + ", creator: " + creator + "}";
    }
}
