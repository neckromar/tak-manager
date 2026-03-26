package com.raul.api.tak_manager.infrastructure.adapters.controllers;

import com.raul.api.tak_manager.application.services.TaskService;
import com.raul.api.tak_manager.domain.model.Task;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.create(task);
    }

    @GetMapping
    public List<Task> getAll() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task getById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        taskService.deteleTask(id);
    }

    @PutMapping("/{id}")
    public Task actualizar(@PathVariable Long id, @RequestBody Task task){
        return taskService.actualizarTask(id, task);
    }
    
}