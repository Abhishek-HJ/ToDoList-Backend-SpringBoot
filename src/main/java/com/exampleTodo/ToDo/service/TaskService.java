package com.exampleTodo.ToDo.service;


import com.exampleTodo.ToDo.model.Task;

import java.util.List;

public interface TaskService {
    public List<Task> getAll();
    public Task getTaskById(Long id);
    public Task createTask(Task task);
    public void deleteTaskById(Long id);
    public Task updateTaskById(Long id,Task taskObject);


}
