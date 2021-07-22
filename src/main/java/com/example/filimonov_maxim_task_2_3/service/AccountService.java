package com.example.filimonov_maxim_task_2_3.service;


import com.example.filimonov_maxim_task_2_3.exception.AccountAlreadyExistException;
import com.example.filimonov_maxim_task_2_3.exception.AccountNotFoundException;
import com.example.filimonov_maxim_task_2_3.Entity.AccountEntity;
import com.example.filimonov_maxim_task_2_3.repository.AccountRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRep accountRep;

    public AccountEntity createAccount(AccountEntity accountEntity) throws AccountAlreadyExistException {
        if (accountRep.findByAccountNumber(accountEntity.getAccountNumber()) != null) {
            throw new AccountAlreadyExistException("Счет с таким номером существует");
        }
        return accountRep.save(accountEntity);
    }


    public AccountEntity getAccount(String accountNumber) throws AccountNotFoundException {
        AccountEntity accountEntity = accountRep.findByAccountNumber(accountNumber);
        if (accountEntity == null) {
            throw new AccountNotFoundException("счет не найден");
        }
        return accountEntity;
    }

    public String delete(String accountNumber) {
        accountRep.deleteByAccountNumber(accountNumber);
        return accountNumber;
    }

}
