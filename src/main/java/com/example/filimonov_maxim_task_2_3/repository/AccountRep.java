package com.example.filimonov_maxim_task_2_3.repository;

import com.example.filimonov_maxim_task_2_3.Entity.AccountEntity;
import org.springframework.data.repository.CrudRepository;



public interface AccountRep extends CrudRepository<AccountEntity, Long> {
AccountEntity findByAccountNumber(String accountNumber);

AccountEntity deleteByAccountNumber(String accountNumber);



}
