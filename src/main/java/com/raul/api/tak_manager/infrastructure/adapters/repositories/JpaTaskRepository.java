package com.raul.api.tak_manager.infrastructure.adapters.repositories;


import com.raul.api.tak_manager.infrastructure.adapters.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTaskRepository extends JpaRepository<TaskEntity, Long> {
}