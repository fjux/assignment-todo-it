package org.example.sequencers;

public class PersonIdSequencer {

    private int currentId;

    public int getCurrentId() {
        return currentId;
    }

    public void setCurrentId(int currentId) {
        this.currentId = currentId;
    }
    public static int nextId() {
        currentId++;
        return currentId;
    }
}
