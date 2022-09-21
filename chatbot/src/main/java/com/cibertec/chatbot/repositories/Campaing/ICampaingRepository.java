package com.cibertec.chatbot.repositories.Campaing;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.chatbot.models.Campaing;

@Repository
public interface ICampaingRepository extends JpaRepository<Campaing, Integer> 
{
    
}
    

