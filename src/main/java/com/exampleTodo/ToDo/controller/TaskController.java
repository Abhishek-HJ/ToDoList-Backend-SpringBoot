package com.exampleTodo.ToDo.controller;

import com.exampleTodo.ToDo.model.Task;
import com.exampleTodo.ToDo.service.TaskService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    private TaskService service;


    @GetMapping
    public ResponseEntity<List<Task>> getAllTask(){
        List<Task> task=service.getAll();
        return ResponseEntity.ok(task);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getById(@PathVariable Long id){
        Task task=service.getTaskById(id);
        if(task==null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(task);
    }

    @PostMapping
    public ResponseEntity<Task> addTask(@RequestBody Task obj){
        Task task=service.createTask(obj);
        return ResponseEntity.ok(task);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task obj){
        Task task=service.updateTaskById(id,obj);
        if(task==null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(task);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id){
        Task task=service.getTaskById(id);
        if(task==null){
            return ResponseEntity.notFound().build();
        }
        service.deleteTaskById(id);
        return ResponseEntity.noContent().build();


    }


}
