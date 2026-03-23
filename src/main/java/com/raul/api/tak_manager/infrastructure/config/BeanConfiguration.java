package com.raul.api.tak_manager.infrastructure.config;

import com.raul.api.tak_manager.application.services.TaskService;
import com.raul.api.tak_manager.domain.ports.TaskRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
public TaskService taskService(TaskRepository taskRepository) { 
    return new TaskService(taskRepository);
}
}