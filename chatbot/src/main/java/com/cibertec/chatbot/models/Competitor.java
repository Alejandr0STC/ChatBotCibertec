package com.cibertec.chatbot.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.cibertec.chatbot.models.Base.EntityBase;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Competitor")
public class Competitor extends EntityBase
{
    @Column(name = "phone")
    private String phone;
    @Column(name = "clientId")
    private int clientId;
    @Column(name = "campaingId")
    private int campaingId;
    @Column(name = "userId")
    private int userId;
    @Column(name = "document")
    private int document;
} 