package com.example.filimonov_maxim_task_2_3.service;


import com.example.filimonov_maxim_task_2_3.Entity.AccountEntity;
import com.example.filimonov_maxim_task_2_3.Entity.ClientEntity;
import com.example.filimonov_maxim_task_2_3.exception.AccountNotFoundException;
import com.example.filimonov_maxim_task_2_3.repository.ClientRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRep clientRep;


    public List getClient (){
            return clientRep.findAllClient();
        }

    }

//    public AccountEntity getAccount(String accountNumber) throws AccountNotFoundException {
//        AccountEntity accountEntity = accountRep.findByAccountNumber(accountNumber);
//        if (accountEntity == null) {
//            throw new AccountNotFoundException("счет не найден");
//        }
//        return accountEntity;
//    }
//
//    public String delete(String accountNumber) {
//        accountRep.deleteByAccountNumber(accountNumber);
//        return accountNumber;
//    }




