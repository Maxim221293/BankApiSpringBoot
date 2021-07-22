package com.example.filimonov_maxim_task_2_3.Entity;

import javax.persistence.*;

@Entity
public class CardsEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cardsId;
    private String cardsNumber;
    private int accountId;

    @ManyToOne
    @JoinColumn(name = "account_accountId")
    private AccountEntity account;


    public CardsEntity() {
    }

    public long getCardsId() {
        return cardsId;
    }

    public void setCardsId(long cardsId) {
        this.cardsId = cardsId;
    }

    public String getCardsNumber() {
        return cardsNumber;
    }

    public void setCardsNumber(String cardsNumber) {
        this.cardsNumber = cardsNumber;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }


    @Override
    public String toString() {
        return "Cards{" +
                "cardsId=" + cardsId +
                ", cardsNumber='" + cardsNumber + '\'' +
                ", accountId=" + accountId +
                '}';
    }
}