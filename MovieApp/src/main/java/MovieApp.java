import java.time.LocalTime;
import java.util.List;

import com.movieapp.dao.MovieDaoImpl;
import com.movieapp.exceptions.MovieNotFoundException;
import com.movieapp.model.Movie;

public class MovieApp {

	public static void main(String[] args) {

		MovieDaoImpl movieDao = new MovieDaoImpl();

		// Adding a new movie
		Movie newMovie = new Movie();
		newMovie.setMovieName("Inception");
		newMovie.setLanguage("English");
		newMovie.setFormat("IMAX");
		newMovie.setGenre("Sci-Fi");
		newMovie.setDuration(LocalTime.of(2, 28, 0)); // 2 hours 28 minutes

		movieDao.addMovie(newMovie);
		System.out.println("Movie added: " + newMovie.getMovieName());

		// Retrieving all movies
		List<Movie> allMovies = movieDao.findAll();
		System.out.println("All Movies:");
		for (Movie movie : allMovies) {
			System.out.println(movie);
		}

		// Finding a movie by ID
		try {
			Movie movie = movieDao.findById(1); // assuming movie ID 1 exists
			System.out.println("Found Movie: " + movie.getMovieName());
		} catch (MovieNotFoundException e) {
			System.out.println(e.getMessage());
		}

		// Updating a movie
		try {
			movieDao.updateMovie(1, "Digital"); // assuming movie ID 1 exists
			System.out.println("Movie updated successfully.");
		} catch (MovieNotFoundException e) {
			System.out.println(e.getMessage());
		}

		// Deleting a movie
		try {
			movieDao.deleteMovie(1); // assuming movie ID 1 exists
			System.out.println("Movie deleted successfully.");
		} catch (MovieNotFoundException e) {
			System.out.println(e.getMessage());
		}

		// Finding movies by language
		List<Movie> englishMovies = movieDao.findByLanguage("English");
		System.out.println("English Movies:");
		for (Movie movie : englishMovies) {
			System.out.println(movie);
		}

		// Finding movies by genre
		List<Movie> sciFiMovies = movieDao.findByGenre("Sci-Fi");
		System.out.println("Sci-Fi Movies:");
		for (Movie movie : sciFiMovies) {
			System.out.println(movie);
		}

		// Finding movies by any property
		List<Movie> searchResults = movieDao.findByAnyProperty("Inception");
		System.out.println("Search Results for 'Inception':");
		for (Movie movie : searchResults) {
			System.out.println(movie);
		}

	}
}
