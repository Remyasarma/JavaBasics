package com.movieapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import com.movieapp.model.Movie;
import com.movieapp.model.Language;
import com.movieapp.model.Genre;
import com.movieapp.model.Format;
import com.movieapp.util.ConnectionUtil;
import com.movieapp.util.Queries;
import com.movieapp.exceptions.MovieNotFoundException; // Ensure this is imported

public class MovieDaoImpl implements IMovieDao {
    static Connection connection;

    static {
        connection = ConnectionUtil.openConnection();
    }

    @Override
    public void addMovie(Movie movie) {
        try (PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY)) {
            statement.setString(1, movie.getMovieName());
            statement.setString(2, movie.getLanguage());
            statement.setString(3, movie.getFormat());
            statement.setString(4, movie.getGenre());
            statement.setTime(5, Time.valueOf(movie.getDuration()));
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error adding movie", e);
        }
    }

    @Override
    public void updateMovie(int movieId, String format) {
        try (PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY)) {
            statement.setString(1, format);
            statement.setInt(2, movieId);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected == 0) {
                throw new MovieNotFoundException("Movie with ID " + movieId + " not found.");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error updating movie", e);
        }
    }

    @Override
    public void deleteMovie(int movieId) {
        try (PreparedStatement statement = connection.prepareStatement(Queries.DELETEQUERY)) {
            statement.setInt(1, movieId);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected == 0) {
                throw new MovieNotFoundException("Movie with ID " + movieId + " not found.");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error deleting movie", e);
        }
    }

    @Override
    public Movie findById(int movieId) {
        try (PreparedStatement statement = connection.prepareStatement(Queries.SELECTONEQUERY)) {
            statement.setInt(1, movieId);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Movie movie = new Movie();
                    movie.setMovieName(resultSet.getString("movie_name"));
                    movie.setLanguage(resultSet.getString("language"));
                    movie.setFormat(resultSet.getString("format"));
                    movie.setMovieId(resultSet.getInt("movie_id"));
                    movie.setDuration(resultSet.getTime("duration").toLocalTime());
                    movie.setGenre(resultSet.getString("genre"));
                    return movie;
                } else {
                    throw new MovieNotFoundException("Movie with ID " + movieId + " not found.");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error finding movie by ID", e);
        }
    }

    @Override
    public List<Movie> findAll() {
        List<Movie> movies = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(Queries.SELECTQUERY);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Movie movie = new Movie();
                movie.setMovieName(resultSet.getString("movie_name"));
                movie.setLanguage(resultSet.getString("language"));
                movie.setFormat(resultSet.getString("format"));
                movie.setMovieId(resultSet.getInt("movie_id"));
                movie.setDuration(resultSet.getTime("duration").toLocalTime());
                movie.setGenre(resultSet.getString("genre"));
                movies.add(movie);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error fetching all movies", e);
        }
        return movies;
    }

    @Override
    public List<Movie> findByLanguage(String language) {
        List<Movie> movies = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(Queries.SELECTLANGQUERY)) {
            statement.setString(1, language);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Movie movie = new Movie();
                    movie.setMovieName(resultSet.getString("movie_name"));
                    movie.setLanguage(language);
                    movie.setFormat(resultSet.getString("format"));
                    movie.setMovieId(resultSet.getInt("movie_id"));
                    movie.setDuration(resultSet.getTime("duration").toLocalTime());
                    movie.setGenre(resultSet.getString("genre"));
                    movies.add(movie);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error finding movies by language", e);
        }
        return movies;
    }

    @Override
    public List<Movie> findByGenre(String genre) {
        List<Movie> movies = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(Queries.SELECTGENREQUERY)) {
            statement.setString(1, genre);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Movie movie = new Movie();
                    movie.setMovieName(resultSet.getString("movie_name"));
                    movie.setLanguage(resultSet.getString("language"));
                    movie.setFormat(resultSet.getString("format"));
                    movie.setMovieId(resultSet.getInt("movie_id"));
                    movie.setDuration(resultSet.getTime("duration").toLocalTime());
                    movie.setGenre(genre);
                    movies.add(movie);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error finding movies by genre", e);
        }
        return movies;
    }

    @Override
    public List<Movie> findByLanguageFormat(String language, String format) {
        List<Movie> movies = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(Queries.SELECTLANGFORMQUERY)) {
            statement.setString(1, language);
            statement.setString(2, format);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Movie movie = new Movie();
                    movie.setMovieName(resultSet.getString("movie_name"));
                    movie.setLanguage(language);
                    movie.setFormat(format);
                    movie.setMovieId(resultSet.getInt("movie_id"));
                    movie.setDuration(resultSet.getTime("duration").toLocalTime());
                    movie.setGenre(resultSet.getString("genre"));
                    movies.add(movie);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error finding movies by language and format", e);
        }
        return movies;
    }

    @Override
    public List<Movie> findByLanguageGenre(String language, String genre) {
        List<Movie> movies = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(Queries.SELCETLANGGENREQUERY)) {
            statement.setString(1, language);
            statement.setString(2, genre);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Movie movie = new Movie();
                    movie.setMovieName(resultSet.getString("movie_name"));
                    movie.setLanguage(language);
                    movie.setFormat(resultSet.getString("format"));
                    movie.setMovieId(resultSet.getInt("movie_id"));
                    movie.setDuration(resultSet.getTime("duration").toLocalTime());
                    movie.setGenre(genre);
                    movies.add(movie);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error finding movies by language and genre", e);
        }
        return movies;
    }

    @Override
    public List<Movie> findByGenreFormat(String genre, String format) {
        List<Movie> movies = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(Queries.SELECTGENREFORMQUERY)) {
            statement.setString(1, genre);
            statement.setString(2, format);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Movie movie = new Movie();
                    movie.setMovieName(resultSet.getString("movie_name"));
                    movie.setLanguage(resultSet.getString("language"));
                    movie.setFormat(format);
                    movie.setMovieId(resultSet.getInt("movie_id"));
                    movie.setDuration(resultSet.getTime("duration").toLocalTime());
                    movie.setGenre(genre);
                    movies.add(movie);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error finding movies by genre and format", e);
        }
        return movies;
    }

    @Override
    public List<Movie> findByAnyProperty(String choice) {
        List<Movie> movies = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(Queries.SELECTLANGGENRESEARCH)) {
            statement.setString(1, "%" + choice + "%");
            statement.setString(2, choice);
            statement.setString(3, choice);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Movie movie = new Movie();
                    movie.setMovieName(resultSet.getString("movie_name"));
                    movie.setLanguage(resultSet.getString("language"));
                    movie.setFormat(resultSet.getString("format"));
                    movie.setMovieId(resultSet.getInt("movie_id"));
                    movie.setDuration(resultSet.getTime("duration").toLocalTime());
                    movie.setGenre(resultSet.getString("genre"));
                    movies.add(movie);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error finding movies by any property", e);
        }
        return movies;
    }

    @Override
    public List<String> findMovieNames(String language) {
        List<String> movieNames = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(Queries.SELECTLANGUAGE)) {
            statement.setString(1, language);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    movieNames.add(resultSet.getString("movie_name"));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error finding movie names by language", e);
        }
        return movieNames;
    }
}
