package com.movies.movies.service.Impl;

import com.movies.movies.entity.Movie;
import com.movies.movies.repository.MovieRepository;
import com.movies.movies.response.MovieResponse;
import com.movies.movies.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private static final Logger LOG = LoggerFactory.getLogger(MovieServiceImpl.class);

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<MovieResponse> findByName(String name) {
        LOG.info("Searching for Movies for name: {}", name);
        List<Movie> movies = movieRepository.findByTitleContainingIgnoreCase(name);
        List<MovieResponse> movieResponses = new ArrayList<>();
        for (Movie mv: movies){
            MovieResponse movieResponse= new MovieResponse();
            movieResponse.setTitle(mv.getTitle());
            movieResponse.setReleaseYear(mv.getReleaseYear());

            movieResponses.add(movieResponse);
        }
        LOG.info("Adding movie for search: ");
        return  movieResponses;
    }
}
