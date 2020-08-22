package com.inn;

import org.springframework.stereotype.Repository;

import com.inn.myapp.base.baserepository.BaseRepository;


@Repository
public interface UserRepository extends BaseRepository<User, Integer> {

	

}
