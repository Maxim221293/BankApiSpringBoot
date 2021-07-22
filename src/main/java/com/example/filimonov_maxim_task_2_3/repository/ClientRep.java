package com.example.filimonov_maxim_task_2_3.repository;

import com.example.filimonov_maxim_task_2_3.Entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

public interface ClientRep extends CrudRepository<ClientEntity, Long> {

    @PersistenceContext
    public EntityManager em = null;

    default List findAllClient() {

        return em.createQuery("SELECT * from ClientEntity ", ClientEntity.class).getResultList();

    }


}



