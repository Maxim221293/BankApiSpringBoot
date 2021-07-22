package com.example.filimonov_maxim_task_2_3.repository;

import com.example.filimonov_maxim_task_2_3.Entity.AccountEntity;
import com.example.filimonov_maxim_task_2_3.Entity.CardsEntity;
import org.springframework.data.repository.CrudRepository;

public interface CardsRep extends CrudRepository<CardsEntity, Long> {
    CardsEntity findByCardsNumber(String cardsNumber);

}
