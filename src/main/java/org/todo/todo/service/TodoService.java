package org.todo.todo.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.todo.todo.model.Todo;

@Service
public class TodoService {
    private final List<Todo> todos = new ArrayList<>();
    private long idCounter = 1;

    public List<Todo> getAll() {
        return todos;
    }

    public Todo create(String title) {
        Todo newTodo = new Todo(idCounter++, title, false);
        todos.add(newTodo);
        return newTodo;
    }

    public void delete(Long id) {
        todos.removeIf(t -> t.getId().equals(id));
    }
}
