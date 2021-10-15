package com.movies.movies.controller;


import com.movies.movies.resources.MovieResource;
import com.movies.movies.response.MovieResponse;
import com.movies.movies.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController implements MovieResource {

    @Autowired
    private MovieService movieService;

    private static final Logger LOG= LoggerFactory.getLogger(MovieController.class);

    @Override
    public ResponseEntity<List<MovieResponse>> searchMovieByName(String name) {
        LOG.info("Method: SearchMovieByName() ");
        try {
            return new ResponseEntity<>(movieService.findByName(name),HttpStatus.OK);
        }catch (Exception e){
            LOG.error(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
