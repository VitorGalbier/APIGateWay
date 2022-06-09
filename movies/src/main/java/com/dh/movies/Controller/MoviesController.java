package com.dh.movies.Controller;

import com.dh.movies.Entities.Movies;
import com.dh.movies.Service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movies")
public class MoviesController {

    @Autowired
    private IMovieService iMovieService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody Movies movies){
        iMovieService.save(movies);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{genre}")
    public List<Movies> findMovie(@PathVariable String genre){
        return iMovieService.findByGenre(genre);
    }
}
