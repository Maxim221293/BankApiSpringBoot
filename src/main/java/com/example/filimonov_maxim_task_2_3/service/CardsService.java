package com.example.filimonov_maxim_task_2_3.service;

import com.example.filimonov_maxim_task_2_3.Entity.CardsEntity;
import com.example.filimonov_maxim_task_2_3.exception.AccountAlreadyExistException;
import com.example.filimonov_maxim_task_2_3.repository.CardsRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardsService {

    @Autowired
    private CardsRep cardsRep;

    public CardsEntity createCards(CardsEntity cardsEntity) throws AccountAlreadyExistException {
        if (cardsRep.findByCardsNumber(cardsEntity.getCardsNumber()) != null) {
            throw new AccountAlreadyExistException("карта таким номером существует");
        }
        return cardsRep.save(cardsEntity);
    }
}
