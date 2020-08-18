package com.practice.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class user {
	@Id
	@GeneratedValue
private int id;
private String name;
@ManyToMany(fetch = FetchType.LAZY,
cascade = CascadeType.ALL,mappedBy = "usr")
private List<Movies> mvies;
public List<Movies> getMvies() {
	return mvies;
}
public void setMvies(List<Movies> mvies) {
	this.mvies = mvies;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public user(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public user() {
	super();
	// TODO Auto-generated constructor stub
}
public void addMovie(Movies movies) {
	
}


}
