package com.movies.movies.repository;

import com.movies.movies.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {


    List<Movie> findAllByOrderByTitleAsc();

    List<Movie> findAllByOrderByReleaseYearAsc();

    List<Movie> findByTitleContainingIgnoreCase(String title);

}
