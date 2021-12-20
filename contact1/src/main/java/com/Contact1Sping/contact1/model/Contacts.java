package com.Contact1Sping.contact1.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity
@Entity
//defining class name as Table name
@Table
@Getter
@Setter
public class Contacts {
    @Id
    @Column
    private int phoneno;
    @Column
    private String name;
    @Column
    private String email;
}
