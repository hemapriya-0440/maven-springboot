package com.practice.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.entities.Movies;
import com.practice.entities.user;
@Repository
public interface  Userrepo extends JpaRepository<user, Integer> {

	//user saveUserAndMovies(user usr, Movies mvie);

}
