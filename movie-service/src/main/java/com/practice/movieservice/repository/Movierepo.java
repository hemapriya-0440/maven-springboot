package com.practice.movieservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.entities.Movies;
@Repository
public interface  Movierepo extends JpaRepository<Movies, Integer> {

}
