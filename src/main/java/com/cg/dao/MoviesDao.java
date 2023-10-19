package com.cg.dao;

import java.util.List;

import com.cg.Entity.Movies;


public interface MoviesDao {
String addMovie(Movies movie);
List<Movies> getAll();

}
