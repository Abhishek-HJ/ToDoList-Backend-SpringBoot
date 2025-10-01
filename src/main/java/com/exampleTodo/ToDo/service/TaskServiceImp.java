package com.exampleTodo.ToDo.service;

import com.exampleTodo.ToDo.model.Task;
import com.exampleTodo.ToDo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service


public class TaskServiceImp implements TaskService {

    @Autowired
    TaskRepository repo;

    @Override
    public List<Task> getAll() {
        return repo.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        return repo.findById(id).orElse(null);

    }

    @Override
    public Task createTask(Task task) {

        return repo.save(task);
    }

    @Override
    public void deleteTaskById(Long id) {

         repo.deleteById(id);

    }

    @Override
    public Task updateTaskById(Long id, Task taskObject) {
    Task task=repo.findById(id).orElse(null);
    if(task==null) return null;

    task.setTitle(taskObject.getTitle());
    task.setDescription(taskObject.getDescription());
    task.setStatus(taskObject.isStatus());
    return repo.save(task);

    }
}
