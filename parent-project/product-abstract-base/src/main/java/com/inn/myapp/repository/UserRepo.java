package com.inn.myapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inn.myapp.base.model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer>{

}
