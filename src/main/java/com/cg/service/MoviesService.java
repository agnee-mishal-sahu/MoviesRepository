package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Entity.Movies;
import com.cg.dao.MoviesDao;
import com.cg.repository.MoviesRepository;

@Service
public class MoviesService implements MoviesDao {

	@Autowired
	MoviesRepository mr;
	
	public String addMovie(Movies movie) {
		mr.save(movie);
		return "Movies added....";
	}

	
	public List<Movies> getAll() {
		List<Movies> mlist=mr.findAll();
		return mlist;
	}
	

}
