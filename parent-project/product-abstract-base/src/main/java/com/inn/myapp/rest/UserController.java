package com.inn.myapp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inn.myapp.base.model.User;
import com.inn.myapp.service.UserService;

@RestController
@RequestMapping(path = "/User")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(path="/getAllActiveUsers")
	public List<User> getAllActiveUsers(){
		return userService.getAllActiveUser();
	}

}
