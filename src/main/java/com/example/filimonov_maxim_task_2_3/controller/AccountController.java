package com.example.filimonov_maxim_task_2_3.controller;

import com.example.filimonov_maxim_task_2_3.exception.AccountAlreadyExistException;
import com.example.filimonov_maxim_task_2_3.exception.AccountNotFoundException;
import com.example.filimonov_maxim_task_2_3.Entity.AccountEntity;
import com.example.filimonov_maxim_task_2_3.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService cardsService;

    @PostMapping()
    public ResponseEntity createAccount(@RequestBody AccountEntity accountEntity) {
        try {
            cardsService.createAccount(accountEntity);
            return ResponseEntity.ok("Счет успешно сохранен");
        } catch (AccountAlreadyExistException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }


    @GetMapping
    public ResponseEntity getAccount(@RequestParam String accountNumber) {
        try {
            return ResponseEntity.ok(cardsService.getAccount(accountNumber));
        } catch (AccountNotFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @DeleteMapping("{accountNumber}")
    public ResponseEntity<String> deleteAccount (@PathVariable String accountNumber){
        try {
            return ResponseEntity.ok(cardsService.delete(accountNumber));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

//    @DeleteMapping("/{accountNumber}")
//    public ResponseEntity deleteAccount(@PathVariable String accountNumber) {
//        try {
//            return ResponseEntity.ok(accountService.delete(accountNumber));
//        }catch (Exception e){
//            return ResponseEntity.badRequest().body("произошла ошибка");
//        }
//   }
}
