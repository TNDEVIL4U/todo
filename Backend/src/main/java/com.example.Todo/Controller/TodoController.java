package com.example.Todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoController {
    @Autowired
    TodoService todoService;

    @GetMapping("/{id}")
    ResponseEntity<Todo> getTodo(@PathVariable Long id) {
        try {
            Todo todo = todoService.getTodoById(id);
            return new ResponseEntity<>(todo,HttpStatus.OK);
        }
        catch (RuntimeException e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping
    ResponseEntity<List<Todo>> getAllTodos() {
        return new ResponseEntity<List<Todo>>(todoService.retrieveAllTodos(), HttpStatus.OK);
    }

    @PostMapping("/create")
    ResponseEntity<Todo> createTodo(@RequestBody Todo todo)
    {
        return new ResponseEntity<>(todoService.createTodo(todo),HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Todo> updateTodo(@RequestBody Todo todo)
    {
        return new ResponseEntity<>(todoService.updateTodo(todo),HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    void  deleteTodoById(@PathVariable Long id)
    {
        todoService.deleteTodoById(id);
    }
    @DeleteMapping
    void deleteTodo()
    {
        todoService.deleteTodo();
    }

}

