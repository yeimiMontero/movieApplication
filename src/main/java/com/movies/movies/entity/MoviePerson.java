package com.movies.movies.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "movie_genre")
public class MoviePerson {

    @Id
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_movie", referencedColumnName = "id")
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_person", referencedColumnName = "id")
    private  Person person;


}
