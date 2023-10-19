package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Entity.Movies;
import com.cg.service.MoviesService;

@RestController
@RequestMapping("/movies")
public class MoviesController {

	@Autowired
	MoviesService ms;
	
	@PostMapping("/")
	public String addMovies(@RequestBody Movies movie) {
		return ms.addMovie(movie);
	}
	@GetMapping("/get")
	public List<Movies> getAllMovies(){
		return ms.getAll();
	}
	
}
