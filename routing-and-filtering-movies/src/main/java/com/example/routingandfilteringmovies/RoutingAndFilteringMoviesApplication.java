package com.example.routingandfilteringmovies;

import com.example.routingandfilteringmovies.controller.MovieController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackageClasses = MovieController.class)
public class RoutingAndFilteringMoviesApplication {
	public static void main(String[] args) {
		SpringApplication.run(RoutingAndFilteringMoviesApplication.class, args);
	}

}
