package com.geekster.TodoAPP.entity;

public class Todo {

    private Integer todoId;
    private String todoName;
    private boolean isTodoDoneStatus;

    public Integer getTodoId() {
        return todoId;
    }

    public void setTodoId(Integer todoId) {
        this.todoId = todoId;
    }

    public String getTodoName() {
        return todoName;
    }

    public void setTodoName(String todoName) {
        this.todoName = todoName;
    }

    public boolean isTodoDoneStatus() {
        return isTodoDoneStatus;
    }

    public void setTodoDoneStatus(boolean todoDoneStatus) {
        isTodoDoneStatus = todoDoneStatus;
    }
}
