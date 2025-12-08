package com.example.Todo;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;
    public Todo createTodo(Todo todo)
    {
        return todoRepository.save(todo);
    }
    public Todo getTodoById(Long id) {return todoRepository.findById(id).orElseThrow(()-> new RuntimeException("Todo not found"));}
    public void deleteTodoById(Long id)
    {
        todoRepository.deleteById(id);
    }
    public List<Todo> retrieveAllTodos()
    {
        return todoRepository.findAll();
    }
    public Page<Todo> retrievePage(int PageNumber,int PageSize)
    {
        Pageable page = PageRequest.of(PageNumber,PageSize);
        return todoRepository.findAll(page);
    }
    public Todo updateTodo(Todo todo)
    {
        return todoRepository.save(todo);
    }
    public void deleteTodo()
    {
        todoRepository.deleteAll();
    }
}
