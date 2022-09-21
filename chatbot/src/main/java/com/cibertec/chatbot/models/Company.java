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
@Table(name = "Company")
public class Company extends EntityBase
{
    @Column(name = "name")
    private String name;
}
