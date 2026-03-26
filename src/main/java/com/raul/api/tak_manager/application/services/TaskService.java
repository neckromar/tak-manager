package com.raul.api.tak_manager.application.services;

import com.raul.api.tak_manager.domain.model.Task;
import com.raul.api.tak_manager.domain.ports.TaskRepository;

import java.util.List;

import com.raul.api.tak_manager.domain.exceptions.ListaVaciaException;
import com.raul.api.tak_manager.domain.exceptions.TaskNotFoundException;

public class TaskService {
    private final TaskRepository taskRepositoryPort;

    public TaskService(TaskRepository taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    public Task create(Task task) {
        return taskRepositoryPort.save(task);
    }

    public List<Task> getAllTasks() {
        List<Task> tasks = taskRepositoryPort.findAll();
        if(tasks.isEmpty()){
                throw new ListaVaciaException("ACTUALMENTE LA LISTA ESTA VACIA");
        }
        return tasks;
    
    }

    public Task getTaskById(Long id){
        return taskRepositoryPort.findById(id).orElseThrow(() -> new TaskNotFoundException("La busqueda con ID " + id + " no se encuentra"));
    }
    public void deteleTask(Long id){
        this.getTaskById(id);
        taskRepositoryPort.deleteById(id);

    }
}