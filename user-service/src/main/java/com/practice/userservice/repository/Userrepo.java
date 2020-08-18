package com.practice.userservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.entities.user;

@Repository
public interface  Userrepo extends JpaRepository<user, Integer> {
List<user> getById(int id);
	//user saveUserAndMovies(user usr, Movies mvie);

}
