package com.example.filimonov_maxim_task_2_3.controller;

import com.example.filimonov_maxim_task_2_3.Entity.ClientEntity;
import com.example.filimonov_maxim_task_2_3.exception.AccountNotFoundException;
import com.example.filimonov_maxim_task_2_3.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;


    @GetMapping()
    public ResponseEntity getAllClient() {
        return ResponseEntity.ok(clientService.getClient());

    }
}