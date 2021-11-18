package org.example.sequencers;

public class TodoItemIdSequencer {

    private int currentId;

    public int getCurrentId() {
        return currentId;
    }

    public void setCurrentId(int currentId) {
        this.currentId = currentId;
    }

    public int nextId() {
        currentId++;
        return currentId;
    }
}
