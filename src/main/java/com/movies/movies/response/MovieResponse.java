package com.movies.movies.response;

import lombok.Data;

import java.time.Year;

@Data
public class MovieResponse {

    private String title;
    private Integer releaseYear;
}
