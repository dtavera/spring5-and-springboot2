package io.datajek.springbasics.movierecommmendersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		/*RecommenderImplementation recommender = new RecommenderImplementation(new CollaborativeFilter());
		String[] result = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));*/

		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		//Using constructor injection
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
		String[] result = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));

		//Using setter injection
		RecommenderImplementation2 recommender2 = appContext.getBean(RecommenderImplementation2.class);
		String[] result2 = recommender2.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result2));
	}

}
