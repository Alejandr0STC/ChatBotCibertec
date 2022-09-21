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
@Table(name = "CompanyCapmaing")
public class CompanyCapmaing extends EntityBase
{
    @Column(name = "companyId")
    private int companyId;
    @Column(name = "campaingId")
    private int campaingId;
} 