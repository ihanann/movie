package fi.haagahelia.movieApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.movieApp.domain.Movie;
import fi.haagahelia.movieApp.domain.MovieRepository;

@SpringBootApplication
public class MovieAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(MovieRepository repository) {
		return (args) ->{
			Movie m1 = new Movie ("Titanic", "Cameron", "1997");
			Movie m2 = new Movie ("Hairspray", "Shankman", "2007");
			Movie m3 = new Movie ("The Menu", "Mylod", "2022");
	
		repository.save(m1);
		repository.save(m2);
		repository.save(m3);
		};
	}
}
