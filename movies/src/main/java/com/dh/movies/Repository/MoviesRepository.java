package com.dh.movies.Repository;

import com.dh.movies.Entities.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Long> {
    List<Movies> findByGenre(String genre);
}
