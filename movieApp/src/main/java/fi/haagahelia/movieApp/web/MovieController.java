package fi.haagahelia.movieApp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.haagahelia.movieApp.domain.Movie;
import fi.haagahelia.movieApp.domain.MovieRepository;

@Controller
public class MovieController {

	@Autowired
	private MovieRepository repository;
	
	@RequestMapping("/movielist")
	public String movieList(Model model) {
		model.addAttribute("movies", repository.findAll());
		return "movie";
	}
	
	@RequestMapping(value = "/add")
	public String addMovie(Model model) {
		model.addAttribute("movie", new Movie());
		return "addmovie";
	}
	
	@RequestMapping(value = "/save")
	public String save(Movie movie) {
		repository.save(movie);
		return "redirect:movielist";
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteMovie(@PathVariable("id") Long movieId, Model model) {
		repository.deleteById(movieId);
		return "redirect:../movielist";
	}
	
}
