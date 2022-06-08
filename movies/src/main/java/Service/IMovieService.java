package Service;

import Entities.Movies;

public interface IMovieService {
    void save(Movies movies);
    String findByGenre(String genre);
}
