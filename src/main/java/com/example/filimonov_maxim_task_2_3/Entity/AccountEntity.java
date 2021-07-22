package com.example.filimonov_maxim_task_2_3.Entity;

import javax.persistence.*;
import java.util.*;

@Entity
public class AccountEntity {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountId;
    private String accountNumber;
    private long balance;
    private int clientId;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "account")
    private List<CardsEntity> cardList;

    public AccountEntity() {
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }


    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", clientId=" + clientId +
                '}';
    }
}
