package org.todo.todo.model;

@SuppressWarnings("FieldMayBeFinal")
public class Todo {
    private long id;
    private String title;
    private Boolean completed;

    public Todo (Long id, String title, Boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getCompleted() {
        return completed;
    }
}
