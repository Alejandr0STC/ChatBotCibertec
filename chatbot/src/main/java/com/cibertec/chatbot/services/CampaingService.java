package com.cibertec.chatbot.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.chatbot.repositories.Campaing.ICampaingRepository;

@Service
public class CampaingService implements ICompaingService 
{
    @Autowired
    private ICampaingRepository campaingRepository;
}
