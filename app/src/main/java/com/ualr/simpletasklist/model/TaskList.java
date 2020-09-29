package com.ualr.simpletasklist.model;

import java.util.HashMap;

public class TaskList {

    // TODO 03. Define TaskList's attributes. The class will have just one attribute to store all
    //  the tasks created by the user.

    // TIP. We need a data structure able to dynamically grow and shrink. That's why we'll use a HashMap.
    // where keys will be integer values and the mapped values will be a task object
    private HashMap<Integer, Task> taskListMap;
    // TODO 04. Define the class constructor and the corresponding getters and setters.
    public TaskList() {};

    public Task getTask(int id) {
        return taskListMap.get(id);
    }

    // TODO 06.03. Define a new method called "add" that, given a task description, will create a
    //  new task and add it to the task list.
    public void addTask(String description) {
        Task task = new Task(description);
        int id = taskListMap.size();
        taskListMap.put(id, task);
    }
    // TODO 06.04. Define a new "toString" method that provides a formatted string with all the tasks in the task list.
    // Format: 1 line per task. Each line should start with the id number of the task, then a dash, and the task description right after that.
    // If the task is marked as done, "Done" should be included at the end of the line
    public String taskToString() {
        String output = "";
        for(int id : taskListMap.keySet()) {
           output += id + " - " + taskListMap.get(id).getTaskDescription() + "\n";
        }
        output += "Done" + "\n";
        return output;
    }
    // TODO 07.03. Define a new method called "delete" that, given a task id, will delete the
    //  corresponding task from the task list.
    public void deleteTask(int id) {
        taskListMap.remove(id);
    }
    // TODO 08.03. Define a new method called "markDone" that, given a task id, will mark the
    //  corresponding task as done.
    public void markDone(int id) {
        taskListMap.get(id).setTaskDone(true);
    }
}
