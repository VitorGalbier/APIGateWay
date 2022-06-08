package Service;

import Entities.Movies;
import Repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements IMovieService{

    @Autowired
    private MoviesRepository moviesRepository;

    @Override
    public void save(Movies movies) {
        moviesRepository.save(movies);
    }

    @Override
    public String findByGenre(String genre) {
        return moviesRepository.findByGenre(genre).getName();
    }
}
