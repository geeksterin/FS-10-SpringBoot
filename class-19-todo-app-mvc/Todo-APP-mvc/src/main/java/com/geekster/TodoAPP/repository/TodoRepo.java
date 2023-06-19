package com.geekster.TodoAPP.repository;

import com.geekster.TodoAPP.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepo {

    @Autowired
    private List<Todo> myTodos;

    public List<Todo> getMyTodos() {
        return myTodos;
    }


    public void add(Todo todo)
    {
        myTodos.add(todo);
    }

    public void delete(Todo todo)
    {
        myTodos.remove(todo);
    }
}
