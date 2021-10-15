package com.movies.movies.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Year;

@Data//Lombok te realiza getter, setter , to string, hascode
@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "release_year")
    private Integer releaseYear;



}
