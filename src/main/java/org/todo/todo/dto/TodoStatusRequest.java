package org.todo.todo.dto;

public class TodoStatusRequest {
    private boolean completed;
    private long id;

    // Default constructor is needed for JSON parsing
    public TodoStatusRequest() {}

    public TodoStatusRequest(boolean completed, long id) {
        this.completed = completed;
        this.id = id;
    }

    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean status) { this.completed = status; }

    public long getId() { return id; }
}
