package fi.haagahelia.movieApp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import fi.haagahelia.movieApp.web.MovieController;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class MovieAppApplicationTests {

	@Autowired
	private MovieController controller;
	
	@Test
	public void contextLoands()throws Exception{
		assertThat(controller).isNotNull();
	}
	
	@Test
	void contextLoads() {
	}

}
