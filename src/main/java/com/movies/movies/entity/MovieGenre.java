package com.movies.movies.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "movie_genre")
@Data
public class MovieGenre {


    @Id
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_movie" ,referencedColumnName = "id")//De la tabla movie
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_genre", referencedColumnName = "id")
    private Genre genre;



}
