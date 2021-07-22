package com.example.filimonov_maxim_task_2_3.controller;

import com.example.filimonov_maxim_task_2_3.Entity.AccountEntity;
import com.example.filimonov_maxim_task_2_3.Entity.CardsEntity;
import com.example.filimonov_maxim_task_2_3.exception.AccountAlreadyExistException;
import com.example.filimonov_maxim_task_2_3.service.AccountService;
import com.example.filimonov_maxim_task_2_3.service.CardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cards")
public class CardsController {

    @Autowired
    private CardsService cardsService;

    @PostMapping()
    public ResponseEntity createCards(@RequestBody CardsEntity cardsEntity) {
        try {
            cardsService.createCards(cardsEntity);
            return ResponseEntity.ok("карта успешно сохранена");
        } catch (AccountAlreadyExistException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
