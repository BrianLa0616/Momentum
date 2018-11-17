package com.example.brianla.momentum;

public class Task {
    private String taskName;
    private int difficulty;
    private boolean done;

    public Task(String name, int difficulty) {
        taskName = name;
        this.difficulty = difficulty;
        done = false;
    }

    public Task(String name) {
        taskName = name;
        difficulty = 1;
        done = false;
    }

    public void finish() {
        done = true;
    }

    public boolean isComplete() {
        return done;
    }


    public int getDifficult() {
        return difficulty;
    }


}
