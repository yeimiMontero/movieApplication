package com.movies.movies.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "person")
public class Person {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name" )
    private String name;

    @Column(name = "lastname")
    private String lastname;

    @Column(name ="birth_date" )
    private Date birthDate;

    @Column(name ="type" )
    private Integer type;



}
