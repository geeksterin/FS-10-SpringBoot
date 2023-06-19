package com.geekster.TodoAPP.controller;

import com.geekster.TodoAPP.entity.Todo;
import com.geekster.TodoAPP.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    @Autowired
    TodoService todoService;


    public TodoController() {

    }

    @GetMapping("todos")
    public List<Todo> getAllTodos()
    {
        return todoService.getAllTodos();
    }

    @GetMapping("todo/done")
    public List<Todo> getDoneTodos()
    {
        return todoService.getAllDoneTodos();
    }

    @GetMapping("todo/undone")
    public List<Todo> getNotDoneTodos()
    {
        return todoService.getUndoneTodos();
    }

    @PostMapping("todo")
    public String addTodo(@RequestBody Todo todo)
    {
        return todoService.addTodo(todo);
    }

    @PutMapping("todo/{todoId}/{status}")
    public String markTodo(@PathVariable Integer todoId,@PathVariable boolean status)
    {
        return todoService.updateTodoStatus(todoId,status);
    }

    @DeleteMapping("todo")
    public String removeTodo(@RequestParam Integer todoId)
    {
        return todoService.removeTodo(todoId);

    }


}
