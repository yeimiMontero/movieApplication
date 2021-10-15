package com.movies.movies.resources;


import com.movies.movies.response.MovieResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;
public interface MovieResource {
    @GetMapping(value = "/movie" , produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<MovieResponse>>  searchMovieByName(@RequestParam(name = "name") String name);
}
