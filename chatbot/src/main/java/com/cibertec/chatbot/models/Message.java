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
@Table(name = "Message")
public class Message extends EntityBase
{
    @Column(name = "message")
    private String message;
    @Column(name = "messageType")
    private int messageType;
    @Column(name = "urlMessage")
    private int urlMessage;
    @Column(name = "isBot")
    private int isBot;
    @Column(name = "competitorId")
    private int competitorId;
    @Column(name = "clientId")
    private int clientId;
    @Column(name = "phone")
    private int phone;
} 