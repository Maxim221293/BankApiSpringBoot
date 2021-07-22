package com.example.filimonov_maxim_task_2_3.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class AccountAlreadyExistException extends Exception{
    public AccountAlreadyExistException(String message) {
        super(message);
    }
}
