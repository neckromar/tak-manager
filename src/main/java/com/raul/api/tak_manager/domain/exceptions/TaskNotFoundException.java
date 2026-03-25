package com.raul.api.tak_manager.domain.exceptions;

public class TaskNotFoundException extends RuntimeException {
    public String message;
    public TaskNotFoundException(String message){
        super(message);
        this.message=message;
    }

}
