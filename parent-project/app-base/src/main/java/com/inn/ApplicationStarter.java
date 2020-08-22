package com.inn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inn.myapp.base.base.baserepository.impl.BaseRepositoryImpl;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.inn"} , repositoryBaseClass = BaseRepositoryImpl.class)
@RestController("app")
public class ApplicationStarter {

	
	@Autowired
	UserRepository repo;
	
    public static void main(String[] args) {
		
    	SpringApplication.run(ApplicationStarter.class);
	}
    
    @PostMapping(path = "createUser" , produces = MediaType.APPLICATION_JSON_VALUE )
    public User create(User user) {
    	
    	return repo.save(user);
    }
    
}
