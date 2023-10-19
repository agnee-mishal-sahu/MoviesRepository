package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.Entity.Movies;

public interface MoviesRepository  extends JpaRepository<Movies,Integer>{

}
