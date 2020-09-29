package com.ualr.simpletasklist.model;

public class Task {

    // TODO 01. Define two attributes for the Task class: one to store the task description and a second one that
    //  indicates whether the task is done or not
    private String taskDescription;
    private boolean taskDone;

    // TODO 02. Define the class constructor and the corresponding getters and setters.
    Task(String description) {
        taskDescription = description;
        taskDone = false;
    }
    //getters
    public String getTaskDescription() {
        return taskDescription;
    }

    public boolean getTaskDone() {
        return taskDone;
    }
    //setters
    public void setTaskDescription(String description) {
        taskDescription = description;
    }

    public void setTaskDone(boolean done) {
        taskDone = done;
    }


}
