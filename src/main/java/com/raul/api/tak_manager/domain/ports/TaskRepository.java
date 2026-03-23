package com.raul.api.tak_manager.domain.ports;

import com.raul.api.tak_manager.domain.model.Task;
import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    Task save(Task task);
    List<Task> findAll();
    Optional<Task> findById(Long id);
}
