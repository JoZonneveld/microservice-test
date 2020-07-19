package com.example.routingandfilteringmovies.controller;

import com.example.routingandfilteringmovies.models.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class MovieController {

    private List<Movie> movies = new ArrayList<>()  {
        {
            add(new Movie("Movie 1"));
            add(new Movie("Movie 2"));
            add(new Movie("Movie 3"));
        }
    };


    @RequestMapping(value = "/")
    public ResponseEntity<List<Movie>> getMovies() {
        return new ResponseEntity<>(this.movies, HttpStatus.OK);
    }
}
