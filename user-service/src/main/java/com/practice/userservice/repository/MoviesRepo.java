package com.practice.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.entities.Movies;
@Repository
public interface  MoviesRepo extends JpaRepository<Movies, Integer> {

	//user saveUserAndMovies(user usr, Movies mvie);

}
