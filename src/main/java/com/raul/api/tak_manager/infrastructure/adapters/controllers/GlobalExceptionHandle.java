package com.raul.api.tak_manager.infrastructure.adapters.controllers;


import com.raul.api.tak_manager.domain.exceptions.TaskNotFoundException;
import com.raul.api.tak_manager.infrastructure.adapters.controllers.models.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandle {
    @ExceptionHandler(TaskNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleTaskNotFound(TaskNotFoundException ex){

        ErrorResponse error= new ErrorResponse(
            HttpStatus.NOT_FOUND.value(), ex.message, System.currentTimeMillis());
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }

}
