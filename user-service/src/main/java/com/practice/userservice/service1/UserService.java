package com.practice.userservice.service1;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entities.user;
import com.practice.userservice.repository.Userrepo;


@Service
public class UserService{
	
@Autowired
private Userrepo repo;
public Boolean  saveuser(user request) {
	Boolean response=false;

	user usr=new user();
	usr.setId(request.getId());
	usr.setName(request.getName());
	usr.setMvies(request.getMvies());
	user usrs=repo.save(usr);
	if(usrs !=null) {
		response=true;
	}
	else {
		response=false;
	}
	return response;
	
}
public List<user> getbyid(int id) {
	List<user> list=repo.getById(id);
	list.forEach(usr -> {
		user usrs=new user();
		BeanUtils.copyProperties(usr,usrs);
	});
	return list;
	
}
}