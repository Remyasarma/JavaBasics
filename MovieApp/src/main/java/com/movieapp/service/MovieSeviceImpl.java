package com.movieapp.service;

import java.util.Comparator;
import java.util.List;
import com.movieapp.model.Movie;
import com.movieapp.model.Language;
import com.movieapp.model.Genre;
import com.movieapp.model.Format;
import com.movieapp.dao.IMovieDao;
import com.movieapp.dao.MovieDaoImpl;
import com.movieapp.exceptions.MovieNotFoundException;

public class MovieSeviceImpl implements IMovieService {
    private IMovieDao movieDao = new MovieDaoImpl();

    @Override
    public void addMovie(Movie movie) {
        movieDao.addMovie(movie);
    }

    @Override
    public void updateMovie(int movieId, String format) {
        movieDao.updateMovie(movieId, format);
    }

    @Override
    public void deleteMovie(int movieId) {
        movieDao.deleteMovie(movieId);
    }

    @Override
    public Movie getById(int movieId) {
        Movie movie = movieDao.findById(movieId);
        if (movie == null) {
            throw new MovieNotFoundException("Movie not found with ID: " + movieId);
        }
        return movie;
    }

    @Override
    public List<Movie> getAll() {
        List<Movie> movies = movieDao.findAll();
        return movies.stream().sorted(Comparator.comparing(Movie::getMovieName)).toList();
    }

    @Override
    public List<Movie> getByLanguage(String language) {
        List<Movie> movies = movieDao.findByLanguage(language);
        if (movies.isEmpty()) {
            throw new MovieNotFoundException("No movies found for language: " + language);
        }
        return movies;
    }

    @Override
    public List<Movie> getByGenre(String genre) {
        List<Movie> movies = movieDao.findByGenre(genre);
        if (movies.isEmpty()) {
            throw new MovieNotFoundException("No movies found for genre: " + genre);
        }
        return movies;
    }

    @Override
    public List<Movie> getByLanguageFormat(String language, String format) {
        List<Movie> movies = movieDao.findByLanguageFormat(language, format);
        if (movies.isEmpty()) {
            throw new MovieNotFoundException("No movies found for language: " + language + " and format: " + format);
        }
        return movies;
    }

    @Override
    public List<Movie> getByLanguageGenre(String language, String genre) {
        List<Movie> movies = movieDao.findByLanguageGenre(language, genre);
        if (movies.isEmpty()) {
            throw new MovieNotFoundException("No movies found for language: " + language + " and genre: " + genre);
        }
        return movies;
    }

    @Override
    public List<Movie> getByGenreFormat(String genre, String format) {
        List<Movie> movies = movieDao.findByGenreFormat(genre, format);
        if (movies.isEmpty()) {
            throw new MovieNotFoundException("No movies found for genre: " + genre + " and format: " + format);
        }
        return movies;
    }

    @Override
    public List<Movie> getByAnyProperty(String choice) {
        List<Movie> movies = movieDao.findByAnyProperty(choice);
        if (movies.isEmpty()) {
            throw new MovieNotFoundException("No movies found matching: " + choice);
        }
        return movies;
    }

    @Override
    public List<String> getMovieNames(String language) {
        List<String> movieNames = movieDao.findMovieNames(language);
        if (movieNames.isEmpty()) {
            throw new MovieNotFoundException("No movie names found for language: " + language);
        }
        return movieNames;
    }
}
