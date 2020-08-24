package com.inn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.inn.myapp.base.baserepository.impl.BaseRepositoryImpl;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.inn"} , repositoryBaseClass = BaseRepositoryImpl.class)
public class ApplicationStarter {

	
    public static void main(String[] args) {
		
    	SpringApplication.run(ApplicationStarter.class);
	}
    
    
}
