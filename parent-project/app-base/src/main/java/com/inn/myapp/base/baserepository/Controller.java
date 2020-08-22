package com.inn.myapp.base.baserepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inn.User;
import com.inn.UserRepository;


@RestController
@RequestMapping(path = "app")
public class Controller {

	
	@Autowired
	UserRepository repo;
	
	
	@PostMapping(path = "createUser" )
    public User create(User user) {
    	
    	return repo.save(user);
    }
    
    
    @GetMapping(path = "/get")
    public List<User> get() {
    	
    	return repo.findUserBy();
    }
}
