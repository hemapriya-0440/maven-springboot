package com.practice.userservice.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.practice.entities.user;
import com.practice.userservice.service1.UserService;

@RestController
public class UserController {
@Autowired 
private UserService service;
@RequestMapping(value="/users",method=RequestMethod.POST)
public ResponseEntity<user> save(@RequestBody user usr) {

	Boolean saved=service.saveuser(usr);
	URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saved).toUri();
	return ResponseEntity.created(location).build();
}
}