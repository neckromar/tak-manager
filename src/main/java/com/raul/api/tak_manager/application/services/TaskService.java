package com.raul.api.tak_manager.application.services;

import com.raul.api.tak_manager.domain.model.Task;
import com.raul.api.tak_manager.domain.ports.TaskRepository;

import java.util.List;

public class TaskService {
    private final TaskRepository taskRepositoryPort;

    public TaskService(TaskRepository taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    public Task create(Task task) {
        return taskRepositoryPort.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepositoryPort.findAll();
    }
}