package com.dh.movies.Service;

import com.dh.movies.Entities.Movies;

import java.util.List;

public interface IMovieService {
    void save(Movies movies);
    List<Movies> findByGenre(String genre);
}
