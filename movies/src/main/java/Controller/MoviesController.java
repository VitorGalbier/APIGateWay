package Controller;

import Entities.Movies;
import Service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/movies")
public class MoviesController {

    @Autowired
    private IMovieService iMovieService;

    @PostMapping("/post")
    public ResponseEntity<Void> save(@RequestBody Movies movies){
        iMovieService.save(movies);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{genre}")
    public String findMovie(@PathVariable String genre){
        return iMovieService.findByGenre(genre);
    }
}
