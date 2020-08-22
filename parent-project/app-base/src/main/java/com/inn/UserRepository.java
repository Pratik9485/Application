package com.inn;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inn.myapp.base.baserepository.BaseRepository;


@Repository
public interface UserRepository extends BaseRepository<User, Integer> {

	@Query("select u from User u")
	public List<User> findUserBy();

}
