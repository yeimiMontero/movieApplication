package com.movies.movies.repository;

import com.movies.movies.entity.MoviePerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviePersonRepository extends JpaRepository<MoviePerson,Integer> {
}
