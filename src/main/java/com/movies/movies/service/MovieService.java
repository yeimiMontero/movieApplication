package com.movies.movies.service;


import com.movies.movies.response.MovieResponse;

import java.util.List;


public interface MovieService {

    List<MovieResponse> findByName(String name);
}
