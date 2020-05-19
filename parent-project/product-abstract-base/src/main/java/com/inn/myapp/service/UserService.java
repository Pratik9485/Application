package com.inn.myapp.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inn.myapp.base.model.User;
import com.inn.myapp.repository.UserRepo;

@Service("UserService")
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public List<User> getAllActiveUser(){
		
		final List<User> finalUserResponseList = new ArrayList<>();
		Iterable<User> activeUser = userRepo.findAll();
		Iterator<User> iterator = activeUser.iterator();
		while(iterator.hasNext()) {
			finalUserResponseList.add(iterator.next());
		}
		return finalUserResponseList;
	}
}
