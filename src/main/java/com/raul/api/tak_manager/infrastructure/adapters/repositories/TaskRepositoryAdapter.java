package com.raul.api.tak_manager.infrastructure.adapters.repositories;

import com.raul.api.tak_manager.domain.model.Task;
import com.raul.api.tak_manager.domain.ports.TaskRepository; // Ajusta si el nombre es TaskRepositoryPort
import com.raul.api.tak_manager.infrastructure.adapters.entities.TaskEntity;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class TaskRepositoryAdapter implements TaskRepository {

    private final JpaTaskRepository jpaTaskRepository;

    public TaskRepositoryAdapter(JpaTaskRepository jpaTaskRepository) {
        this.jpaTaskRepository = jpaTaskRepository;
    }

    @Override
    public Task save(Task task) {
        TaskEntity entity = new TaskEntity(null, task.getTitle(), task.getDescription(), task.isCompleted());
        TaskEntity savedEntity = jpaTaskRepository.save(entity);
        return new Task(savedEntity.getId(), savedEntity.getTitle(), savedEntity.getDescription(), savedEntity.isCompleted());
    }

    @Override
    public List<Task> findAll() {
        return jpaTaskRepository.findAll().stream()
                .map(entity -> new Task(entity.getId(), entity.getTitle(), entity.getDescription(), entity.isCompleted()))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Task> findById(Long id) {
        return jpaTaskRepository.findById(id)
                .map(entity -> new Task(entity.getId(), entity.getTitle(), entity.getDescription(), entity.isCompleted()));
    }
}